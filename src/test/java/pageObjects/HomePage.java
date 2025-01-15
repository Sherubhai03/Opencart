package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")  WebElement Myaccount;
	@FindBy(xpath="//a[normalize-space()='Register']")  WebElement Register;
	@FindBy(linkText= "Login") WebElement login;
	
	public void clickMyAccount() {
		Myaccount.click();
	}
	
	public void clickRegister() {
		Register.click();
	}
	
	public void clicklogin() {
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
