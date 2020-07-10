package Pages.checkout;

import Pages.BasePage;
import Utils.TestData.TestDataHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingAddressPage extends BasePage {

    private final static String pageTitleText = "Checkout";
    private final static String firstCountryFromCountryDropDown = "A";

    public BillingAddressPage(final WebDriver driver) {
        super(driver);
    }


    @FindBy(className = "page-title")
    private WebElement checkoutPageTitle;

    @FindBy(id = "checkout-step-billing")
    private WebElement billingTable;

    @FindBy(id = "BillingNewAddress_FirstName")
    private WebElement firstName;

    @FindBy(id = "BillingNewAddress_LastName")
    private WebElement lastName;

    @FindBy(id = "BillingNewAddress_Email")
    private WebElement email;

    @FindBy(id = "BillingNewAddress_CountryId")
    private WebElement countryDropDown;

    @FindBy(id = "BillingNewAddress_City")
    private WebElement city;

    @FindBy(id = "BillingNewAddress_Address1")
    private WebElement firstAddress;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    private WebElement zipCode;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    private WebElement phoneNumber;

    @FindBy(xpath = "//div[@id='billing-buttons-container']/input")
    private WebElement continueCheckoutButton;


    public void fillInAllMandatoryBillingAddressData(final TestDataHolder testDataHolder) {
        waitForPageToLoad();
        confirmCheckoutPageTitleText();
        fillInFirstName(testDataHolder);
        fillInLastName(testDataHolder);
        fillInEmail(testDataHolder);
        selectCountry();
        fillInCity(testDataHolder);
        fillInFirstAddress(testDataHolder);
        fillInZipCode(testDataHolder);
        fillInPhoneNumber(testDataHolder);
        chooseContinueCheckout();
    }

    private void confirmCheckoutPageTitleText() {
        checkTextInElement(checkoutPageTitle, pageTitleText);
    }

    private void fillInFirstName(final TestDataHolder testDataHolder) {
        firstName.sendKeys(testDataHolder.firstName);
    }

    private void fillInLastName(final TestDataHolder testDataHolder) {
        lastName.sendKeys(testDataHolder.lastName);
    }

    private void fillInEmail(final TestDataHolder testDataHolder) {
        email.sendKeys(testDataHolder.email);
    }

    private void selectCountry() {
        countryDropDown.sendKeys(firstCountryFromCountryDropDown);
    }

    private void fillInCity(final TestDataHolder testDataHolder) {
        city.sendKeys(testDataHolder.city);
    }

    private void fillInFirstAddress(final TestDataHolder testDataHolder) {
        firstAddress.sendKeys(testDataHolder.firstAddress);
    }

    private void fillInZipCode(final TestDataHolder testDataHolder) {
        zipCode.sendKeys(testDataHolder.zipCode);
    }

    private void fillInPhoneNumber(final TestDataHolder testDataHolder) {
        phoneNumber.sendKeys(testDataHolder.phoneNumber);
    }

    private void chooseContinueCheckout() {
        continueCheckoutButton.click();
    }

}
