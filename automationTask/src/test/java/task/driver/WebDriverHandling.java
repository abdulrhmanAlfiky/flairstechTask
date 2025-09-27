package task.driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utilities.config_handler.ConfigPropertyHandler;

import java.io.IOException;

public class WebDriverHandling {

    private static WebDriver webDriver;

    ConfigPropertyHandler dataConfig = new ConfigPropertyHandler();
    private String driverType = "driver";

    private static String driverPath = "resources/config/browserHandler.properties";

    public WebDriverHandling() throws IOException {
        getDriver();
    }

   private void getDriver () throws IOException {
       ChromeOptions chromeOptions = new ChromeOptions();
       chromeOptions.addArguments("use-system-proxy");
       webDriver = new ChromeDriver(chromeOptions);
       webDriver.manage().window().maximize();
       }
   public static WebDriver getWebDriver(){
        return webDriver;
    }
   public void navigation(String url){

        webDriver.navigate().to(url);
    }


    public void close(){webDriver.quit();}
   }


