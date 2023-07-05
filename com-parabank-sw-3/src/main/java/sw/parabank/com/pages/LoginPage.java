package sw.parabank.com.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sw.parabank.com.browserfactory.ManageBrowser;
import sw.parabank.com.utility.Utility;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public LoginPage(){
        PageFactory.initElements(ManageBrowser.driver,this);
    }

    @CacheLookup
    @FindBy(xpath="//input[@name='username']")
    WebElement UserName;

    @CacheLookup
    @FindBy(xpath="//input[@name='password']")
    WebElement Password;

    @CacheLookup
    @FindBy (xpath="//input[@value='Log In']")
    WebElement LoginButton;

    @CacheLookup
    @FindBy (xpath="//h1[@class='title']")
    WebElement VerifyText;

    @CacheLookup
    @FindBy(xpath="//*[@id='rightPanel']/p")
    WebElement ErrorText;

    @CacheLookup
    @FindBy(xpath="//div[@id='leftPanel']/ul/li[8]/a")
    WebElement Logout;

    @CacheLookup
    @FindBy(xpath="//div[@id='leftPanel']/h2")
    WebElement  CustomerLogin;

    public void EnterUserName(String name){
        log.info("Enter Username"+UserName.toString());
        sendTextToElement(UserName,name);
    }
    public void EnterPassword(String password){
        log.info("Enter Password"+Password.toString());
        sendTextToElement(Password,password);
    }
    public void ClickLogin() {
        log.info("Click on Login Button"+LoginButton.toString());
        clickOnElement(LoginButton);
    }
    public String VerifyLoginText(){
        log.info("Verify Text"+VerifyText.toString());
        return getTextFromElement(VerifyText);
    }
    public String VerifyErrorText(){
        log.info("Verify Error Text"+ErrorText.toString());
        return getTextFromElement(ErrorText);
    }
    public void LogOutButton(){
        log.info("Click on Logout Button"+Logout.toString());
        clickOnElement(Logout);}

    public String VerifyLogoutText() {
        log.info("Verify Customer Login Text"+CustomerLogin.toString());
        return getTextFromElement(CustomerLogin);}

}
