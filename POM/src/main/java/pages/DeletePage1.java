package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DeletePage1 extends ProjectMethods{
	
	public DeletePage1(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		
		}
	
	
	//Clicking Delete button
	@FindBy(how=How.CLASS_NAME,using="subMenuButtonDangerous")
	private WebElement eledeleteb;
	
	public ViewLead clickdeletebutton1() {
		click(eledeleteb);
		return null;
		
	}

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
