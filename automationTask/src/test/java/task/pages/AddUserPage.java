package task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddUserPage extends BasePage{

    private final By selector = By.cssSelector(".oxd-select-text--after");
    private final By RoleTypeESS = By.xpath("//div[@role='option' and .//span[normalize-space(text())='ESS']]");
    private final By enabledStatus = By.xpath("//div[@role='option' and .//span[normalize-space(text())='Enabled']]");
    private final By employeeNameField = By.xpath("//label[text()='Employee Name']/following::input[1]");
    private final By userNameField = By.xpath("//label[normalize-space(text())='Username']/parent::div/following-sibling::div//input");
    private final By passwordField = By.xpath("//label[normalize-space(text())='Password']/parent::div/following-sibling::div//input");
    private final By confirmPasswordField = By.xpath("//label[normalize-space(text())='Confirm Password']/parent::div/following-sibling::div//input");
    private final By selectEmployeeName = By.xpath("(//div[@role='option'])[1]");
    private final By selectEmployeeList = By.xpath("//div[@role='listbox']");
    private final By saveButton = By.className("orangehrm-left-space");


    public WebElement getEmployeeNameField(){return findElement(employeeNameField);}
    public WebElement getUserNameField(){return findElement(userNameField);}
    public WebElement getPasswordField(){return findElement(passwordField);}
    public WebElement getConfirmPasswordField(){return findElement(confirmPasswordField);}
    public WebElement getSelectEmployeeName(){return findElement(selectEmployeeName);}
//    public By getSelectEmployeeNameBy(){return selectEmployeeName;}
    public List<WebElement> getSelectEmpployeeList(){return findElements(selectEmployeeList);}
    public void clickOnEmployeeNameField(){findElement(employeeNameField).click();}
    public void clickOnUserRoleSelector(){findElements(selector).get(0).click();}
    public void clickOnStatusSelector(){findElements(selector).get(1).click();}
    public void clickOnESSRoleType(){findElement(RoleTypeESS).click();}
    public void clickOnEnabledStatus(){findElement(enabledStatus).click();}
    public void clickOnSelectEmplyeeName (){findElement(selectEmployeeName).click();}
    public void clickOnSaveButton(){findElement(saveButton).click();}




}
