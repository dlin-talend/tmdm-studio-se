// ============================================================================
//
// Copyright (C) 2006-2017 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.mdm.repository.ui.wizards.imports.viewer;

import com.amalto.workbench.exadapter.IExAdapter;
import com.amalto.workbench.models.TreeObject;

/**
 * created by HHB on 2015-5-15 Detailled comment
 *
 */
public interface ITreeObjectCheckTreeViewerExAdapter extends IExAdapter<TreeObjectCheckTreeViewer> {

    String getWorkflowgTreeObjectName(TreeObject treeObject);
}
