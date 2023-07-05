package uk.library.cv.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.library.cv.pages.HomePage;
import uk.library.cv.pages.ResultPage;

public class JobSearchStepdefs {
    @Given("^User is on Job search page$")
    public void userIsOnJobSearchPage() {
    }

    @When("^I enter jobTitle \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobtitle)  {
       new HomePage().enterJobTitle(jobtitle);
    }

    @And("^I enter location \"([^\"]*)\"$")
    public void iEnterLocation(String location)  {
       new HomePage().enterLocation(location);
    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance)  {
       new HomePage().selectDistance(distance);
    }

    @And("^I click on search more option$")
    public void iClickOnSearchMoreOption() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^I enter minimum salary \"([^\"]*)\"$")
    public void iEnterMinimumSalary(String minSalary)  {
       new HomePage().enterMinSalary(minSalary);
    }

    @And("^I enter maximum salary \"([^\"]*)\"$")
    public void iEnterMaximumSalary(String maxSalary)  {
       new HomePage().enterMaxSalary(maxSalary);
    }

    @And("^I select salary type \"([^\"]*)\"$")
    public void iSelectSalaryType(String salaryType)  {
       new HomePage().selectSalaryType(salaryType);
    }

    @And("^I select job type \"([^\"]*)\"$")
    public void iSelectJobType(String jobType)  {
       new HomePage().selectJobType(jobType);
    }

    @And("^I click on find job$")
    public void iClickOnFindJob() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("^I should search job successfully and see \"([^\"]*)\"$")
    public void iShouldSearchJobSuccessfullyAndSee(String result)  {
       new ResultPage().verifyResultPageText(result);
    }
}
