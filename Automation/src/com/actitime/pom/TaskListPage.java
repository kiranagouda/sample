package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomer;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustomerName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescription;
	
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomer;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustomerCreated;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProject;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class='projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement enterProjectName;
	
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement CustomerDD;
	
	@FindBy(xpath="//div[text()='HDFC_001' and @class='itemRow cpItemRow ']")
	private WebElement hdfc_001;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement enterProjectDescription;
	
	

	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createProject;
	
	
	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement newtask;
	
	@FindBy(xpath="(//div[@class='dropdownButton'])[15]")
	private WebElement selectCustomernameDD;
	
	@FindBy(xpath="//div[text()='- New Customer -' and @class='itemRow ']")
	private WebElement selectcustomer;
	
	@FindBy(xpath="(//div[text()='- Select Project -'])[1]")
	private WebElement selectProjectDD;
	
	@FindBy(xpath="//div[text()='- New Project -' and @class='itemRow ']")
	private WebElement selectproject;
	
	@FindBy(xpath="(//input[@placeholder='Enter task name' and @class='inputFieldWithPlaceholder'])[1]")
	private WebElement entertaskname;
	
	@FindBy(xpath="//div[text()='Create Tasks']")
	private WebElement createtask;
	
public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getAddNew() {
	return addNew;
}
public WebElement getNewCustomer() {
	return newCustomer;
}
public WebElement getEnterCustomerName() {
	return enterCustomerName;
}
public WebElement getEnterCustomerDescription() {
	return enterCustomerDescription;
}
public WebElement getSelectCustomerDD() {
	return selectCustomerDD;
}
public WebElement getOurCompany() {
	return ourCompany;
}
public WebElement getCreateCustomer() {
	return createCustomer;
}

public WebElement getActualCustomerCreated() {
	return actualCustomerCreated;
}

public WebElement getNewProject() {
	return newProject;
}

public WebElement getEnterProjectName() {
	return enterProjectName;
}

public WebElement getCustomerDD() {
	return CustomerDD;
}

public WebElement getHdfc_001() {
	return hdfc_001;
}

public WebElement getEnterProjectDescription() {
	return enterProjectDescription;
}

public WebElement getCreateProject() {
	return createProject;
}

public WebElement getNewtask() {
	return newtask;
}

public WebElement getSelectCustomernameDD() {
	return selectCustomernameDD;
}

public WebElement getSelectcustomer() {
	return selectcustomer;
}

public WebElement getSelectProjectDD() {
	return selectProjectDD;
}

public WebElement getSelectproject() {
	return selectproject;
}

public WebElement getEntertaskname() {
	return entertaskname;
}

public WebElement getCreatetask() {
	return createtask;
}

}










