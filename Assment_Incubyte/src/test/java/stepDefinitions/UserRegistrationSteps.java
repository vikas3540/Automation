package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.SignUpPage;
import io.cucumber.java.en.*;

public class UserRegistrationSteps {

    WebDriver driver;
    SignUpPage signUpPage;
    HomePage homePage;

    String testEmail = "vikas.user9@example.com";
    String testPassword = "Password123";
   
    @Given("I am on the Create New Customer Account page")
    public void iAmOnTheCreateNewCustomerAccountPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        signUpPage = new SignUpPage(driver);
    }

    @When("I enter First Name, Last Name, Email, Password, and Confirm Password")
    public void iEnterAccountDetails() {
        signUpPage.enterFirstName("vikas");
        signUpPage.enterLastName("Gangwar");
        signUpPage.enterEmail(testEmail);
        signUpPage.enterPassword(testPassword);
        signUpPage.confirmPassword(testPassword);
    }

    @And("I submit the sign-up form")
    public void iSubmitTheSignUpForm() {
        signUpPage.submitSignUp();
    }

    @Then("I should see a confirmation message")
    public void iShouldSeeAConfirmationMessage() {
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isConfirmationMessageDisplayed());
        driver.quit();
    }
}
