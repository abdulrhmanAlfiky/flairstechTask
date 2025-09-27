package task.tests.orange_HRM_add_user;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/task/tests/orange_HRM_add_user",
        glue = {"task"},
        plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)
public class CreateNewGoalRunner extends AbstractTestNGCucumberTests{
}

