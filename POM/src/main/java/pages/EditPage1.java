package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditPage1 extends ProjectMethods{
	
	public EditPage1(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		
		}
	
	
	//Change the company name
	
		@FindBy(how=How.ID,using="updateLeadForm_companyName")
		private WebElement elecompanyName;
		
		public EditPage1 typecompanyName(String companyname) {
			type(elecompanyName, companyname);
			return this;
			
		}
		

		//Click Update button
		
		@FindBy(how=How.CLASS_NAME,using="smallSubmit")
		private WebElement eleupdatebutton;
		
		public ViewLead2 updatebutton() {
			click(eleupdatebutton);
			return new ViewLead2(driver,test);
			
		}

		
		
		
	/*	//Confirm the changed name appears
			
		@FindBy(how=How.ID,using="viewLead_companyName_sp")
		private WebElement eleupdatedname;

		public EditPage Verifycompanyname(String companyname) {
			type(eleupdatedname, companyname);
			return new EditPage();*/
		}
		
	
	/*@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	public EditPage typeCompanyName(String CompanyName) {
		type(eleCompanyName, CompanyName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefirstName;
	
	public EditPage typefirstName(String firstName) {
		type(elefirstName, firstName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelastName;
	
	public EditPage typelastName(String lastName) {
		type(elefirstName, lastName);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement elesubmit;
	
	public ViewLead createleadbutton() {
		click(elesubmit);
		return new ViewLead();
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


