package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLead extends ProjectMethods{
	
	public FindLead(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}
	
		

	//Entering First Name
		@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
		private WebElement eleenterfirstname;
		
		public FindLead typefirstname(String firstname1) {
			type(eleenterfirstname, firstname1);
			return this;
		
		}
		
		
		//Click Find Leads
		@FindBy(how=How.XPATH,using="(//button[contains(text(),'Find Leads')])")
		private WebElement eleFindLead1;
		
		public FindLead clickFindLead1() {
			click(eleFindLead1);
			
			return this;
		}
			
		
		//Click on First Resulting Lead
		
		@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)")
		private WebElement eleFirstResultingLead;
		
		public ViewLead1 clickFirstResultingLead() {
			click(eleFirstResultingLead);
			return new ViewLead1(driver,test);
		}
		
	
			
	
	/*@FindBy(how=How.ID,using="username")
	private WebElement eleUserName;
	
	public ViewLead typeUserName(String username) {
		type(eleUserName, username);
		return this;
	}
	
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;
	
	public ViewLead typePassword(String password) {
		type(elePassword, password);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogin;
	
	public HomePage clickLogin() {
		click(eleLogin);
		return new HomePage();
	}
	
	public void clickLogin1() {
		click(locateElement("xpath", "//input[@value='Login']"));
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
