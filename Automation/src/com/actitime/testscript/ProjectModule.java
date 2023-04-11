package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class ProjectModule extends BaseClass{
	
	@Test
	public void testProjectModule() throws EncryptedDocumentException, IOException, InterruptedException {
	Reporter.log("CreateProject",true);
	FileLib f=new FileLib();
	String prjName = f.getExcelData("createproject",1, 3);
	String prjDescp = f.getExcelData("createproject", 1, 4);
	HomePage h=new HomePage(driver);
	h.setTaskTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNew().click();
	t.getNewProject().click();
	t.getEnterProjectName().sendKeys(prjName);
	t.getCustomerDD().click();
	Thread.sleep(4000);
	t.getHdfc_001().click();
t.getEnterProjectDescription().sendKeys(prjDescp);
t.getCreateProject().click();
}
}