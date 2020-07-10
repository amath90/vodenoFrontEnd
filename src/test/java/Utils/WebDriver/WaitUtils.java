package Utils.WebDriver;

import Steps.BaseStep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class WaitUtils {

    private static final Logger LOG = LogManager.getLogger(WaitUtils.class);

    private <T> void waitAndIgnoreException(final ExpectedCondition<T> condition,
                                            final Duration maxWaitTime) {
        new FluentWait<>(BaseStep.driver)
                .withTimeout(maxWaitTime)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .until(webDriver -> {
                    LOG.info("Waiting to match expected condition for WebElement...");
                    return condition.apply(webDriver);
                });
    }

    public <T> void waitUntilCondition(final ExpectedCondition<T> condition) {
        waitAndIgnoreException(condition, Duration.ofSeconds(10));
    }
}
