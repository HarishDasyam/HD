package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Page Factory @FindBy -> similar to your locateElement
	@FindBy(how = How.ID, using = "username") WebElement eleUserName;
	
	@FindBy(how = How.ID, using = "password") WebElement elePassword;
	
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit") WebElement eleLogin;
	
	// Enter user name
	public LoginPage enterUserName(String uName) {
//		 WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, uName);
		return this;
	}
	// Enter Password
	public LoginPage enterPassword(String password) {
		type(elePassword, password);
		return this;
	}
	// Click Login Button
	 public HomePage clickLogin() {
		 click(eleLogin);
		/* 
		 * HomePage hp = new HomePage();
		 return hp;
		 */
		 return new HomePage();
	 }
	
}






