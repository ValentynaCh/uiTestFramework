package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {
    private final String emailFieldXpath = "//input[@id = 'Email']";
    private final String passwordFieldXpath = "//input[@id = 'Password']";
    private final String loginButtonXpath = "//div[@class = 'buttons'] //input[@type = 'submit']";
    private final String errorLoginMessageXpath = "//div[@class = 'validation-summary-errors']";

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void setEmail(String email) {
        System.out.println(String.format("Set %s email", email));
        driver.findElement(By.xpath(emailFieldXpath)).sendKeys(email);
    }

    public void setPassword(String password) {
        System.out.println(String.format("Set %s password", password));
        driver.findElement(By.xpath(passwordFieldXpath)).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.xpath(loginButtonXpath)).click();
    }


    public String getErrorLoginMessage() {
        return driver.findElement(By.xpath(errorLoginMessageXpath)).getText();
    }
}