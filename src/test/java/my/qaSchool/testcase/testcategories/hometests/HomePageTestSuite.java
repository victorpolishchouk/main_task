package my.qaSchool.testcase.testcategories.hometests;

import my.qaSchool.testcase.testcategories.LoginPageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTestSuite extends LoginPageTest{
	
	@Test (groups = {"groupLQAS", "all", "mobile"})
	//TS 1.1
	public void enterAdminPageView(){
		Assert.assertTrue(home.isSiteLogoDisplayed());
	}
	
	
	
}
