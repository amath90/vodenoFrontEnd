package Pages.checkout;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletedPage extends BasePage {

    public CheckoutCompletedPage(final WebDriver driver) {
        super(driver);
    }

    private final static String pageTitleText = "Thank you";
    private final static String orderProcessedText = "Your order has been successfully processed!";

    @FindBy(className = "page-title")
    private WebElement pageTitle;

    @FindBy(className = "title")
    private WebElement orderProcessedInfo;

    @FindBy(className = "details-link")
    private WebElement orderDetailsLink;


    public void goToOrderDetails() {
        waitForPageToLoad();
        checkTextInElement(pageTitle, pageTitleText);
        checkTextInElement(orderProcessedInfo, orderProcessedText);
        orderDetailsLink.click();
    }
}
