package Pages.orderinformation;

import Pages.BasePage;
import Utils.TestData.TestDataHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingAddressSection extends BasePage {


    public BillingAddressSection(final WebDriver driver) {
        super(driver);
    }

    private static final String firstCountryFromDropDown = "Afghanistan";
    private static final String defaultPaymentMethod = "Check / Money Order";
    private static final String pendingPaymentStatus = "Pending";


    @FindBy(xpath = "//div[@class ='billing-info']//li[@class='name']")
    private WebElement name;

    @FindBy(xpath = "//div[@class ='billing-info']//li[@class='email']")
    private WebElement email;

    @FindBy(xpath = "//div[@class ='billing-info']//li[@class='phone']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//div[@class ='billing-info']//li[@class='address1']")
    private WebElement firstAddress;

    @FindBy(xpath = "//div[@class ='billing-info']//li[@class='city-state-zip']")
    private WebElement cityStateZipCode;

    @FindBy(xpath = "//div[@class ='billing-info']//li[@class='country']")
    private WebElement country;

    @FindBy(xpath = "//li[@class ='payment-method']//span[@class='value']")
    private WebElement paymentMethod;

    @FindBy(xpath = "//li[@class ='payment-method-status']//span[@class='value']")
    private WebElement paymentStatus;

    public void verifyBillingAddressInformation(final TestDataHolder testDataHolder) {
        verifyName(testDataHolder);
        verifyEmail(testDataHolder);
        verifyPhoneNumber(testDataHolder);
        verifyFirstAddress(testDataHolder);
        verifyCityStateZipCode(testDataHolder);
        verifyCountry();
        verifyPaymentMethod();
        verifyPaymentStatus();
    }


    private void verifyName(final TestDataHolder testDataHolder) {
        checkTextInElement(name, (testDataHolder.firstName + " " + testDataHolder.lastName));
    }

    private void verifyEmail(final TestDataHolder testDataHolder) {
        checkTextInElement(email, ("Email: " + testDataHolder.email));
    }

    private void verifyPhoneNumber(final TestDataHolder testDataHolder) {
        checkTextInElement(phoneNumber, ("Phone: " + testDataHolder.phoneNumber));
    }

    private void verifyFirstAddress(final TestDataHolder testDataHolder) {
        checkTextInElement(firstAddress, testDataHolder.firstAddress);
    }

    private void verifyCityStateZipCode(final TestDataHolder testDataHolder) {
        checkTextInElement(cityStateZipCode, (testDataHolder.city + "," + testDataHolder.zipCode));
    }

    private void verifyCountry() {
        checkTextInElement(country, firstCountryFromDropDown);
    }

    private void verifyPaymentMethod() {
        checkTextInElement(paymentMethod, defaultPaymentMethod);
    }

    private void verifyPaymentStatus() {
        checkTextInElement(paymentStatus, pendingPaymentStatus);
    }
}
