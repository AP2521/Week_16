package sw.tutorialsninja.com.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sw.tutorialsninja.com.utility.Utility;

import java.util.List;

public class ProductPageandOrder extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPageandOrder.class.getName());
    public ProductPageandOrder() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortBy;
    @FindBy(xpath = "//div[@class='caption']/h4/a")
    List<WebElement> productList;
    @FindBy(xpath = "//div[@class='col-sm-4']/h1")
    WebElement verifyProductText;
    @FindBy(id = "input-option225")
    WebElement deliveryDate;
    @FindBy(xpath = "//input[@name='quantity']")
    WebElement quantity;
    @FindBy(xpath = "//div[@id='content']/form/div/table/tbody/tr/td[4]/div/input")
    WebElement enterQtyinCart;
    @FindBy(xpath = "//*[@id='content']/form/div/table/tbody/tr/td[4]/div/span/button[1]")
    WebElement updateQty;
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement verifySuccessModified;
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addCartButton;
    @FindBy(linkText = "shopping cart")
    WebElement shoppingCart;
    @FindBy(xpath = "//*[@id='checkout-cart']/ul/li[2]/a")
    WebElement verifyShopping;
    @FindBy(xpath = "//form[@id='form-currency']/div/button/span")
    WebElement clickonCurrency;
    @FindBy(xpath = "//*[@id='form-currency']/div/ul/li/button")
    List<WebElement> currencyButton;
    @FindBy(xpath = "(//table[@class='table table-bordered']/tbody/tr[4]/td[2])[2]")
    WebElement totalAmount;
    @FindBy(xpath = "//div/table/tbody/tr/td[2]/a")
    WebElement nameofProduct;
    @FindBy(xpath = "//div[@id='content']/form/div/table/tbody/tr/td[2]/small[1]")
    WebElement dateOfDeliveryText;
    @FindBy(xpath = "//div[@id='content']/form/div/table/tbody/tr/td[3]")
    WebElement productModelNo;

    public void setSortBy(String Sortby) {
        log.info("Set Sort By Order : " + sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy, Sortby);
    }

    public void selectProduct(String Product) {
        log.info("Select Product : " + productList.toString());
        List<WebElement> topMenuList = productList;
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(Product)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = productList;
        }
    }

    public String verifyProductText() {
        log.info("Verify Product text : " + verifyProductText.toString());
        return getTextFromElement(verifyProductText);
    }

    public void selectDeliverDate(String YMD) {
        log.info("Select delivery date : " + deliveryDate.toString());
        clearSendTextToElement(deliveryDate, YMD);
    }

    public void enterQuantityforDesktop(String qty) {
        log.info("Select Quantity : " + quantity.toString());
        clearSendTextToElement(quantity, qty);
    }

    public void AddtoCart() {
        log.info("Click on Add to cart : " + addCartButton.toString());
        clickOnElement(addCartButton);
    }

    public void clickonShoppingCart() {
        log.info("Click on shopping cart : " + shoppingCart.toString());
        clickOnElement(shoppingCart);
    }

    public String shoppingCartText() {
        log.info("Verify shopping cart text : " + verifyShopping.toString());
        return getTextFromElement(verifyShopping);
    }

    public String verifyProductTextinCart() {
        log.info("Verify Product name text : " + nameofProduct.toString());
        return getTextFromElement(nameofProduct);
    }

    public String verifyDeliveryDate() {
        log.info("Verify Delivary date : " + dateOfDeliveryText.toString());
        return getTextFromElement(dateOfDeliveryText);
    }

    public String verifyModel() {
        log.info("Verify Model no. : " + productModelNo.toString());
        return getTextFromElement(productModelNo);
    }

    public void enterUpdateQTYinCartandVerify(String Qty) {
        log.info("Update quantity : " + enterQtyinCart.toString());
        clearSendTextToElement(enterQtyinCart, Qty);
    }

    public void updateQTY() {
        log.info("Click on update QTY : " + updateQty.toString());
        clickOnElement(updateQty);
    }

    public String verifyModificationText() {
        log.info("Verify Modification QTY text : " + verifySuccessModified.toString());
        return getTextFromElement(verifySuccessModified);
    }

    public void clickCurrencyChange(String enterCurrency) {
        log.info("Change currency : "+clickonCurrency.toString());
        clickOnElement(clickonCurrency);
        List<WebElement> topMenuList = currencyButton;
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(enterCurrency)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = currencyButton;
        }
    }

    public String verifyTotalAmount() {
        log.info("Verify Total amount : "+totalAmount.toString());
        return getTextFromElement(totalAmount);
    }
}