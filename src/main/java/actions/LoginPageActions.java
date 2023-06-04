package actions;

import locators.LoginPageLocator;
import org.testng.Assert;
import utils.FormHelper;

public class LoginPageActions {

    public void clickLogin() {
        FormHelper.click(LoginPageLocator.buttonLogin);
    }

    public void checkLoginPopupTitle() {
        Assert.assertEquals(FormHelper.getText(LoginPageLocator.labelLoginModalTitle), "Log in");
    }
    public void sendUsername(String arg0) {
        FormHelper.sendKeys(LoginPageLocator.inputLoginUsername, arg0);
    }

    public void sendPassword(String arg0) {
        FormHelper.sendKeys(LoginPageLocator.inputLoginPassword, arg0);
    }

    public void clickLoginOfModal() {
        FormHelper.click(LoginPageLocator.buttonLoginOfModal);
    }

    public void checkUsername(String arg0) {
        Assert.assertEquals(FormHelper.getText(LoginPageLocator.labelUsername), "Welcome " + arg0);
    }
}
