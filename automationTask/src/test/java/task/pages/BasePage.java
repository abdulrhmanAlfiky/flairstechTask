package task.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import task.driver.WebDriverHandling;

import java.time.Duration;
import java.util.List;

public class BasePage {
    int number;
    public BasePage(){}
    public WebElement findElement(By locator){
        WebDriverWait wait = new WebDriverWait(WebDriverHandling.getWebDriver(), Duration.ofSeconds(35));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return WebDriverHandling.getWebDriver().findElement(locator) ;
    }

    public List<WebElement> findElements(By locator) {
        WebDriverWait wait = new WebDriverWait(WebDriverHandling.getWebDriver(), Duration.ofSeconds(35));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        return WebDriverHandling.getWebDriver().findElements(locator);
    }
    public int extractNumberFromText (By locator){
      return   number=Integer.parseInt(findElement(locator).getText().replaceAll("\\D+",""));

    }

    public static void waitUntilPageIsLoaded() {
        WebDriverWait wait = new WebDriverWait(WebDriverHandling.getWebDriver(), Duration.ofSeconds(120));
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public SearchContext getShadowRoot(By locator){
        return findElement(locator).getShadowRoot();
    }

    public static void scrollTo(WebElement targetElement){
        Actions actions = new Actions(WebDriverHandling.getWebDriver());
        actions.scrollToElement(targetElement).perform();
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(targetElement,0,-50);
        actions.scrollFromOrigin(scrollOrigin,0,500).perform();
    }


}
