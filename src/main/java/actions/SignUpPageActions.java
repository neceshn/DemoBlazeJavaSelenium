package actions;

import locators.SignUpPageLocator;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import utils.FormHelper;

public class SignUpPageActions {
    public void clickSignUp() {
        FormHelper.click(SignUpPageLocator.buttonSignup);
    }

    public void checkModalVisible() {
        FormHelper.checkVisibility(SignUpPageLocator.modalSignupTitle);
    }

    public void sendUsername(String username) {
        FormHelper.sendKeys(SignUpPageLocator.inputUsername, username);
    }

    public void sendPassword(String password) {
        FormHelper.sendKeys(SignUpPageLocator.inputPassword, password);
    }

    public void clickRegister() {
        FormHelper.click(SignUpPageLocator.buttonRegister);
    }

    public void displayMessage(String message) {
            String exceptedText = FormHelper.getModalText();
            Assert.assertEquals(message, exceptedText, "Kayıt mesajı hatalıdır.");
            FormHelper.closeAlert();
    }
}
