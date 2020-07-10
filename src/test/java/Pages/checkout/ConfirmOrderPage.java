package Pages.checkout;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmOrderPage extends BasePage {

    public ConfirmOrderPage(final WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='confirm-order-buttons-container']/input")
    private WebElement confirmButton;

    public void confirmOrder() {
        waitForPageToLoad();
        confirmButton.click();
    }

}
