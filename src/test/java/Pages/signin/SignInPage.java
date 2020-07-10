package Pages.signin;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    private final static String signInPageTitleText = "Welcome, Please Sign In!";

    public SignInPage(final WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "page-title")
    private WebElement signInPageTitle;

    @FindBy(xpath = "//input[@class = 'button-1 checkout-as-guest-button']")
    private WebElement checkoutAsGuestButton;

    public void chooseToCheckoutAsGuest() {
        waitForPageToLoad();
        refresh();
        confirmSignInPageTitle();
        checkoutAsGuestButton.click();
        waitForPageToLoad();
        if (signInPageTitle.getText().contains("Sign In")) {
            checkoutAsGuestButton.click();
        }
    }

    private void confirmSignInPageTitle() {
        checkTextInElement(signInPageTitle, signInPageTitleText);
    }

}
