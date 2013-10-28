package my.qaSchool.testcase.testcategories.logintests;

import my.qaSchool.pages.enterapp.LoginPage;
import my.qaSchool.testcase.testcategories.LoginPageTest;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTestSuite extends LoginPageTest{
	
	@Test (groups = {"groupLQAS", "all", "mobile"})
	//TS 2.1
	public void enterAdminPageView() throws InterruptedException{
		LoginPage login = home.loginAdminPage(getUsermail(), getPassword());
		//Thread.sleep(4000); to see that it works
		Assert.assertTrue(login.isAvatarDisplayed());
	}
	
	
	
}
