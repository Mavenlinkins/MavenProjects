package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLead1 extends ProjectMethods{
	
	public FindLead1(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}
	
	//Passing value to the first name
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement elefname1;
	
	public FindLead1 typefnamee1(String fn1) {
		type( elefname1, fn1);
		return this;
	}
	
	
	
/*	//Passing value to the lead id field
		@FindBy(how=How.XPATH,using="(//label[contains(text(),'Lead ID:')]/following::input")
		private WebElement eleLeadid;
		
		public FindLead1 typeleadid(String leadid1) {
			type(eleLeadid, leadid1);
			return this;
		}*/
		
		//click on find lead button
	
		@FindBy(how=How.XPATH,using="(//button[contains(text(),'Find Leads')])")
		private WebElement eleFindlead;
	
		public FindLead1 clickfindlead() throws InterruptedException  {
			click(eleFindlead);
			Thread.sleep(4000);
			return this;
		}
	
		//click on resultgrid view values
		
				@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
				
				private WebElement eleResultgridview;
				
				public MergeLead2 clickresultgrid() {
					click(eleResultgridview);
					switchToWindow(0);
					return new MergeLead2(driver,test);
				}
				
				//click on resultgrid view values
				
				@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
				private WebElement eleResultgridview4;
				
				public MergeLead3 clickresultgrid4() {
					click(eleResultgridview4);
					switchToWindow(0);
					return new MergeLead3(driver,test);
				}
		
				
	//click on resultgrid view values
				
				@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
				private WebElement eleResultgridview6;
				
				public DeletePage1 clickresultgrid6() {
					click(eleResultgridview6);
					switchToWindow(0);
					return new DeletePage1(driver,test);
				}
				
				
				
				
		/*//click on resultgrid view values
		
		@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a")
		private WebElement eleResultgridview;
		
		public MergeLead2 clickresultgrid() {
			click(eleResultgridview);
			switchToWindow(0);
			return new MergeLead2(driver,test);
		}
		
		//click on resultgrid view values
		
				@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a")
				private WebElement eleResultgridview1;
				
				public MergeLead3 clickresultgrid1() {
					click(eleResultgridview1);
					switchToWindow(0);
					return new MergeLead3(driver,test);
				}
				
		
		
	    
        
		*/

	/*//Entering First Name
		@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
		private WebElement eleenterfirstname;
		
		public FindLead1 typefirstname(String firstname1) {
			type(eleenterfirstname, firstname1);
			return this;
		
		}
		
		
		//Click Find Leads
		@FindBy(how=How.XPATH,using="(//button[contains(text(),'Find Leads')])")
		private WebElement eleFindLead1;
		
		public FindLead1 clickFindLead1() {
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
		
	
			
	
	@FindBy(how=How.ID,using="username")
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
