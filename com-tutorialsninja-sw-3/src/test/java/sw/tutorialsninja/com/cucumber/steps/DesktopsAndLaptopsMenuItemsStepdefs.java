package sw.tutorialsninja.com.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import sw.tutorialsninja.com.pages.ProductPageandOrder;
import sw.tutorialsninja.com.pages.TopMenuPage;

public class DesktopsAndLaptopsMenuItemsStepdefs {
    @Given("^I am on HomePage$")
    public void iAmOnHomePage() {
    }

    @When("^I click on menu item \"([^\"]*)\"$")
    public void iClickOnMenuItem(String menu) {
        new TopMenuPage().selectMenu(menu);
    }

    @And("^I click Show all menu item button \"([^\"]*)\"$")
    public void iClickShowAllMenuItemButton(String showAll) {
        new TopMenuPage().selectMenuContent(showAll);
    }

    @And("^I click on sort by order \"([^\"]*)\"$")
    public void iClickOnSortByOrder(String sortBy)  {
        new ProductPageandOrder().setSortBy(sortBy);
    }

    @And("^I Select Product \"([^\"]*)\"$")
    public void iSelectProduct(String product)  {
        new ProductPageandOrder().selectProduct(product);
    }

    @And("^I verify Product text \"([^\"]*)\"$")
    public void iVerifyProductText(String text)  {
        Assert.assertEquals(text,new ProductPageandOrder().verifyProductText());
    }

    @And("^I select Delivery Date \"([^\"]*)\"$")
    public void iSelectDeliveryDate(String deliveryDate)  {
        new ProductPageandOrder().selectDeliverDate(deliveryDate);
    }

    @And("^I enter Quantity \"([^\"]*)\"$")
    public void iEnterQuantity(String QTY)  {
        new ProductPageandOrder().enterQuantityforDesktop(QTY);
    }

    @And("^I click on Add to cart button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        new ProductPageandOrder().AddtoCart();
        Thread.sleep(2000);
    }

    @And("^I click on Shopping Cart$")
    public void iClickOnShoppingCart() {
        new ProductPageandOrder().clickonShoppingCart();
    }

    @And("^I verify product text in Cart \"([^\"]*)\"$")
    public void iVerifyProductTextInCart(String productText) {
        Assert.assertEquals(productText,new ProductPageandOrder().verifyProductTextinCart());
    }

    @And("^I verify Delivery Date \"([^\"]*)\"$")
    public void iVerifyDeliveryDate(String DeliveryDate)  {
        Assert.assertEquals(DeliveryDate,new ProductPageandOrder().verifyDeliveryDate());
    }

    @And("^I verify modelno\\. \"([^\"]*)\"$")
    public void iVerifyModelno(String modelNo)  {
        Assert.assertEquals(modelNo,new ProductPageandOrder().verifyModel());
    }

    @And("^I click on currency change \"([^\"]*)\"$")
    public void iClickOnCurrencyChange(String currency)  {
        new ProductPageandOrder().clickCurrencyChange(currency);
    }

    @Then("^I verify Total Amount \"([^\"]*)\"$")
    public void iVerifyTotalAmount(String totalAmount)  {
        Assert.assertEquals(totalAmount,new ProductPageandOrder().verifyTotalAmount());
    }

    @And("^I Edit quantity \"([^\"]*)\"$")
    public void iEditQuantity(String editQty)  {
        new ProductPageandOrder().enterUpdateQTYinCartandVerify(editQty);
    }

    @And("^I Update Quantity$")
    public void iUpdateQuantity() {
        new ProductPageandOrder().updateQTY();
    }

    @And("^I verify quantity update text$")
    public void iVerifyQuantityUpdateText() {
        Assert.assertEquals("Success: You have modified your shopping cart!\n"+"×",new ProductPageandOrder().verifyModificationText());
    }
}
