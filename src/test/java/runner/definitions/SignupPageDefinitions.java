package runner.definitions;

import actions.SignUpPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.HelperClass;

import java.time.Instant;

public class SignupPageDefinitions {
    SignUpPageActions signUpPageActions = new SignUpPageActions();

    @Given("User is on DemoBlaze home page")
    public void userIsOnDemoBlazeHomePage() {
        HelperClass.openPage("https://www.demoblaze.com/index.html");
    }

    @When("User clicks Sign up button")
    public void userClicksSignUpButton() {
        signUpPageActions.clickSignUp();
    }

    @Then("System displays Sign up modal")
    public void systemDisplaysSignUpModal() {
        signUpPageActions.checkModalVisible();
    }

    @When("User sends username as{string}")
    public void userSendsUsernameAs(String username) {
        signUpPageActions.sendUsername(username + String.valueOf(Instant.now().toEpochMilli()));
    }

    @And("User sends password as {string}")
    public void userSendsPasswordAs(String password) {
        signUpPageActions.sendPassword(password + String.valueOf(Instant.now().toEpochMilli()));
    }

    @And("User clicks Sign up button for register")
    public void userClicksSignUpButtonForRegister() {
        signUpPageActions.clickRegister();
    }

    @Then("System displays successful message {string}")
    public void systemDisplaysSuccessfulMessage(String message) {
        signUpPageActions.displayMessage(message);
    }
}
