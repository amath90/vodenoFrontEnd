package Steps;

import Pages.checkout.*;
import Pages.orderinformation.BillingAddressSection;
import Pages.orderinformation.OrderInformationPage;
import Utils.TestData.TestDataHolder;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class CheckoutSteps {

    private final WebDriver driver = BaseStep.driver;
    private final BillingAddressPage checkoutPage = new BillingAddressPage(driver);
    private final ShippingMethodPage shippingMethod = new ShippingMethodPage(driver);
    private final PaymentMethodPage paymentMethod = new PaymentMethodPage(driver);
    private final PaymentInformationPage paymentInformation = new PaymentInformationPage(driver);
    private final ConfirmOrderPage confirmOrder = new ConfirmOrderPage(driver);
    private final CheckoutCompletedPage checkoutCompleted = new CheckoutCompletedPage(driver);
    private final BillingAddressSection billingAddressSection = new BillingAddressSection(driver);
    private final TestDataHolder testDataHolder = new TestDataHolder();
    private final OrderInformationPage orderInformationPage = new OrderInformationPage(driver);


    @When("^He fills in all mandatory billing address information$")
    public void fillInBillingAddressInformation() {
        checkoutPage.fillInAllMandatoryBillingAddressData(testDataHolder);
    }

    @Then("^He confirms default shipping method$")
    public void confirmDefaultShippingMethod() {
        shippingMethod.continueCheckout();
    }

    @Then("^He confirms default payment method$")
    public void confirmDefaultPaymentMethod() {
        paymentMethod.continueCheckout();
    }

    @Then("^He confirms payment information$")
    public void confirmPaymentInformation() {
        paymentInformation.continueCheckout();
    }

    @Then("^He confirms order$")
    public void confirmOrder() {
        confirmOrder.confirmOrder();
    }

    @When("^He goes to order details")
    public void goToOrderDetails() {
        checkoutCompleted.goToOrderDetails();
    }

    @Then("^He verifies billing address information$")
    public void verifyBillingAddressInformation() {
        orderInformationPage.confirmPageTitle();
        orderInformationPage.confirmVisibilityOfOrderDetails();
        billingAddressSection.verifyBillingAddressInformation(testDataHolder);
    }

}
