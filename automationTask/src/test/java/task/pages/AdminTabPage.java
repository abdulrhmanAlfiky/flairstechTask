package task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdminTabPage extends BasePage {

   private final By userRecords = By.xpath("//span[@class='oxd-text oxd-text--span' and contains(.,'Records Found')]");
   private final By addButton = By.xpath("//button[contains(@class,'oxd-button--secondary') and contains(.,'Add')]");



   public int getUserRecrords(){
       System.out.println(findElement(userRecords).getText());
       return extractNumberFromText(userRecords);
   }

   public void clickOnAddbutton(){findElement(addButton).click();}

}
