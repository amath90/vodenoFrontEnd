package Pages.checkout;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingMethodPage extends BasePage {

    public ShippingMethodPage(final WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='shipping-method-buttons-container']/input")
    private WebElement continueButton;

    public void continueCheckout() {
        waitForPageToLoad();
        continueButton.click();
    }

}
