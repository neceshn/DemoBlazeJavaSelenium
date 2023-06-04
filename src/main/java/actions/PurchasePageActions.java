package actions;

import locators.PurchasePageLocator;
import org.testng.Assert;
import utils.FormHelper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PurchasePageActions {

    public void scrollToElement(String productName) {
        FormHelper.scrollPage(FormHelper.getByTitle(productName));
    }

    public void clicksOfProduct(String productName) {
        FormHelper.click(FormHelper.getByTitle(productName));
    }

    public void checkPageTitle(String productName) {
        Assert.assertEquals(FormHelper.getText(PurchasePageLocator.labelTitleOfProductPage), productName);
    }

    public void checkPageInformation(String productDescription, String productPrice) {
        Assert.assertEquals(FormHelper.getText(PurchasePageLocator.labelDescriptionOfProductPage),productDescription);
        String price = FormHelper.GetString(FormHelper.getText(PurchasePageLocator.labelPriceOfProductPage),Pattern.compile("\\$([0-9])+"));
        Assert.assertTrue(price.contains(productPrice));
    }

    public void clickAddToCart() {
        FormHelper.click(PurchasePageLocator.buttonAddToCardOfProductPage);
    }

    public void closeTheModal() {
        FormHelper.closeAlert();
    }

    public void clickCart() {
        FormHelper.click(PurchasePageLocator.buttonCart);
    }

    public void checkProductsList(String productName) {
        Assert.assertEquals(FormHelper.getText(PurchasePageLocator.labelTitleOfCardPage),productName);
    }

    public void clickPlaceOrder() {
        FormHelper.click(PurchasePageLocator.buttonPlaceOrderOfCardPage);
    }

    public void checkTotalPrice(String productPrice){
        Assert.assertTrue(FormHelper.getText(PurchasePageLocator.labelTotalPriceOfPlaceOrder).contains(productPrice));
    }
    public void sendsToForm(String receiverName, String receiverCountry, String receiverCity, String receiverCreditCard, String receiverMonth, String receiverYear) {
        FormHelper.sendKeys(PurchasePageLocator.inputNameOfPlaceOrder,receiverName);
        FormHelper.sendKeys(PurchasePageLocator.inputCountryOfPlaceOrder,receiverCountry);
        FormHelper.sendKeys(PurchasePageLocator.inputCityOfPlaceOrder,receiverCity);
        FormHelper.sendKeys(PurchasePageLocator.inputCreditCardOfPlaceOrder,receiverCreditCard);
        FormHelper.sendKeys(PurchasePageLocator.inputMonthOfPlaceOrder,receiverMonth);
        FormHelper.sendKeys(PurchasePageLocator.inputYearOfPlaceOrder,receiverYear);
    }

    public void clickPurchase() {
        FormHelper.click(PurchasePageLocator.buttonPurchaseOfPlaceOrder);
    }

    public void checkPopupPurchase(String arg0) {
        Assert.assertEquals(FormHelper.getText(PurchasePageLocator.labelSuccessOrderMessage),arg0);
    }
}
