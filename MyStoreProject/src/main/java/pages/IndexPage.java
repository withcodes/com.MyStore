package pages;

  	

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.BaseClass;

public class IndexPage extends BaseClass {
	
	public IndexPage() 
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//img[@src='/static/images/home/logo.png']")
	private WebElement logo_image;  
	
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement signUp_Login_Btn;
	
	@FindBy(xpath = "//div[@class='signup-form']")
	private WebElement signUpTxt;
	
	@FindBy (xpath = "//input[@name='name']")
	private WebElement sigUpName;
	
	
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	private WebElement signUpEmail;
	
	@FindBy(xpath = "//button[@data-qa='signup-button']")
	private WebElement signUpBtn;
	
	@FindBy(xpath = "//div[@class='login-form']/h2[@class='title text-center']/child::b")
	private WebElement account_inforamtion_text;
	
	@FindBy(xpath = "//label[@for='id_gender1']")
	private WebElement gender;
	
	@FindBy(xpath = "//input[@id='name']")
	private WebElement verify_name;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement vrify_email;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement  fill_password;
	
	@FindBy(xpath = "//select[@id='days']")
	private WebElement select_day;
	
	@FindBy(xpath = "//select[@id='months']")
	private WebElement select_month;
	
	@FindBy(xpath = "//select[@id='years']")
	private WebElement select_year;
	
	@FindBy(xpath = "//input[@id='newsletter']")
	private WebElement checkbox_newsletter;
	
	@FindBy(xpath = "//input[@id='optin']")
	private WebElement checkbox_spacialoffer;
	
	@FindBy(xpath = "//form[@action='/signup']/child::input[1]")
	private WebElement first_name;
	
	@FindBy(xpath = "//input[@data-qa='last_name']")
	private WebElement last_name;
	
	@FindBy(xpath = "//input[@data-qa='company']")
	private WebElement company_name;
	
	@FindBy(xpath = "//input[@data-qa='address2']")
	private WebElement address2;
	
	
	
	public void verifyurl()
	{
		String expected = getReadData("url");
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
		System.out.println(" Url Match exact");
	}
	
	public void verify_logo()
	{
		Assert.assertTrue(logo_image.isDisplayed(),"Logo is not displaed");
	}
	
	public void click_on_sign_up_login_btn()
	{
		waitforclick(signUp_Login_Btn);
	}
	
	
	public void verify_sign_uptext()
	{
		String expected = getReadData("SignUpText");
		String actual = signUpTxt.getText();
		Assert.assertEquals(actual, expected);
		System.out.println("SignUpText Present");
	}
	
	public void fill_signup_name()
	{
	    String user_name = getReadData("name");
	    signUpTxt.sendKeys(user_name);
	    
	}
	
	public void fill_signup_email()
	
	{
		String  user_email = getReadData("email");
		signUpEmail.sendKeys(user_email);
		
	}
	
	public void click_on_signup_button()
	{
		waitforclick(signUpBtn);
	}
	
	

	
}
