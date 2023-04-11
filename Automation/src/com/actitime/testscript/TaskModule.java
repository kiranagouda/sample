package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class TaskModule extends BaseClass{
	@Test
	public void testCreateTask() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("CreateTask",true);
		FileLib f=new FileLib();
		String taskname = f.getExcelData("createtask",1, 2);
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNew().click();
		t.getNewtask().click();
		Thread.sleep(4000);
		t.getSelectCustomernameDD().click();
		t.getSelectcustomer().click();
		t.getSelectProjectDD().click();
		t.getSelectproject().click();
		t.getEntertaskname().sendKeys(taskname);
		t.getCreatetask().click();
		
}
}