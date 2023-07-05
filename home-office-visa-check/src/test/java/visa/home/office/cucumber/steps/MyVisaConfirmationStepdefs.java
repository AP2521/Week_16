package visa.home.office.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import visa.home.office.pages.*;

public class MyVisaConfirmationStepdefs {
    @Given("^User is on Home page$")
    public void userIsOnHomePage() {
    }
    @When("^I click on Start Button$")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }
    @And("^I select Nationality \"([^\"]*)\"$")
    public void iSelectNationality(String nationality)  {
        new SelectNationalityPage().selectNationality(nationality);
    }
    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }
    @And("^I select reason for visit \"([^\"]*)\"$")
    public void iSelectReasonForVisit(String reasonforVisit)  {
        new ReasonForTravelPage().selectReasonForVisit(reasonforVisit);
    }
    @And("^I select Immigration status \"([^\"]*)\"$")
    public void iSelectImmigrationStatus(String immigrationStatus)  {
        new FamilyImmigrationStatusPage().selectImmigrationStatus(immigrationStatus);
    }
    @And("^I select Job type\"([^\"]*)\"$")
    public void iSelectJobType(String jobType)  {
        new WorkTypePage().selectJobType(jobType);
    }
    @And("^I select Duration of stay \"([^\"]*)\"$")
    public void iSelectDurationOfStay(String duratioOfStay){
        new DurationOfStayPage().selectImmigrationStatus(duratioOfStay);
    }
    @Then("^I should get result and see \"([^\"]*)\"$")
    public void iShouldGetResultAndSee(String result)  {
        new ResultPage().confirmResultMessage(result);
    }
}
