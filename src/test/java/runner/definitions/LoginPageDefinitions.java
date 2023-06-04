package runner.definitions;

import actions.LoginPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinitions {
    LoginPageActions loginPageActions = new LoginPageActions();

    @When("User clicks Log in button")
    public void userClicksLogInButton() {
        loginPageActions.clickLogin();
    }
    @Then("System Opens Log in modal")
    public void systemOpensLogInModal() {
        loginPageActions.checkLoginPopupTitle();
    }

    @When("User sends username to Log in modal {string}")
    public void userSendsUsernameToLogInModal(String arg0) {
        loginPageActions.sendUsername(arg0);
    }

    @And("User sends password to Log in modal {string}")
    public void userSendsPasswordToLogInModal(String arg0) {
        loginPageActions.sendPassword(arg0);
    }

    @And("User clicks LogIn button in modal")
    public void userClicksLogInButtonInModal() {
        loginPageActions.clickLoginOfModal();
    }

    @Then("System displays username {string}")
    public void systemDisplaysUsername(String arg0) {
        loginPageActions.checkUsername(arg0);
    }

}
