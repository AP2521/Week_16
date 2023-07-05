package visa.home.office.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import visa.home.office.utility.Utility;

public class FamilyImmigrationStatusPage extends Utility {
    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());
    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }// error to come alert
    @FindBy(xpath="(//button[@type='submit'])[4]")
    WebElement nextButton;
    @FindBy(xpath="(//div[@class='govuk-radios']/div/label)[1]")
    WebElement clickYes;
    @FindBy(xpath="(//div[@class='govuk-radios']/div/label)[2]")
    WebElement clickNo;

    public void selectImmigrationStatus(String value) {
        switch (value){
            case "Yes":
                log.info("Select value yes"+clickYes.toString());
                clickOnElement(clickYes);
                break;
            case "No":
                log.info("Select value No"+clickNo.toString());
                clickOnElement(clickNo);
                break;
            default:
                break;
        }
    }
    public void clickNextStepButton(){
        log.info("Click on continue"+nextButton.toString());
        clickOnElement(nextButton);}
}