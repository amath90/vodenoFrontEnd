package Steps;

import Pages.shoppingcart.ShoppingCartPage;
import io.cucumber.java.en.Then;


public class ShoppingCartSteps {

    private final ShoppingCartPage shoppingCart = new ShoppingCartPage(BaseStep.driver);

    @Then("Confirms that chosen product is in cart table$")
    public void confirmProductInShoppingCart() {
        shoppingCart.confirmProductInShoppingCart();
    }

    @Then("^He chooses to start checkout procedure$")
    public void startCheckoutProcedure() {
        shoppingCart.chooseToStartCheckout();
    }

}
