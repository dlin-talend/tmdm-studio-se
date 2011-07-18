// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006-2011 Talend �C www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================
package org.talend.mdm.workbench.serverexplorer.core;

import org.talend.commons.ui.runtime.image.IImage;
import org.talend.core.repository.IExtendRepositoryNode;
import org.talend.repository.model.RepositoryNode;

/**
 * DOC hbhong class global comment. Detailled comment <br/>
 * 
 */
public class ServerDefRepositoryNode implements IExtendRepositoryNode {

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.repository.IExtendRepositoryNode#getNodeImage()
     */
    @Override
    public IImage getNodeImage() {
        return ServerDefImage.BEAN_ICON;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.repository.IExtendRepositoryNode#getOrdinal()
     */
    @Override
    public int getOrdinal() {
        return 100;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.repository.IExtendRepositoryNode#getChildren()
     */
    @Override
    public Object[] getChildren() {
        return new RepositoryNode[0];
    }

}