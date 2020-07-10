package Pages.checkout;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentMethodPage extends BasePage {

    public PaymentMethodPage(final WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='payment-method-buttons-container']/input")
    private WebElement continueButton;

    public void continueCheckout() {
        waitForPageToLoad();
        continueButton.click();
    }
}
