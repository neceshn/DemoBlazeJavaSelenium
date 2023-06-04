package runner.definitions;

import actions.PurchasePageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.FormHelper;

import java.text.Normalizer;

public class PurchasePageDefinitions {
    PurchasePageActions actions = new PurchasePageActions();
    @When("User scrolls to element {string}")
    public void userScrollsToElement(String productName) {
        actions.scrollToElement(productName);
    }

    @And("User clicks of product {string}")
    public void userClicksOfProduct(String productName) {
        actions.clicksOfProduct(productName);
    }

    @Then("System opens product page {string}")
    public void systemOpensProductPage(String productName) {
        actions.checkPageTitle(productName);
    }

    @When("User checks product information {string}  {string}")
    public void userChecksProductInformation( String productDescription, String productPrice) {
        actions.checkPageInformation(productDescription,productPrice);
    }

    @And("User clicks Add To Cart button")
    public void userClicksAddToCartButton() {
        actions.clickAddToCart();
    }

    @When("User closes the modal")
    public void userClosesTheModal() {
        actions.closeTheModal();
    }

    @And("User clicks button of Cart")
    public void userClicksButtonOfCart() {
        actions.clickCart();
    }

    @And("User checks Product Title {string}")
    public void userChecksProductTitle(String productName) {
        actions.checkProductsList(productName);
    }

    @And("User clicks button of Place Order")
    public void userClicksButtonOfPlaceOrder() {
        actions.clickPlaceOrder();
    }

    @And("User sends to Place Order information {string} {string} {string} {string} {string} {string}")
    public void userSendsToPlaceOrderInformation(String receiverName, String receiverCountry, String receiverCity, String receiverCreditCard, String receiverMonth, String receiverYear) {
        actions.sendsToForm(receiverName,receiverCountry,receiverCity,receiverCreditCard,receiverMonth,receiverYear);
    }
    @And("User clicks button of Purchase")
    public void userClicksButtonOfPurchase() {
        actions.clickPurchase();
    }

    @Then("System shows purchase message {string}")
    public void systemShowsPurchaseMessage(String message) {
        actions.checkPopupPurchase(message);
    }

    @Then("System displays total price {string}")
    public void systemDisplaysTotalPrice(String productPrice) {
        actions.checkTotalPrice(productPrice);
    }
}
