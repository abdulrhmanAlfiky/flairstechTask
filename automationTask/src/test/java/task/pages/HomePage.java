package task.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    private final By adminTab = By.className("oxd-main-menu-item--name");


    public void clickOnAdminTab(){findElement(adminTab).click();}
}
