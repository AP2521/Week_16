package visa.home.office.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import visa.home.office.utility.Utility;

import java.util.List;

public class WorkTypePage extends Utility {
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());
    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }// error to come alert

    @FindBy(xpath="//div[@class='govuk-radios']/div/label")
    List<WebElement> jobTypeList;

    @FindBy(xpath="(//button[@type='submit'])[4]")
    WebElement nextButton;
    public void selectJobType(String job){
        log.info("Select Job Type"+jobTypeList.toString());
        getElementsListandClick(jobTypeList,job);
    }
    public void clickNextStepButton(){
        log.info("Click on continue"+nextButton.toString());
        clickOnElement(nextButton);}
}
