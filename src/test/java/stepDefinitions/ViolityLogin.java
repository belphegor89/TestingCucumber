package stepDefinitions;

import Pages.BasePage;
import Pages.LoginPage;
import Utils.DriverManager;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by yzosin on 20-Nov-17.
 */
public class ViolityLogin {

    LoginPage loginPage = LoginPage.Instance;

    @Given("^user is on Violity home page$")
    public void userIsOnViolityHomePage() {
        loginPage.navigate();
    }

    @When("^user clicks on login link$")
    public void userClicksOnLoginLink() {
        loginPage.login();
    }

    @Then("^validate user icon is displayed$")
    public void userIconIsDisplayed() {
        loginPage.validateLogin();
    }

    @After
    public static void endTest() {
        BasePage.driver.quit();
        DriverManager.closeDriver();
    }
}
