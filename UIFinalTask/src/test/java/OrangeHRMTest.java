import PageObject.ActionsNDElements;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import WebDriver.WebDriverFactory;

public class OrangeHRMTest {

    @Test(priority = 1)
    public void OrangeTestSite() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        ActionsNDElements LogInactions = new ActionsNDElements(driver, wait);
        LogInactions.Username();
        LogInactions.Password();
        LogInactions.LoginButton();

        ActionsNDElements jobActions = new ActionsNDElements(driver, wait);
        jobActions.AdminPage();
        jobActions.jobDropDown();
        jobActions.jobTitlePage();
        jobActions.addJob();
        jobActions.jobTitle();
        jobActions.JobDescription();
        jobActions.JobNote();
        jobActions.SaveJob();

        ActionsNDElements employeeActions = new ActionsNDElements(driver, wait);
        employeeActions.PIM();
        employeeActions.addEmployee();
        employeeActions.firstName();
        employeeActions.middleName();
        employeeActions.lastName();
        employeeActions.setEmployeeId();
        employeeActions.SaveEmployee();
        employeeActions.employeeJob();
        employeeActions.addJobEmployee();
        employeeActions.jobNameEmployee();
        employeeActions.jobSave();

        ActionsNDElements AdminActions = new ActionsNDElements(driver, wait);
        AdminActions.adminPage();
        AdminActions.adduser();
        AdminActions.userRole();
        AdminActions.adminRole();
        AdminActions.statusField();
        AdminActions.setStatus();
        AdminActions.setEmployeeName();
        AdminActions.FindEmployee();
        AdminActions.setUsernameField();
        AdminActions.setPasswordFieldP();
        AdminActions.setConfirmPassword();

        ActionsNDElements verifyField = new ActionsNDElements(driver, wait);
        verifyField.verifyRole();
        verifyField.verifyStatus();
        verifyField.verifyEmplName();
        verifyField.verifyUsername();
        verifyField.verifyPasswords();

        //AdminActions.SaveUser();
    }
}
