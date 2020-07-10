package Pages.main;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerSection extends BasePage {

    public BuildYourOwnComputerSection(final WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "product_attribute_3_6")
    private WebElement hddOption320;

    @FindBy(id = "add-to-cart-button-1")
    private WebElement addToCart;


    public void addToCartComputer320hdd() {
        choose320HddOption();
        addToCart();
    }

    private void choose320HddOption() {
        hddOption320.click();
    }

    private void addToCart() {
        addToCart.click();
    }

}
