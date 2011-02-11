package com.amalto.workbench.dialogs;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import com.amalto.workbench.widgets.composites.TextboxListStringContentComposite;

public class SimpleListStringContentDialog extends Dialog {

    private TextboxListStringContentComposite compInfos;

    private String[] infos = new String[0];

    private String label = "";

    private String title = "";

    public SimpleListStringContentDialog(Shell parentShell, String title, String label, String[] initInfos) {
        super(parentShell);

        if (initInfos != null)
            this.infos = initInfos;

        if (label != null)
            this.label = label;

        if (title != null)
            this.title = title;
    }

    @Override
    protected Control createDialogArea(Composite parent) {

        parent.getShell().setText(title);

        Composite container = (Composite) super.createDialogArea(parent);
        final GridLayout gridLayout = new GridLayout();
        gridLayout.marginWidth = 0;
        gridLayout.marginHeight = 0;
        container.setLayout(gridLayout);

        compInfos = new TextboxListStringContentComposite(container, SWT.NONE, label);
        compInfos.setInfos(infos);
        compInfos.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        return container;
    }

    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }

    @Override
    protected Point getInitialSize() {
        return new Point(360, 300);
    }

    protected int getShellStyle() {
        return super.getShellStyle() | SWT.MIN | SWT.MAX | SWT.RESIZE;
    }

    @Override
    protected void okPressed() {
        infos = compInfos.getInfos();
        super.okPressed();
    }

    public String[] getInfos() {
        return infos;
    }
}