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

package org.talend.mdm.studio.test.eventmanagement.process.plugins;

import java.io.IOException;
import java.net.URISyntaxException;

import org.eclipse.swtbot.eclipse.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.talend.mdm.studio.test.TalendSWTBotForMDM;
import org.talend.mdm.studio.test.util.Util;

/**
 * @author
 * 
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class XsltPluginTest extends TalendSWTBotForMDM {
	private SWTBotTreeItem processParentNode;

	private static final long ONE_MINUTE_IN_MILLISEC = 60000;

	private String testValue = "<Update><UserName>administrator</UserName><Source>genericUI</Source><TimeInMillis>1303979134937</TimeInMillis><OperationType>UPDATE</OperationType><RevisionID>null</RevisionID><DataCluster>DStar</DataCluster><DataModel>DStar</DataModel><Concept>Agency</Concept><Key>1</Key></Update>";

	private SWTBotTreeItem eventManagementItem;

	private String expectedResult = "";;

	@Before
	public void runBeforeEveryTest() {
		eventManagementItem = serverItem.getNode("Event Management");
		eventManagementItem.expand();
		init();
	}

	@After
	public void runAfterEveryTest() {
		bot.activeEditor().close();
	}

	private void init() {
		processParentNode = eventManagementItem.getNode("Process [HEAD]");
		// for normal process
		processParentNode.contextMenu("Import").click();
		bot.shell("Import Objects").activate();
		bot.radio("Select archive file:").click();
		try {
			bot.text(1)
					.setText(
							Util.getFileFromCurrentPluginSampleFolder(
									"DStar_AgentCommission--2.0.zip")
									.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		sleep(10);
		bot.button("Finish").click();
		bot.waitUntil(
				Conditions.shellCloses(bot.shell("Progress Information")),
				ONE_MINUTE_IN_MILLISEC * 10);
	}

	@Test
	public void xsltPluginTest() {
		processParentNode.expand().getNode("Runnable_Agent").doubleClick();
		sleep(2);
		bot.buttonWithTooltip("Execute...").click();
		bot.comboBoxWithLabel("Input Variables").setSelection("_DEFAULT_");
		bot.comboBoxWithLabel("Content Type(*)").setSelection("text/xml");
		bot.textWithLabel("Value").setText(testValue);
		bot.buttonWithTooltip("Add").click();
		bot.button("OK").click();
		// TODO Check:
		bot.comboBox().setSelection("item_pk");
		// Assert.assertEquals(bot.text().getText(), "");
		bot.comboBox().setSelection("output");
		// Assert.assertEquals(bot.text().getText(), expectedResult);
		bot.button("Close").click();
		bot.activeEditor().close();

	}

}