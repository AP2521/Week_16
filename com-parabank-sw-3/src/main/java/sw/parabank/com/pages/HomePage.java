package sw.parabank.com.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sw.parabank.com.browserfactory.ManageBrowser;
import sw.parabank.com.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage(){
        PageFactory.initElements(ManageBrowser.driver,this);
    }

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink ;

    @CacheLookup
    @FindBy(css="div[id='rightPanel']>h1")
    WebElement signup;

    public void clickOnLoginLink(){
        log.info("Click on Login Button"+loginLink.toString());
        clickOnElement(loginLink); }

    public void clickOnRegisterLink(){
        log.info("Click on Register Button"+registerLink.toString());
        clickOnElement(registerLink); }

    public String verifySignUpText(){
        log.info("Verify Signup Text"+signup.toString());
        return getTextFromElement(signup);
    }

}
