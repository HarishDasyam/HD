package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{
	public HomePage() {
		PageFactory.initElements(driver, this);		
	}
	// Page Factory @FindBy -> similar to your locateElement
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit") WebElement eleLogOut;
	
	// Click Logout Button
	 public LoginPage clickLogOut() {
		 click(eleLogOut);
		 return new LoginPage();
	 }
	
}






