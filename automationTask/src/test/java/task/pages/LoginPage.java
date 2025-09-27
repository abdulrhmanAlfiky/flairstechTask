package task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private final By userNameField = By.name("username");
    private final By passwordField = By.name("password");
    private final By loginButton = By.className("orangehrm-login-button");


    public WebElement getUserNameField(){return findElement(userNameField);}
    public WebElement getPasswordField(){return findElement(passwordField); }


    public void clickOnLoginButton(){findElement(loginButton).click();}
}
