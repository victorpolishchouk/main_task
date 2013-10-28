package my.qaSchool.pages.enterapp;

import my.qaSchool.pages.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage extends Page{
	
	public LoginPage(WebDriver webDriver) {
		super(webDriver);
	}
	
	@FindBy (how = How.ID, using = "usersettings")
	public WebElement ProfileSettings;
	
	public boolean isAvatarDisplayed(){
		return ProfileSettings.isDisplayed();
	}

	

	
}