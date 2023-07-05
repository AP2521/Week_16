package sw.parabank.com.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sw.parabank.com.utility.Utility;

import java.util.Random;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink ;

    @CacheLookup
    @FindBy(id="customer.firstName")
    WebElement FirstName;

    @CacheLookup
    @FindBy(id="customer.lastName")
    WebElement LastName;

    @CacheLookup
    @FindBy(id="customer.address.street")
    WebElement AddressStreet;

    @CacheLookup
    @FindBy(id="customer.address.city")
    WebElement AddressCity;

    @CacheLookup
    @FindBy(id="customer.address.state")
    WebElement AddressState;

    @CacheLookup
    @FindBy(id="customer.address.zipCode")
    WebElement AddressZipcode;

    @CacheLookup
    @FindBy(id="customer.phoneNumber")
    WebElement PhoneNumber;

    @CacheLookup
    @FindBy(id="customer.ssn")
    WebElement SSN;

    @CacheLookup
    @FindBy(id="customer.username")
    WebElement Username;

    @CacheLookup
    @FindBy(id="customer.password")
    WebElement Password;

    @CacheLookup
    @FindBy(id="repeatedPassword")
    WebElement ConfirmPassword;

    @CacheLookup
    @FindBy(xpath="//input[@value='Register']")
    WebElement RegisterButton;

    @CacheLookup
    @FindBy(xpath="//div[@id='rightPanel']/p")
    WebElement AccountCreatedText;

    public void clickOnRegisterLink(){
        log.info("Click on Register Button"+registerLink.toString());
        clickOnElement(registerLink); }

    public void EnterFirstName(String firstname){
        log.info("Enter Firstname"+FirstName.toString());
        sendTextToElement(FirstName,firstname);
    }
    public void EnterLastname(String lastname){
        log.info("Enter Lastname"+LastName.toString());
        sendTextToElement(LastName,lastname);
    }
    public void EnterAddressStreet(String addressStreet){
        log.info("Enter Street Address"+AddressStreet.toString());
        sendTextToElement(AddressStreet,addressStreet);
    }
    public void EnterAddressCity(String addressCity){
        log.info("Enter City"+AddressCity.toString());
        sendTextToElement(AddressCity,addressCity);
    }
    public void EnterAddressState(String addressState){
        log.info("Enter State"+AddressState.toString());
        sendTextToElement(AddressState,addressState);
    }
    public void AddressZipcode(String addressZipcode){
        log.info("Enter Zipcode"+AddressZipcode.toString());
        sendTextToElement(AddressZipcode,addressZipcode);
    }
    public void PhoneNumber(String phoneNumber){
        log.info("Enter Phone number"+PhoneNumber.toString());
        sendTextToElement(PhoneNumber,phoneNumber);
    }
    public void EnterUsername(){
        log.info("Enter Username"+Username.toString());
        Random random = new Random();
        int randomint = random.nextInt(1000);
        sendTextToElement(Username,"anish"+randomint);
    }
    public void EnterSSN(String ssn){
        log.info("Enter Social Security no."+SSN.toString());
        sendTextToElement(SSN,ssn);
    }
    public void EnterPassword(String password){
        log.info("Enter Password"+Password.toString());
        sendTextToElement(Password,password);
    }
    public void EnterConfirmPassword(String confirmPassword){
        log.info("Enter Confirm Password"+ConfirmPassword.toString());
        sendTextToElement(ConfirmPassword,confirmPassword);
    }
    public void ClickRegisterButton(){
        log.info("Click on Register Button"+RegisterButton.toString());
        clickOnElement(RegisterButton);
    }
    public String VerifyAccountCreatedText(){
        log.info("Verify Account Created Text"+AccountCreatedText.toString());
        return getTextFromElement(AccountCreatedText);
    }

}
