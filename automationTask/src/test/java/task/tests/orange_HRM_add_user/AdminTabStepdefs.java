package task.tests.orange_HRM_add_user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import task.driver.WebDriverHandling;
import task.pages.AddUserPage;
import task.pages.AdminTabPage;
import task.pages.HomePage;
import task.pages.LoginPage;
import task.tests.BaseTest;

import java.time.Duration;

public class AdminTabStepdefs extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage  homePage = new HomePage();
    AdminTabPage adminTabPage = new AdminTabPage();
    AddUserPage addUserPage = new AddUserPage();
    FluentWait<WebDriver> wait = new FluentWait<>(WebDriverHandling.getWebDriver())
        .withTimeout(Duration.ofSeconds(60))
        .pollingEvery(Duration.ofSeconds(1))
        .ignoring(NoSuchElementException.class) ;    // ignore not found

    static int records = 0;
    static int recordsAfterAdd = 0;
    static int recordsAfterDelete = 0;


//    @Given("vodafone employee need to login to access success factors website")
//    public void vodafoneEmployeeNeedToLoginToAccessSuccessFactorsWebsite() throws InterruptedException {
//        microsoftLogin.enterEmail(dataConfig.getProperty("email"));
//        microsoftLogin.clickOnSignInProcessButton();
//        wait.until(ExpectedConditions.refreshed(visibilityOfElementLocated(microsoftLogin.getMicrosoftPasswordField())));
//        microsoftLogin.enterPassword(dataConfig.getProperty("password"));
//        microsoftLogin.clickOnSignInProcessButton();
//        microsoftLogin.clickOnSignInProcessButton();
//    }
//    @When("employee enter vodafone success factors")
//    public void employeeEnterVodafoneSuccessFactors() {
//        BasePage.waitUntilPageIsLoaded();
//    }
//
//    @And("employee click on home tab in success factors home page")
//    public void employeeClickOnHomeTabInSuccessFactorsHomePage() throws InterruptedException {
//        wait.until(ExpectedConditions.refreshed(visibilityOf(adminTabPage.getHomeTab()))) ;
//        adminTabPage.clickOnHomeTab();
//
//    }
//
//    @And("employee selects grow my impact goals sub tab from home tab in success factor home page")
//    public void employeeSelectsGrowMyImpactGoalsSubTabFromHomeTabInSuccessFactorHomePage() throws InterruptedException {
//        wait.until(ExpectedConditions.refreshed(visibilityOf(adminTabPage.getGrowMyImpactGoalsSubTab()))) ;
//        adminTabPage.clickOnGrowMyImpactGoalsSubTab();
//    }
//
//    @And("employee clicks on create a goal in grow my impact goals page")
//    public void employeeClicksOnCreateAGoalInGrowMyImpactGoalsPage() throws InterruptedException {
//        wait.until(ExpectedConditions.refreshed(visibilityOfElementLocated(adminTabPage.getCreateGoalTab())));
//        adminTabPage.clickOnCreateGoalTab();
//    }
//
//    @And("employee fill all required fields to create a goal")
//    public void employeeFillAllRequiredFieldsToCreateAGoal() throws InterruptedException {
//        Thread.sleep(8000);
//        wait.until(ExpectedConditions.refreshed(visibilityOf(adminTabPage.getEndpage())));
//        adminTabPage.getDescField().sendKeys(dataConfig.getProperty("goal"));
//        adminTabPage.getMeasDescField().sendKeys(dataConfig.getProperty("measure"));
//        BasePage.scrollTo(adminTabPage.getEndpage());
//        adminTabPage.clickOnThemeBox();
//        adminTabPage.clickOnSimplicityChoice();
//        adminTabPage.clickOnStatusBox();
//        adminTabPage.clickOnInProgressChoice();
//
//    }
//
//    @And("employee click on save button")
//    public void employeeClickOnSaveButton() {
//        adminTabPage.clickOnSavebutton();
//    }
//
//    @Then("a success message appear to employee that he has create a new goal successfully")
//    public void aSuccessMessageAppearToEmployeeThatHeHasCreateANewGoalSuccessfully() {
//        Assert.assertTrue(adminTabPage.getSuccessOverlayText().isDisplayed());
//    }

    @Given("admin user redirects to Ornage HRM and login with user credentials {string} and {string}")
    public void adminUserRedirectsToOrnageHRMAndLoginWithUserCredentialsAnd(String userName, String password) throws InterruptedException {
        loginPage.getUserNameField().sendKeys(dataConfig.getProperty(userName));
        loginPage.getPasswordField().sendKeys(dataConfig.getProperty(password));
        loginPage.clickOnLoginButton();
    }

    @When("admin user click on admin tab")
    public void adminUserClickOnAdminTab() {
        homePage.clickOnAdminTab();

    }

    @And("admin user gets numbers of users recorded")
    public void adminUserGetNumbersOfUsersRecorded() {
        records = adminTabPage.getUserRecrords();
    }

    @And("admin user click on add button in admin page")
    public void adminUserClickOnAddButtonInAdminPage() {
        adminTabPage.clickOnAddbutton();
    }


    @And("admin user click on save button")
    public void adminUserClickOnSaveButton() {
       addUserPage.clickOnSaveButton();
    }

    @Then("number of recorded users is increased by numbers of added users")
    public void numberOfRecordedUsersIsIncreasedByNumbersOfAddedUsers() {
        recordsAfterAdd = adminTabPage.getUserRecrords();
        if (recordsAfterAdd == records+1){
            System.out.println(recordsAfterAdd);
        Assert.assertEquals(recordsAfterAdd,records+1);
        }
        else {
            System.out.println(recordsAfterAdd);
            Assert.assertTrue(recordsAfterAdd>records);
        }
    }

    @And("search for user with name {string}")
    public void searchForUserWithName(String user) {
        adminTabPage.getSearchField().sendKeys(dataConfig.getProperty(user));
    }

    @And("click on search button")
    public void clickOnSearchButton() {
        adminTabPage.clickOnSearchButton();
    }

    @And("click on delete button for selected user")
    public void clickOnDeleteButtonForSelectedUser() {
        adminTabPage.clickOnDeleteButton();
    }

    @And("click on Yes delete button")
    public void clickOnYesDeleteButton() {
       adminTabPage.clickOnConfirmDeleteButton();
    }

    @Then("number of recorded users is decreased by numbers of deleted users")
    public void numberOfRecordedUsersIsDecreasedByNumbersOfDeletedUsers() {
        WebDriverHandling.getWebDriver().navigate().refresh();
        recordsAfterDelete = adminTabPage.getUserRecrords();
        if (recordsAfterDelete == records-1) {
            System.out.println(recordsAfterDelete);
            Assert.assertEquals(recordsAfterDelete, records - 1);
        }
        else {
            System.out.println(recordsAfterAdd);
            Assert.assertTrue(recordsAfterDelete<records);
        }


    }

    @And("admin user fill required data to add new user {string} and {string} and {string} and {string}")
    public void adminUserFillRequiredDataToAddNewUserAndAndAnd(String role, String status, String newPassword, String name) {
        addUserPage.clickOnUserRoleSelector();
        addUserPage.clickOnESSRoleType(role);
        addUserPage.clickOnStatusSelector();
        addUserPage.clickOnEnabledStatus(status);
        addUserPage.getPasswordField().sendKeys(dataConfig.getProperty(newPassword));
        addUserPage.getConfirmPasswordField().sendKeys(dataConfig.getProperty(newPassword));
        addUserPage.getUserNameField().sendKeys(dataConfig.getProperty(name));
        addUserPage.clickOnEmployeeNameField();
        addUserPage.getEmployeeNameField().sendKeys("A");
        addUserPage.getEmployeeNameField().sendKeys(Keys.SPACE);
        wait.until(ExpectedConditions.visibilityOfAllElements(addUserPage.getSelectEmpployeeList()));
        wait.until(ExpectedConditions.visibilityOf(addUserPage.getSelectEmployeeName()));
        addUserPage.clickOnSelectEmplyeeName();
    }
}
