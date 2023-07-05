package uk.library.cv.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.library.cv.utility.Utility;


/**
 * Created by Anish
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }// error to come alert
   @FindBy(id="keywords")
    WebElement JobTitle;
   @FindBy(id="location")
    WebElement Location;
   @FindBy(xpath="//select[@id='distance']")
    WebElement Distance;
   @FindBy(id="toggle-hp-search")
    WebElement MoreSearchOption;
   @FindBy(id="salarymin")
    WebElement SalaryMin;
   @FindBy(id="salarymax")
    WebElement SalaryMax;
   @FindBy(xpath="//select[@id='salarytype']")
    WebElement SalaryType;
   @FindBy(id="tempperm")
    WebElement JobType;
   @FindBy(id="hp-search-btn")
    WebElement FindJobs;

   public void enterJobTitle(String jobTitle){
       log.info("Send text to Jobtitle"+JobTitle.toString());
       sendTextToElement(JobTitle,jobTitle);
   }
   public void enterLocation(String location){
       log.info("Send text to Location"+Location.toString());
       sendTextToElement(Location,location);
   }
   public void selectDistance(String distance){
       log.info("Select Distance"+Distance.toString());
       selectByVisibleTextFromDropDown(Distance,distance);
   }
   public void clickOnMoreSearchOptionLink(){
       log.info("Click on More search button"+MoreSearchOption.toString());
       clickOnElement(MoreSearchOption);
   }
   public void enterMinSalary(String salaryMin){
       log.info("Select Salary minimum"+SalaryMin.toString());
       sendTextToElement(SalaryMin,salaryMin);
   }
   public void enterMaxSalary(String salaryMax){
       log.info("Select Salary Maximum"+SalaryMax.toString());
       sendTextToElement(SalaryMax,salaryMax);
   }
   public void selectSalaryType(String salaryType){
       log.info("Select Salary type"+SalaryType.toString());
       selectByVisibleTextFromDropDown(SalaryType,salaryType);
   }
   public void selectJobType(String jobType){
       log.info("Select job type"+JobType.toString());
       selectByVisibleTextFromDropDown(JobType,jobType);
   }
   public void clickOnFindJobsButton(){
       log.info("Click on find job"+FindJobs.toString());
       clickOnElement(FindJobs);
   }


}
