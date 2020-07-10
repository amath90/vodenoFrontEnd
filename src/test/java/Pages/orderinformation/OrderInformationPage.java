package Pages.orderinformation;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderInformationPage extends BasePage {

    public OrderInformationPage(final WebDriver driver) {
        super(driver);
    }

    private final static String pageTitleText = "Order information";

    @FindBy(css = ".page-title>h1")
    private WebElement orderInformationPageTitle;

    @FindBy(className = "order-details-area")
    private WebElement orderDetailsArea;


    public void confirmVisibilityOfOrderDetails() {
        elementIsLoaded(orderDetailsArea);
    }

    public void confirmPageTitle() {
        checkTextInElement(orderInformationPageTitle, pageTitleText);
    }
}
