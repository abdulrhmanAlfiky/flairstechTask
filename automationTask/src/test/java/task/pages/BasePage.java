package task.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import task.driver.WebDriverHandling;

import java.time.Duration;
import java.util.List;

public class BasePage {
    int number;
    public BasePage(){}
    public WebElement findElement(By locator){
        FluentWait<WebDriver> wait = new FluentWait<>(WebDriverHandling.getWebDriver())
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class) ;
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        return WebDriverHandling.getWebDriver().findElement(locator) ;
    }

    public List<WebElement> findElements(By locator) {
        FluentWait<WebDriver> wait = new FluentWait<>(WebDriverHandling.getWebDriver())
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class) ;
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        return WebDriverHandling.getWebDriver().findElements(locator);
    }
    public int extractNumberFromText (By locator){
      return   number=Integer.parseInt(findElement(locator).getText().replaceAll("\\D+",""));

    }

}
