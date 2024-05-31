package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ElementAction {

    private PageElements pageElements;
    private WebDriverWait wait;

    public ElementAction(WebDriver driver) {
        this.pageElements = new PageElements(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void setUsername(String username) {
        pageElements.usernameField.sendKeys(username);
    }

    public void setPassword(String password) {
        pageElements.passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        pageElements.loginButton.click();
    }

    public void clickAdminPage() {
        pageElements.adminPage.click();
    }

    public void clickJobDropDown() {
        pageElements.jobDropDown.click();
    }

    public void clickJobTitlePage() {
        pageElements.jobTitlePage.click();
    }

    public void clickAddJob() {
        pageElements.addJobButton.click();
    }

    public void setJobTitle(String jobTitle) {
        pageElements.jobTitleField.sendKeys(jobTitle);
    }

    public void setJobDescription(String jobDescription) {
        pageElements.jobDescriptionField.sendKeys(jobDescription);
    }

    public void setJobNote(String jobNote) {
        pageElements.jobNoteField.sendKeys(jobNote);
    }

    public void clickSaveJob() {
        pageElements.saveJobButton.click();
    }

    public void clickPIM() {
        pageElements.PIMPage.click();
    }

    public void clickAddEmployee() {
        pageElements.addEmployeeButton.click();
    }

    public void setFirstName(String firstName) {
        pageElements.firstNameField.sendKeys(firstName);
    }

    public void setMiddleName(String middleName) {
        pageElements.middleNameField.sendKeys(middleName);
    }

    public void setLastName(String lastName) {
        pageElements.lastNameField.sendKeys(lastName);
    }

    public void setEmployeeId(String employeeId) {
        pageElements.employeeIdField.sendKeys(employeeId);
    }

    public void clickSaveEmployee() {
        pageElements.saveEmployeeButton.click();
    }

    public void clickEmployeeJobPage() {
        pageElements.employeeJobPage.click();
    }

    public void clickJobTitleSelect() {
        pageElements.jobTitleSelect.click();
    }

    public void clickJobTextField() {
        pageElements.jobTextField.click();
    }

    public void clickSaveJobButtonEmpl() {
        pageElements.saveJobButtonEmpl.click();
    }

    public void clickAdminPageButton() {
        pageElements.adminPageButton.click();
    }

    public void clickAddUser() {
        pageElements.addUserButton.click();
    }

    public void clickUserRoleField() {
        pageElements.userRoleField.click();
    }

    public void clickAdminRoleSelect() {
        pageElements.adminRoleSelect.click();
    }

    public void clickStatusField() {
        pageElements.statusField.click();
    }

    public void clickStatusChoose() {
        pageElements.statusChoose.click();
    }

    public void setEmployeeName(String employeeName) {
        pageElements.employeeName.sendKeys(employeeName);
    }

    public void clickFindEmployee() {
        pageElements.findEmployee.click();
    }

    public void setUsernameFieldP(String username) {
        pageElements.usernameFieldP.sendKeys(username);
    }

    public void setPasswordFieldP(String password) {
        pageElements.passwordFieldP.sendKeys(password);
    }

    public void setConfirmPasswordField(String password) {
        pageElements.confirmPasswordField.sendKeys(password);
    }

    public void verifyRole(String expectedRole) {
        Assert.assertEquals(pageElements.verifyRole.getText(), expectedRole, "The Role is not the same");
    }

    public void verifyStatus(String expectedStatus) {
        Assert.assertEquals(pageElements.verifyStatus.getText(), expectedStatus, "The status is not the same");
    }

    public void verifyUsername(String expectedUsername) {
        Assert.assertEquals(pageElements.verifyUserName.getAttribute("value"), expectedUsername, "The username is not the same");
    }

    public void verifyPasswords(String expectedPassword) {
        Assert.assertEquals(pageElements.passwordField.getAttribute("value"), expectedPassword, "The password is not the same");
        Assert.assertEquals(pageElements.confirmPasswordField.getAttribute("value"), expectedPassword, "The confirmed password is not the same");
    }

    public void clickSaveUserButton() {
        pageElements.saveUserButton.click();
    }
}

