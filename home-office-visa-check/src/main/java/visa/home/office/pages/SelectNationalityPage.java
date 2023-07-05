package visa.home.office.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import visa.home.office.utility.Utility;

public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());
    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }// error to come alert
    @FindBy(id="response")
    WebElement nationalityList;
    @FindBy(xpath="(//button[@type='submit'])[4]")
    WebElement continueButton;

    public void selectNationality(String nationality){
        log.info("Select Nationality"+nationalityList.toString());
        selectByVisibleTextFromDropDown(nationalityList,nationality);
    }
    public void clickNextStepButton(){
        log.info("Click on continue"+continueButton.toString());
        clickOnElement(continueButton);}
}
