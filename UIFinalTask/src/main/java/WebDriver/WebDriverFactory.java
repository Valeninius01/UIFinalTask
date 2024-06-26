package WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class WebDriverFactory {

    private static WebDriver driver;

    private WebDriverFactory(){
    }

    public static WebDriver getDriver(){
        if (driver == null) {
            initializationWebDriver();
        } return driver;
    }

    public static void initializationWebDriver(){
        String chromeDriver = "C:\\Users\\Valentyn\\IdeaProjects\\UIFinalTask\\src\\test\\resources\\chromedriver.exe";
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
}