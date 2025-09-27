package task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddUserPage extends BasePage{

    private final By selector = By.cssSelector(".oxd-select-text--after");
    private final By RoleTypeESS = By.xpath("//div[@role='option' and .//span[normalize-space(text())='ESS']]");
    private final By enabledStatus = By.xpath("//div[@role='option' and .//span[normalize-space(text())='Enabled']]");
    private final By employeeNameField1 = By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']");
    private final By employeeNameField2 = By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--focus']");
    private final By userNameField = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By passwordField = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
    private final By confirmPasswordField = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
    private final By selectEmployeeName = By.xpath("//div[@role='option' and .//span[normalize-space(text())='A8DCo 4Ys 010Z']]");
    private final By saveButton = By.className("orangehrm-left-space");


    public WebElement getEmployeeNameField2(){return findElement(employeeNameField2);}
    public WebElement getUserNameField(){return findElement(userNameField);}
    public WebElement getPasswordField(){return findElement(passwordField);}
    public WebElement getConfirmPasswordField(){return findElement(confirmPasswordField);}
    public WebElement getSelectEmployeeName(){return findElement(selectEmployeeName);}
    public void clickOnEmployeeNameField1(){findElement(employeeNameField1).click();}
    public void clickOnUserRoleSelector(){findElements(selector).get(0).click();}
    public void clickOnStatusSelector(){findElements(selector).get(1).click();}
    public void clickOnESSRoleType(){findElement(RoleTypeESS).click();}
    public void clickOnEnabledStatus(){findElement(enabledStatus).click();}
    public void clickOnSelectEmplyeeName (){findElement(selectEmployeeName).click();}
    public void clickOnSaveButton(){findElement(saveButton).click();}




}
