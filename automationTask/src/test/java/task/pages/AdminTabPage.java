package task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdminTabPage extends BasePage {

   private final By userRecords = By.xpath("//span[@class='oxd-text oxd-text--span' and contains(.,'Found')]");
   private final By addButton = By.xpath("//button[contains(@class,'oxd-button--secondary') and contains(.,'Add')]");
   private final By searchField = By.xpath("//div[@class='']//input[@class='oxd-input oxd-input--active']");
   private final By searchButton = By.className("orangehrm-left-space");
   private final By deleteButton = By.className("bi-trash");
   private final By confirmDelelteButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");




   public int getUserRecrords(){return extractNumberFromText(userRecords);}
   public WebElement getSearchField(){return findElement(searchField);}
   public void clickOnAddbutton(){findElement(addButton).click();}
   public void clickOnSearchButton(){findElement(searchButton).click();}
   public void clickOnDeleteButton(){findElement(deleteButton).click();}
   public void clickOnConfirmDeleteButton(){findElement(confirmDelelteButton).click();}


}
