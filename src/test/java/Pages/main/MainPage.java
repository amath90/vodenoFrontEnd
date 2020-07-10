package Pages.main;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    private static final String productAddToCartBarText = "The product has been added to your shopping cart";

    public MainPage(final WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@data-productid = '1']//input[@value='Add to cart']")
    private WebElement buildComputerAddToCartBtn;

    @FindBy(css = ".bar-notification")
    private WebElement productAddToCartBar;

    @FindBy(className = "close")
    private WebElement closeNotificationBar;

    @FindBy(id = "nivo-slider")
    private WebElement mainBannerSlider;

    @FindBy(id = "topcartlink")
    private WebElement topMenuCart;

    public void mainPageLoaded() {
        elementIsLoaded(mainBannerSlider);
    }

    public void chooseBuildYourOwnComputerProduct() {
        buildComputerAddToCartBtn.click();
    }

    public void waitForProductAddToCartBar() {
        checkTextInElement(productAddToCartBar, productAddToCartBarText);
        closeNotificationBar.click();
    }

    public void goToCartUsingTopMenu() {
        topMenuCart.click();
    }


}
