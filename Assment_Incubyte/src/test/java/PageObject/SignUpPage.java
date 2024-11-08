package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    
	WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstname") 
    WebElement firstName;
    
    @FindBy(id = "lastname") 
    WebElement lastName;
    
    @FindBy(id = "email_address")
    WebElement emailAddress;
    
    @FindBy(id = "password")
    WebElement password;
    
    @FindBy(id = "password-confirmation")
    WebElement confirmPassword;
    
    @FindBy(css = "button[title='Create an Account']")
    WebElement signUpButton;

    public void enterFirstName(String fName) 
    { 
    	firstName.sendKeys(fName);
    	}
    
    public void enterLastName(String lName) 
    { 
    	lastName.sendKeys(lName); 
    	}
    
    public void enterEmail(String email)
    { 
    	emailAddress.sendKeys(email); }
    
    public void enterPassword(String pass) 
    {
    	password.sendKeys(pass);
    	}
    
    public void confirmPassword(String pass)
    { 
    	confirmPassword.sendKeys(pass);
    	}
    public void submitSignUp() 
    { 
    	signUpButton.click(); }
}

