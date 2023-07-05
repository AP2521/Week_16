package visa.home.office.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import visa.home.office.utility.Utility;

public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());
    public StartPage() {
        PageFactory.initElements(driver, this);
    }// error to come alert

    @FindBy(xpath="(//a[@role='button'])[1]")
    WebElement startButton;

    public void clickStartNow(){
        log.info("Click on continue"+startButton.toString());
        clickOnElement(startButton);
    }
}
