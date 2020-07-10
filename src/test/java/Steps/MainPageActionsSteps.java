package Steps;

import Pages.main.BuildYourOwnComputerSection;
import Pages.main.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MainPageActionsSteps {

    private final MainPage mainPage = new MainPage(BaseStep.driver);
    private final BuildYourOwnComputerSection buildYourOwnComputer = new BuildYourOwnComputerSection(BaseStep.driver);

    @Given("^Guest customer is on main page$")
    public void mainPageLoaded() {
        mainPage.mainPageLoaded();
    }

    @When("^He adds to cart build your own computer product$")
    public void addBuildOwnComputerToCart() {
        mainPage.chooseBuildYourOwnComputerProduct();
        buildYourOwnComputer.addToCartComputer320hdd();
    }

    @Then("^He sees information that product has been successfully added to his cart$")
    public void productAddToCartSuccessfullyInfo() {
        mainPage.waitForProductAddToCartBar();
    }

    @When("^He goes to cart using main page top menu")
    public void goToCartUsingTopMenu() {
        mainPage.goToCartUsingTopMenu();
    }

}
