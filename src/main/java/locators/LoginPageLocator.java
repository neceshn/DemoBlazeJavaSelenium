package locators;

import org.openqa.selenium.By;

public class LoginPageLocator {
    public static final By buttonLogin = By.id("login2");
    public static final By inputLoginUsername = By.id("loginusername");
    public static final By inputLoginPassword = By.id("loginpassword");
    public static final By labelLoginModalTitle = By.id("logInModalLabel");
    public static final By buttonLoginOfModal = By.xpath("//button[contains(text(),'Log in')]");
    public static final By labelUsername = By.id("nameofuser");

}
