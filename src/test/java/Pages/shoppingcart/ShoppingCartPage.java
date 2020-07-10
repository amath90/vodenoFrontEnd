package Pages.shoppingcart;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    public ShoppingCartPage(final WebDriver driver) {
        super(driver);
    }

    private final static String pageTitleText = "Shopping cart";
    private final static String buildOwnComputerProductName = "Build your own computer";


    @FindBy(className = "page-title")
    private WebElement shoppingCartPageTitle;

    @FindBy(xpath = "//table[@class = 'cart']//td[@class='product']/a")
    private WebElement productsTableProductName;

    @FindBy(id = "termsofservice")
    private WebElement agreeToCheckoutTerms;

    @FindBy(id = "checkout")
    private WebElement checkoutButton;


    public void confirmProductInShoppingCart() {
        confirmShoppingPageTitle();
        confirmShoppingCartProductName();
    }

    public void chooseToStartCheckout() {
        agreeToCheckoutTerms();
        chooseCheckoutButton();
    }

    private void confirmShoppingPageTitle() {
        checkTextInElement(shoppingCartPageTitle, pageTitleText);
    }

    private void confirmShoppingCartProductName() {
        checkTextInElement(productsTableProductName, buildOwnComputerProductName);
    }

    private void agreeToCheckoutTerms() {
        agreeToCheckoutTerms.click();
    }

    private void chooseCheckoutButton() {
        checkoutButton.click();
    }

}
