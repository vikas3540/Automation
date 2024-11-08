package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.SignUpPage;
import io.cucumber.java.en.*;
public class UserLoginSteps {
	 WebDriver driver;
	    SignUpPage signUpPage;
	    LoginPage loginPage;
	    HomePage homePage;
	    
    String testEmail = "vikas.user2@example.com";
    String testPassword = "Password123";
  
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
        loginPage = new LoginPage(driver);
    }

    @When("I enter the newly created Email and Password")
    
    public void iEnterTheNewlyCreatedEmailAndPassword() {
        loginPage.enterEmail(testEmail);
        loginPage.enterPassword(testPassword);
    }

    @And("I submit the login form")
    public void iSubmitTheLoginForm() {
        loginPage.clickLogin();
    }

    @Then("I should be logged into my account successfully")
    public void iShouldBeLoggedIntoMyAccountSuccessfully() {
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isConfrimationUserName());
        driver.quit();
    }
}