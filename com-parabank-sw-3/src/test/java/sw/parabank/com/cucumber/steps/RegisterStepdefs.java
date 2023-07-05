package sw.parabank.com.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import sw.parabank.com.pages.RegisterPage;

public class RegisterStepdefs {
    @Given("^User is on Homepage$")
    public void userIsOnHomepage() {
    }

    @When("^I click on Registerbutton$")
    public void iClickOnRegisterbutton() {
        new RegisterPage().clickOnRegisterLink();
    }

    @And("^I enter firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String firstname)  {
       new RegisterPage().EnterFirstName(firstname);
    }

    @And("^I enter lastname \"([^\"]*)\"$")
    public void iEnterLastname(String lastname)  {
       new RegisterPage().EnterLastname(lastname);
    }

    @And("^I enter streetname in address \"([^\"]*)\"$")
    public void iEnterStreetnameInAddress(String street)  {
       new RegisterPage().EnterAddressStreet(street);
    }

    @And("^I enter cityname in address \"([^\"]*)\"$")
    public void iEnterCitynameInAddress(String city)  {
       new RegisterPage().EnterAddressCity(city);
    }

    @And("^I enter state in address \"([^\"]*)\"$")
    public void iEnterStateInAddress(String state)  {
       new RegisterPage().EnterAddressState(state);
    }

    @And("^I enter zipcode in address \"([^\"]*)\"$")
    public void iEnterZipcodeInAddress(String zipcode)  {
       new RegisterPage().AddressZipcode(zipcode);
    }

    @And("^I enter phonenumber \"([^\"]*)\"$")
    public void iEnterPhonenumber(String phn)  {
       new RegisterPage().PhoneNumber(phn);
    }

    @And("^I enter SSN \"([^\"]*)\"$")
    public void iEnterSSN(String ssn)  {
       new RegisterPage().EnterSSN(ssn);
    }

    @And("^I enter Username$")
    public void iEnterUsername()  {
       new RegisterPage().EnterUsername();
    }

    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String pwd)  {
       new RegisterPage().EnterPassword(pwd);
    }

    @And("^I enter ConfirmPassword \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String cpwd)  {
       new RegisterPage().EnterConfirmPassword(cpwd);
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() { new RegisterPage().ClickRegisterButton();
    }

    @Then("^I verify account created text \"([^\"]*)\"$")
    public void iVerifyAccountCreatedText(String msg)  {
        Assert.assertEquals(msg,new RegisterPage().VerifyAccountCreatedText());
    }
}
