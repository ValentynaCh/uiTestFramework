package ui.pages;

import ch.qos.logback.classic.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

public class SignInPage extends BasePage {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(SignInPage.class);
    private final String emailFieldXpath = "//input[@id = 'Email']";
    private final String passwordFieldXpath = "//input[@id = 'Password']";
    private final String loginButtonXpath = "//div[@class = 'buttons'] //input[@type = 'submit']";
    private final String errorLoginMessageXpath = "//div[@class = 'validation-summary-errors']";

    public SignInPage(WebDriver webDriver) {
        super(webDriver);
    }


    public void setEmail(String email) {
        logger.info("Set {} email", email);
        driver.findElement(By.xpath(emailFieldXpath)).sendKeys(email);
    }

    public void setPassword(String password) {
        logger.info("Set {} password", password);
        driver.findElement(By.xpath(passwordFieldXpath)).sendKeys(password);
    }

    public void clickOnLoginButton() {
        logger.info("Click on Login button");
        driver.findElement(By.xpath(loginButtonXpath)).click();
    }

    public String getErrorLoginMessage() {
        logger.info("Get error login message");
        return driver.findElement(By.xpath(errorLoginMessageXpath)).getText();
    }
}
