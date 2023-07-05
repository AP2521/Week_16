package sw.tutorialsninja.com.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import sw.tutorialsninja.com.pages.TopMenuPage;

public class MenuStepdefs {
    @Given("^User is on Home page$")
    public void userIsOnHomePage() {
    }

    @When("^I Select Menu Items \"([^\"]*)\"$")
    public void iSelectMenuItems(String menu){
        new TopMenuPage().selectMenu(menu);
    }

    @Then("^I Select Show All Items \"([^\"]*)\"$")
    public void iSelectShowAllItems(String showAll) {
        new TopMenuPage().selectMenuContent(showAll);
    }

    @Then("^I verify menu item text \"([^\"]*)\"$")
    public void iVerifyMenuItemText(String text) {
        Assert.assertEquals(text,new TopMenuPage().verifyMenuitem());
    }
}
