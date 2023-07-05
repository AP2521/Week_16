package sw.parabank.com.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import sw.parabank.com.pages.LoginPage;

public class LoginStepdefs {
    @Given("^User is on Home page$")
    public void userIsOnHomePage() {
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String uname)  {
        new LoginPage().EnterUserName(uname);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String pwd)  {
        new LoginPage().EnterPassword(pwd);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().ClickLogin();
    }

    @And("^I should login successfully and see \"([^\"]*)\"$")
    public void iShouldLoginSuccessfullyAndSeeText(String text)  {
        Assert.assertEquals(text,new LoginPage().VerifyLoginText());
    }

    @And("^I click on logout button$")
    public void iClickOnLogoutButton() {
        new LoginPage().LogOutButton();
    }

    @Then("^I should logout successfully and see \"([^\"]*)\"$")
    public void iShouldLogoutSuccessfullyAndSeeText(String text) {
        Assert.assertEquals(text,new LoginPage().VerifyLogoutText());
    }

    @Then("^I should see error message \"([^\"]*)\"$")
    public void iShouldSeeErrorMessage(String msg)  {
        Assert.assertEquals(msg,new LoginPage().VerifyErrorText());
    }
}
