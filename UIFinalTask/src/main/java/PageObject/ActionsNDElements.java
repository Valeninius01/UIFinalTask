package PageObject;

import org.bouncycastle.crypto.generators.X448KeyPairGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class ActionsNDElements {

    private WebDriver driver;
    private WebDriverWait wait;
    private String username = "Admin";
    private String usernameA = "Admin228";
    private String password = "admin123";

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    private WebElement usernameField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
    private WebElement adminPage;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")
    private WebElement jobDropDown;

    @FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]")
    private WebElement jobTitlePage;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
    private WebElement addJobButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
    private WebElement jobTitleField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")
    private WebElement jobDescriptionField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")
    private WebElement jobNoteField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")
    private WebElement saveJobButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
    private WebElement PIMPage;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    private WebElement addEmployeeButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")
    private WebElement firstNameField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")
    private WebElement middleNameField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")
    private WebElement lastNameField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
    private WebElement employeeIdField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
    private WebElement saveEmployeeButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[6]/a")
    private WebElement employeeJobPage;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div")
    private WebElement jobTitleSelect;

    @FindBy(xpath = "//*[text()='AI Language Model Specialist']")
    private WebElement jobTextField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button")
    private WebElement saveJobButtonEmpl;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
    private WebElement adminPageButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    private WebElement addUserButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")
    private WebElement userRoleField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]")
    private WebElement adminRoleSelect;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div")
    private WebElement statusField;

    @FindBy(xpath = "//*[text()='Enabled']")
    private WebElement statusChoose;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
    private WebElement employeeName;

    @FindBy(xpath = "//*[text()='John Michael Smith']")
    private WebElement findEmployee;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
    private WebElement usernameFieldP;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
    private WebElement passwordFieldP;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
    private WebElement saveUserButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
    private WebElement verifyRole;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
    private WebElement verifyStatus;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
    private WebElement verifyUserName;





    public ActionsNDElements(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }
    public void Username(){
        usernameField.sendKeys(username);
    }
    public void Password() {
        passwordField.sendKeys(password);
    }
    public void LoginButton(){
        loginButton.click();
    }
    public void AdminPage(){
        adminPage.click();
    }
    public void jobDropDown() {
        jobDropDown.click();
    }
    public void jobTitlePage(){
        jobTitlePage.click();
    }
    public void addJob(){
        addJobButton.click();
    }
    public void jobTitle(){
        String jobTitle = "AI Language Model Specialist";
        jobTitleField.sendKeys(jobTitle);
    }
    public void JobDescription(){
         String jobDescription =
                "As an AI Language Model Specialist, " +
                        "your job is to teach computers how to understand and " +
                        "generate human-like language. You'll work on making " +
                        "computer programs smarter in understanding what people" +
                        " say or write and responding in a natural way, like a human would.";
        jobDescriptionField.sendKeys(jobDescription);
    }
    public void JobNote(){
        String jobNote =
                "To do this job well, you need to be good" +
                        " at understanding how language works and " +
                        "have strong computer skills," +
                        " especially in programming languages. " +
                        "You also need to be good at solving " +
                        "problems and working with others to" +
                        " achieve your goals.";
        jobNoteField.sendKeys(jobNote);
    }
    public void SaveJob(){
        saveJobButton.click();
    }
    public void PIM(){
        PIMPage.click();
    }
    public void addEmployee(){
        addEmployeeButton.click();
    }
    public void firstName(){
        String Firstname = "John";
        firstNameField.sendKeys(Firstname);
    }
    public void middleName(){
        String MiddleName = "Michael";
        middleNameField.sendKeys(MiddleName);
    }
    public void lastName(){
        String LastName = "Smith";
        lastNameField.sendKeys(LastName);
    }
    public void setEmployeeId(){
        String employeeId = "228";
        employeeIdField.sendKeys(employeeId);
    }
    public void SaveEmployee(){
        saveEmployeeButton.click();
    }
    public void employeeJob() {
        employeeJobPage.click();
    }
    public void addJobEmployee(){
        jobTitleSelect.click();
    }
    public void jobNameEmployee(){
        jobTextField.click();
    }
    public void jobSave(){
        saveJobButtonEmpl.click();
    }
    public void adminPage(){
        adminPageButton.click();
    }
    public void adduser(){
        addUserButton.click();
    }
    public void userRole(){
        userRoleField.click();
    }
    public void adminRole(){
        adminRoleSelect.click();
    }
    public void statusField() {
        statusField.click();
    }
    public void setStatus(){
        statusChoose.click();
    }
    public void setEmployeeName(){
        String Firstname = "John ";
        employeeName.sendKeys(Firstname);
    }
    public void FindEmployee(){
        findEmployee.click();
    }
    public void setUsernameField(){
        usernameFieldP.sendKeys(usernameA);
    }
    public void setPasswordFieldP() {
        passwordFieldP.sendKeys(password);
    }
    public void setConfirmPassword() {
            confirmPasswordField.sendKeys(password);
    }
    public void verifyRole(){

        Assert.assertEquals(verifyRole.getText(), username, "The Role is not the same");
    }
    public void verifyStatus(){
        String expectedStatus = "Enabled";
        Assert.assertEquals(verifyStatus.getText(), expectedStatus, "The status is not the same");
    };
    public void verifyEmplName(){
        WebElement verifyEmplName = driver.findElement(By.cssSelector("input[data-v-75e744cd]"));
        String name = "John Michael Smith";
        Assert.assertEquals( verifyEmplName.getAttribute("value"), name, "The name is not the same");
    }
    public void verifyUsername(){
        WebElement verifyUserName = driver.findElement
                (By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(4) > div > div:nth-child(2) > input"));

        String expectedUsernamme = "Admin228";
        Assert.assertEquals(verifyUserName.getAttribute("value"), expectedUsernamme, "The username is not the same");
    }
    public void verifyPasswords(){
        String expectedPassword = "admin123";
        WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
        Assert.assertEquals(passwordField.getAttribute("value"), expectedPassword, "The password is not the same");

        WebElement confirmPasswordField = driver.findElement(By.xpath("//input[@type='password']"));
        Assert.assertEquals(confirmPasswordField.getAttribute("value"), expectedPassword, "The confirmed password is not the same");
    }

    public void SaveUser(){
        saveUserButton.click();
    }

}