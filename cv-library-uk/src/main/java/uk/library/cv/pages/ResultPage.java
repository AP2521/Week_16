package uk.library.cv.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.library.cv.utility.Utility;


public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }// error to come alert

    @FindBy(xpath="//h1[@class='search-header__title']")
    WebElement VerifyResultpage;

    public void verifyResultPageText(String expected){
        log.info("Verify Result"+VerifyResultpage.toString());
        verifyThatTextIsDisplayed(VerifyResultpage,expected);
    }
}
