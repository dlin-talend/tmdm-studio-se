package com.amalto.workbench.actions;

import java.util.Iterator;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.xsd.XSDComplexTypeDefinition;

import com.amalto.workbench.editors.DataModelMainPage;
import com.amalto.workbench.image.EImage;
import com.amalto.workbench.image.ImageCache;
import com.amalto.workbench.utils.Util;

public class XSDEditComplexTypeAction extends UndoAction {

    public XSDEditComplexTypeAction(DataModelMainPage page) {
        super(page);
        setImageDescriptor(ImageCache.getImage(EImage.EDIT_OBJ.getPath()));
        setText("Edit a Complex Type");
        setToolTipText("Edit a Complex Type which can be referred to by Elements or Entities");
        setDescription(getToolTipText());
    }

    public IStatus doAction() {
        try {
            ISelection selection = page.getTreeViewer().getSelection();
            IStructuredContentProvider provider = (IStructuredContentProvider) page.getSchemaContentProvider();
            XSDComplexTypeDefinition decl = (XSDComplexTypeDefinition) ((IStructuredSelection) selection).getFirstElement();

            String oldName = decl.getName();
            InputDialog id = new InputDialog(page.getSite().getShell(), "Edit Complex Type", "Enter a new Name for the Entity",
                    oldName, new IInputValidator() {

                        public String isValid(String newText) {
                            if ((newText == null) || "".equals(newText))
                                return "The Complex Type Name cannot be empty";

                            if (Pattern.compile("^\\s+\\w+\\s*").matcher(newText).matches()
                                    || newText.trim().replaceAll("\\s", "").length() != newText.trim().length())
                                return "The name cannot contain the empty characters";

                            EList list = schema.getTypeDefinitions();
                            for (Iterator iter = list.iterator(); iter.hasNext();) {
                                Object d = iter.next();
                                if (d instanceof XSDComplexTypeDefinition) {
                                    XSDComplexTypeDefinition type = (XSDComplexTypeDefinition) d;
                                    if (type.getName().equals(newText.trim()))
                                        return "This Complex Type already exists";
                                }
                            }
                            return null;
                        };
                    });

            id.setBlockOnOpen(true);
            int ret = id.open();
            if (ret == Dialog.CANCEL) {
                return Status.CANCEL_STATUS;
            }
            decl.setName(id.getValue().trim());

            Util.updateComplexType(page.getSite(), decl, provider);
            page.refresh();
            page.markDirty();

        } catch (Exception e) {
            e.printStackTrace();
            MessageDialog.openError(page.getSite().getShell(), "Error",
                    "An error occured trying to edit an Entity: " + e.getLocalizedMessage());
            return Status.CANCEL_STATUS;
        }

        return Status.OK_STATUS;
    }
}
