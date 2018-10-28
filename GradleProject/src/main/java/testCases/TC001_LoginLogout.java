package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_LoginLogout extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName = "Login Logout";
		testNodes = "Login";
		testDescription = "Login into Leaftap";
		category = "smoke";
		authors = "koushik";
		dataSheetName = "TC001";
	}
	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String password) {
		/*LoginPage lp = new LoginPage();
		lp.enterUserName("");
		lp.enterPassword("");*/
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(password)
		.clickLogin()
		.clickLogOut();

	}




}






