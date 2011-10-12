// ============================================================================
//
// Copyright (C) 2006-2011 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.mdm.repository.ui.actions;

import org.apache.log4j.Logger;
import org.eclipse.jface.resource.ImageDescriptor;
import org.talend.commons.exception.BusinessException;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.mdm.repository.core.AbstractRepositoryAction;
import org.talend.mdm.repository.models.ContainerRepositoryObject;
import org.talend.mdm.repository.plugin.RepositoryPlugin;
import org.talend.mdm.repository.utils.EclipseResourceManager;
import org.talend.mdm.repository.utils.RepositoryResourceUtil;
import org.talend.repository.model.ERepositoryStatus;
import org.talend.repository.model.IProxyRepositoryFactory;

/**
 * DOC hbhong class global comment. Detailled comment
 */
public class SVNUnlockAction extends AbstractRepositoryAction {

    private static final ImageDescriptor ICON = EclipseResourceManager.getImageDescriptor(RepositoryPlugin.PLUGIN_ID,
            "/icons/unlock.gif"); //$NON-NLS-1$

    IProxyRepositoryFactory factory = CoreRuntimePlugin.getInstance().getProxyRepositoryFactory();

    private static Logger log = Logger.getLogger(SVNUnlockAction.class);

    /**
     * DOC hbhong SVNLockAction constructor comment.
     * 
     * @param text
     */
    public SVNUnlockAction() {
        super("Unlock");
        setImageDescriptor(ICON);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.mdm.repository.core.AbstractRepositoryAction#getGroupName()
     */
    @Override
    public String getGroupName() {

        return GROUP_EDIT;
    }

    @Override
    public void run() {
        for (Object obj : getSelectedObject()) {
            if (obj instanceof IRepositoryViewObject) {
                IRepositoryViewObject viewObj = (IRepositoryViewObject) obj;
                try {
                    factory.unlock(viewObj);
                } catch (PersistenceException e) {
                    log.error(e.getMessage(), e);
                } catch (BusinessException e) {
                    log.error(e.getMessage(), e);
                }
            }
        }
        commonViewer.refresh();
    }

    @Override
    public boolean isVisible(IRepositoryViewObject viewObj) {
        ERepositoryStatus status = factory.getStatus(viewObj);
        if (viewObj instanceof ContainerRepositoryObject)
            return false;
        if (status == ERepositoryStatus.DELETED)
            return false;
        if (RepositoryResourceUtil.isOpenedInEditor(viewObj))
            return false;
        return status == ERepositoryStatus.LOCK_BY_USER;
    }

}