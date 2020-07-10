package Steps;

import Pages.signin.SignInPage;
import io.cucumber.java.en.Then;

public class SignInSteps {

    private final SignInPage signInPage = new SignInPage(BaseStep.driver);

    @Then("^He chooses to checkout as guest$")
    public void checkoutAsGuest() {
        signInPage.chooseToCheckoutAsGuest();
    }
}
