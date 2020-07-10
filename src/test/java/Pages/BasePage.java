package Pages;

import Steps.BaseStep;
import Utils.WebDriver.WaitUtils;
import Utils.WebDriver.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;


public class BasePage {

    public BasePage(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    private final WaitUtils waitUtils = new WaitUtils();

    private static final WebDriverWait wait = new WebDriverWait(BaseStep.driver, WebDriverUtils.WAIT_TIME);


    protected void elementIsLoaded(final WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void checkTextInElement(final WebElement element, final String expectedText) {
        elementIsLoaded(element);
        assertThat(expectedText).as("Text in element doesn't match!").matches(element.getText());
    }

    protected void refresh() {
        BaseStep.driver.navigate().refresh();
    }

    protected void waitForPageToLoad() {
        if (!BaseStep.driver.findElements(By.xpath("ajax-loading-block-window")).isEmpty()) {
            waitUtils.waitUntilCondition(ExpectedConditions.invisibilityOf(BaseStep.driver.findElement(By.xpath("ajax-loading-block-window"))));
        }
    }

}
