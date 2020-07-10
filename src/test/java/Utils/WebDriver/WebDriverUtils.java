package Utils.WebDriver;

import Utils.PropertyUtils.PropertyReader;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Steps.BaseStep.driver;
import static java.util.concurrent.TimeUnit.SECONDS;

public class WebDriverUtils {

    public final static Integer WAIT_TIME = 30;
    private final static Integer PAGE_LOAD_TIME = 60;


    public static WebDriver getWebDriver() {
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        setDriverTimeouts();
        driver.manage().window().maximize();
        driver.get(PropertyReader.getPropertyData("DEV1"));
        return driver;
    }

    private static void setDriverTimeouts() {
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIME, SECONDS);
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, SECONDS);
    }
}
