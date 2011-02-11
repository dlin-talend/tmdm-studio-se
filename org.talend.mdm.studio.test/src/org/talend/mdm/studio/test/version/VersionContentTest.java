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
package org.talend.mdm.studio.test.version;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotText;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.talend.mdm.studio.test.TalendSWTBotForMDM;

/**
 * 
 * DOC rhou class global comment. Detailled comment
 * 
 * 
 * 
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class VersionContentTest extends TalendSWTBotForMDM {

    private SWTBotTreeItem versionParentItem;

    private SWTBotTreeItem versionItem;

    @Before
    public void runBeforeEveryTest() {
        versionParentItem = serverItem.getNode("Version");
        versionParentItem.expand();

    }

    private void init() {
        versionParentItem.contextMenu("New").click();
        SWTBotShell newspShell = bot.shell("New Version");
        newspShell.activate();
        SWTBotText text = bot.textWithLabel("Enter a Name for the New Instance");
        text.setText("TestVersion");
        sleep();
        bot.button("OK").click();
        bot.activeEditor().save();
        sleep();
        versionItem = versionParentItem.getNode("TestVersion");
        Assert.assertNotNull(versionItem);
        versionItem.doubleClick();
        sleep(2);
    }

    @After
    public void runAfterEveryTest() {

    }

    @Test
    public void setDescriptionTest() {
        init();
        String des = "This is a Version";
        bot.textWithLabel("Description").setText(des);
        Assert.assertEquals(des, bot.textWithLabel("Description").getText());
    }

    @Test
    public void setEntityIDTest() {
        bot.textWithLabel("Default Revision ID").setText("r1");
        bot.buttonWithTooltip("Add").click();
        // String pro = "";
        // bot.styledText().setText(pro);
        // Assert.assertEquals(pro, bot.styledText().getText());
    }

    @Test
    public void setSOIDTest() {
        // TODO:need further task.
        String pro = "";
        bot.ccomboBox().setSelection("SearchTemplate");
        bot.button("Execute Procedure").click();

        versionParentItem.getNode("TestVersion").contextMenu("Delete").click();
        sleep();
        bot.button("OK").click();
        sleep();
    }
}