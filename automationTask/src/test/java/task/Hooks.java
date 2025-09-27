package task;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import task.driver.WebDriverHandling;
import task.tests.BaseTest;
import utilities.config_handler.ConfigPropertyHandler;

;import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Hooks extends BaseTest {

    @Before
    public void vodafoneSuccessFactorsWebsite() throws IOException {
        dataConfig = new ConfigPropertyHandler();
        webDriverHandling = new WebDriverHandling();
        webDriverHandling.navigation(dataConfig.getProperty("url"));

    }

    @AfterStep
    public void AfterStep(Scenario scenario) throws IOException {

        if (scenario.isFailed()) {

            byte[] image = ((TakesScreenshot) WebDriverHandling.getWebDriver()).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("take screenshot", new ByteArrayInputStream(image));
        }
    }
    @After
    public void tearDown(){
        webDriverHandling.close();
    }

}