import PageObject.ActionsForTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import WebDriver.WebDriverFactory;

public class orangeHRMTest {

    @Test(priority = 1)
    public void OrangeTestSite() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        ActionsForTest actions = new ActionsForTest(driver, wait);
        actions.login();
        actions.addJobTitle();
        actions.addEmployee();
        actions.assignJobToEmployee();
        actions.addUser();
        actions.verifyUserDetails();
        actions.saveUser();
    }
}
