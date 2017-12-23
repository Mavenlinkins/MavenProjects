package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DeletePage extends ProjectMethods{
	
	public DeletePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		
		}
	
	
	//Clicking Find Lead
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLead;
	
	public FindLead1 clickFindLead2() {
		click(eleFindLead);
		return new FindLead1(driver, test);
		
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
