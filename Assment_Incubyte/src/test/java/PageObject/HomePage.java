package PageObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   @FindBy(css = "div.message-success.success.message") 
    //@FindBy(xpath="div[text()='Thank you for registering with Main Website Store.']")
    WebElement confirmationMessage;

    public boolean isConfirmationMessageDisplayed() 
    {
    	return confirmationMessage.isDisplayed();
    }
    
    @FindBy(xpath="//span[text()='Welcome, vikas Gangwar!']")
    WebElement confirmationUserName;
    
    public boolean isConfrimationUserName() {
    	return confirmationUserName.isDisplayed();
    }
}
