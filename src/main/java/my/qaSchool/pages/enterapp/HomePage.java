package my.qaSchool.pages.enterapp;

import my.qaSchool.pages.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends Page{

	public HomePage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (how = How.CLASS_NAME, using = "headermain inside")
	public WebElement siteLogo;
	
	/*@FindBy (how = How.ID, using = "loginbtn")
	public WebElement signInButton;*/
	
	/*@FindBy (how = How.CLASS_NAME, using = "form-label")
	public WebElement signInMenu;*/
	
	@FindBy (how = How.NAME, using = "username")
	public WebElement loginTextBox;
	
	@FindBy (how = How.NAME, using = "password")
	public WebElement passwordTextBox;
	
	@FindBy (how =  How.ID, using = "loginbtn")
	public WebElement loginButton;
	
	public boolean isSiteLogoDisplayed(){
		return siteLogo.isDisplayed();
	}
	
	public LoginPage loginAdminPage(String loginName, String password){
	//	signInButton.click();
		WebDriverWait wait = new WebDriverWait(webDriver, 10);
		wait.until(ExpectedConditions.visibilityOf(siteLogo));
		loginTextBox.clear();
		passwordTextBox.clear();
		loginTextBox.sendKeys(loginName);
		passwordTextBox.sendKeys(password);
		loginButton.click();
		return PageFactory.initElements(webDriver, LoginPage.class);
	}


}
