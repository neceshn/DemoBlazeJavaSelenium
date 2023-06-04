package locators;

import org.openqa.selenium.By;

public class SignUpPageLocator {
    public static final By buttonSignup = By.id("signin2");
    public static final By modalSignupTitle = By.xpath("//h5[@id='signInModalLabel']");
    public static final By modalSignup = By.xpath("//div[@id='signInModal']//div[@class='modal-content']");
    public static final By inputUsername = By.id("sign-username");
    public static final By inputPassword = By.id("sign-password");
    public static final By buttonRegister = By.xpath("//button[contains(text(),'Sign up')]");
}
