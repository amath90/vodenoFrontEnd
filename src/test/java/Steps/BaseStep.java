package Steps;

import Utils.PropertyUtils.PropertyReader;
import Utils.WebDriver.WebDriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseStep {

    public static WebDriver driver;
    private static final Logger LOG = LogManager.getLogger(BaseStep.class);


    @Before
    public void setup() {
        LOG.info("Getting driver");
        driver = WebDriverUtils.getWebDriver();
        LOG.info("Going to " + (PropertyReader.getPropertyData("DEV1")));
        final WebDriverWait wait = new WebDriverWait(driver, WebDriverUtils.WAIT_TIME);
    }

    @After
    public void close() {
        if (driver != null) {
            LOG.info("Closing driver");
            driver.quit();
        }
    }

}
