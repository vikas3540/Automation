package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email") 
    WebElement loginEmail;
    
    @FindBy(id = "pass") 
    WebElement loginPassword;
    
    @FindBy(id = "send2")
    WebElement loginButton;

    public void enterEmail(String email) 
    { 
    	loginEmail.sendKeys(email);
    }
    public void enterPassword(String pass)
    { 
    	loginPassword.sendKeys(pass);
    }
    public void clickLogin() 
    { 
    	loginButton.click(); 
    }
	
		

}

