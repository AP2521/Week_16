package visa.home.office.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import visa.home.office.utility.Utility;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }// error to come alert
    @FindBy(xpath="//div[@class='govuk-!-margin-bottom-6']/h2")
    WebElement resultPage;

    public String getResultMessage(){
        log.info("Verify Result Text"+resultPage.toString());
        String actualText = resultPage.getText();
        return actualText;
    }
    public void confirmResultMessage(String expectedMessage){
        ResultPage resultPage = new ResultPage();
        String actualMessage = resultPage.getResultMessage();
        Assert.assertTrue(actualMessage.equalsIgnoreCase(expectedMessage));

    }
}
