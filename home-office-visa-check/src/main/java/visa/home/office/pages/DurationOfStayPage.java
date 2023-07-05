package visa.home.office.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import visa.home.office.utility.Utility;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());
    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }// error to come alert

    @FindBy(xpath="(//button[@type='submit'])[4]")
    WebElement nextButton;
    @FindBy(xpath="(//div[@class='govuk-radios']/div/label)[1]")
    WebElement monthorLess;
    @FindBy(xpath="(//div[@class='govuk-radios']/div/label)[2]")
    WebElement monthOrMore;

    public void selectImmigrationStatus(String value) {
        log.info("select month or less"+monthorLess.toString());

        switch (value){
            case "6 months or less":
                clickOnElement(monthorLess);
                break;
            case "longer than 6 months":
                log.info("Select month or more"+monthOrMore.toString());
                clickOnElement(monthOrMore);
                break;
            default:
                break;
        }
    }
    public void clickNextStepButton(){
        log.info("Click on continue Button"+nextButton.toString());
        clickOnElement(nextButton);}
}


