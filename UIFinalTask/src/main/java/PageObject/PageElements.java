package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageElements {

    private WebDriver driver;

    public PageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@name=\"username\"]")
    public WebElement usernameField;

    @FindBy(xpath = "//*[@name=\"password\"]")
    public WebElement passwordField;

    @FindBy(xpath = "//*[@type=\"submit\"]")
    public WebElement loginButton;

    @FindBy(xpath = "(//*[@class=\"oxd-main-menu-item-wrapper\"])[1]")
    public WebElement adminPage;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")
    public WebElement jobDropDown;

    @FindBy(xpath = "//*[text()='Job Titles']")
    public WebElement jobTitlePage;

    @FindBy(xpath = "//button[contains(@class, 'oxd-button--secondary')]")
    public WebElement addJobButton;

    @FindBy(xpath = "(//input[contains(@class, 'oxd-input--active')])[2]")
    public WebElement jobTitleField;

    @FindBy(xpath = "//textarea[@placeholder='Type description here']")
    public WebElement jobDescriptionField;

    @FindBy(xpath = "//textarea[@placeholder='Add note']")
    public WebElement jobNoteField;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveJobButton;

    @FindBy(xpath = "//a[.//span[text()='PIM']]")
    public WebElement PIMPage;

    @FindBy(xpath = "//li/a[text()='Add Employee']")
    public WebElement addEmployeeButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameField;

    @FindBy(xpath = "//input[@name='middleName']")
    public WebElement middleNameField;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameField;

    @FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
    public WebElement employeeIdField;

    @FindBy(xpath = "//button[text()=' Save ']")
    public WebElement saveEmployeeButton;

    @FindBy(xpath = "(//a[@class='orangehrm-tabs-item'])[5]")
    public WebElement employeeJobPage;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
    public WebElement jobTitleSelect;

    @FindBy(xpath = "//*[text()='AI Language Model Specialist']")
    public WebElement jobTextField;

    @FindBy(xpath = "//button[text()=' Save ']")
    public WebElement saveJobButtonEmpl;

    @FindBy(xpath = "//a[@href='/web/index.php/admin/viewAdminModule']")
    public WebElement adminPageButton;

    @FindBy(xpath = "//button[.//i[contains(@class, 'bi-plus')]]")
    public WebElement addUserButton;

    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
    public WebElement userRoleField;

    @FindBy(xpath = "(//*[text()='Admin'])[3]")
    public WebElement adminRoleSelect;


    @FindBy(xpath = "(//*[@class='oxd-select-text-input'])[2]")
    public WebElement statusField;

    @FindBy(xpath = "//*[text()='Enabled']")
    public WebElement statusChoose;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    public WebElement employeeName;

    @FindBy(xpath = "//*[text()='John Michael Smith']")
    public WebElement findEmployee;


    @FindBy(xpath = "(//input)[3]")
    public WebElement usernameFieldP;

    @FindBy(xpath = "(//input)[4]")
    public WebElement passwordFieldP;

    @FindBy(xpath = "(//input)[5]")
    public WebElement confirmPasswordField;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement saveUserButton;

    @FindBy(xpath = "//div[text()='Admin']")
    public WebElement verifyRole;

    @FindBy(xpath = "//div[text()='Enabled']")
    public WebElement verifyStatus;

    @FindBy(xpath = "(//input)[3]")
    public WebElement verifyUserName;
}
