package my.qaSchool.testcase.testcategories;

import my.qaSchool.testcase.TestBase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginPageTest extends TestBase{
	
	
	@BeforeMethod (groups = {"groupLQAS", "all", "mobile"})
	public void testInit() throws Exception {
		
	}
	
	@AfterMethod(alwaysRun = true, groups = {"groupLQAS", "all", "mobile"})
    public void afterClass() throws Exception {
		
    }
}
