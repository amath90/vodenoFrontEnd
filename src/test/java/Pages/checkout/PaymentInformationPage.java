package Pages.checkout;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentInformationPage extends BasePage {

    public PaymentInformationPage(final WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='payment-info-buttons-container']/input")
    private WebElement continueButton;

    public void continueCheckout() {
        waitForPageToLoad();
        continueButton.click();
    }
}
