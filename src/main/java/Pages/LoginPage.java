package Pages;

import Utils.PropertiesReader;
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by yzosin on 20-Nov-17.
 */
public class LoginPage extends BasePage {

    private static LoginPage instance;
    public static LoginPage Instance = (instance != null) ? instance : new LoginPage();
    //public static Logger logger = Logger.getLogger(BasePage.class);

    By loginLink = By.xpath(".//*[@id='user_login']/a");
    By username = By.xpath(".//input[contains(@name,'login')]");
    By password = By.xpath(".//input[contains(@name,'password')]");
    By loginButton = By.xpath(".//input[@type='submit']");
    By userLobbyLink = By.xpath(".//a[text()='Мій кабінет']");

    public void navigate() {
        open(PropertiesReader.getProperties().getProperty("URL"));
    }

    public void login() {
        logger.info("Clicking on Login link");
        clickOnElement(loginLink);
        logger.info("Entering username and password");
        setText(username, PropertiesReader.getProperties().getProperty("username"));
        setText(password, PropertiesReader.getProperties().getProperty("password"));
        clickOnElement(loginButton);
    }

    public void validateLogin() {
        logger.info("Validating user lobby link ");
        String validationText = findElement(userLobbyLink).getText();
        Assert.assertEquals("Text doesn't match the expected value:", "Мій кабінет",  validationText);
    }
}
