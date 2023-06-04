package locators;

import org.openqa.selenium.By;

public class PurchasePageLocator {
    public static final By labelTitleOfProductPage = By.xpath("//div[@id='tbodyid']//h2");
    public static final By labelPriceOfProductPage = By.xpath("//h3[@class='price-container']");
    public static final By labelDescriptionOfProductPage = By.xpath("//div[@id='more-information']//p");
    public static final By buttonAddToCardOfProductPage = By.xpath("//a[contains(text(),'Add to cart')]");
    public static final By buttonCart = By.xpath("//a[@id='cartur']");
    public static final By labelTitleOfCardPage = By.xpath("//tbody//td[2]");
    public static final By labelPriceOfCardPage =  By.xpath("//tbody//td[3]");
    public static final By buttonPlaceOrderOfCardPage = By.xpath("//button[contains(text(),'Place Order')]");
    public static final By inputNameOfPlaceOrder =By.id("name");
    public static final By inputCountryOfPlaceOrder =By.id("country");
    public static final By inputCityOfPlaceOrder =By.id("city");
    public static final By inputCreditCardOfPlaceOrder =By.id("card");
    public static final By inputMonthOfPlaceOrder =By.id("month");
    public static final By inputYearOfPlaceOrder =By.id("year");
    public static final By buttonPurchaseOfPlaceOrder =By.xpath("//button[contains(text(),'Purchase')]");
    public static final By labelTotalPriceOfPlaceOrder = By.id("totalm");
    public static final By labelSuccessOrderMessage= By.xpath("//div[@class=\"sweet-alert  showSweetAlert visible\"]//h2");
}
