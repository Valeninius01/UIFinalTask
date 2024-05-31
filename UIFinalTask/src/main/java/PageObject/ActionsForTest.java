package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionsForTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private ElementAction elementActions;

    public ActionsForTest(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementActions = new ElementAction(driver);
    }

    public void login() {
        String username = "Admin";
        String password = "admin123";
        elementActions.setUsername(username);
        elementActions.setPassword(password);
        elementActions.clickLoginButton();
    }

    public void addJobTitle() {
        String jobTitle = "AI Language Model Specialist";

        String jobDescription = "As an AI Language Model Specialist, " +
                "your job is to teach computers how to understand and " +
                "generate human-like language. You'll work on making " +
                "computer programs smarter in understanding what people " +
                "say or write and responding in a natural way, like a human would.";

        String jobNote =
                "To do this job well, you need to be good " +
                "at understanding how language works and " +
                "have strong computer skills, " +
                "especially in programming languages.";
        elementActions.clickAdminPage();
        elementActions.clickJobDropDown();
        elementActions.clickJobTitlePage();
        elementActions.clickAddJob();
        elementActions.setJobTitle(jobTitle);
        elementActions.setJobDescription(jobDescription);
        elementActions.setJobNote(jobNote);
        elementActions.clickSaveJob();
    }

    public void addEmployee() {
        String firstName = "John";
        String middleName = "Michael";
        String lastName = "Smith";
        String employeeId  = "228";
        elementActions.clickPIM();
        elementActions.clickAddEmployee();
        elementActions.setFirstName(firstName);
        elementActions.setMiddleName(middleName);
        elementActions.setLastName(lastName);
        elementActions.setEmployeeId(employeeId);
        elementActions.clickSaveEmployee();
    }

    public void assignJobToEmployee() {
        String jobTitle = "AI Language Model Specialist";
        elementActions.clickEmployeeJobPage();
        elementActions.clickJobTitleSelect();
        elementActions.clickJobTextField();
        elementActions.clickSaveJobButtonEmpl();
    }

    public void addUser() {
        String username = "Admin228";
        String password = "admin123";
        String employeeName = "John Michael Smith";
        String confirmPassword = "admin123";
        elementActions.clickAdminPageButton();
        elementActions.clickAddUser();
        elementActions.clickUserRoleField();
        elementActions.clickAdminRoleSelect();
        elementActions.clickStatusField();
        elementActions.clickStatusChoose();
        elementActions.setEmployeeName(employeeName);
        elementActions.clickFindEmployee();
        elementActions.setUsernameFieldP(username);
        elementActions.setPasswordFieldP(password);
        elementActions.setConfirmPasswordField(confirmPassword);
        elementActions.clickSaveUserButton();
    }

    public void verifyUserDetails() {
        String expectedRole = "Admin";
        String expectedStatus = "Enabled";
        String expectedUsername = "Admin228";
        elementActions.verifyRole(expectedRole);
        elementActions.verifyStatus(expectedStatus);
        elementActions.verifyUsername(expectedUsername);
    }

    public void saveUser(){
        elementActions.clickSaveUserButton();
    }
}
