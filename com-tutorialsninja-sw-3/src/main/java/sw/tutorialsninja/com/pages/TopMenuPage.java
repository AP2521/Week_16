package sw.tutorialsninja.com.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sw.tutorialsninja.com.utility.Utility;

import java.util.List;

public class TopMenuPage extends Utility {
    private static final Logger log = LogManager.getLogger(TopMenuPage.class.getName());
    public TopMenuPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//ul[@class='nav navbar-nav']/li")
    List<WebElement> MenuBar;

    @FindBy(xpath="//div[@class='dropdown-menu']/a")
    List<WebElement> TabName;

    @FindBy(xpath="//div[@id='content']/h2")
    WebElement VerifyText;

    public void selectMenu(String menu)  {
        log.info("Select Menu Items : " + MenuBar.toString());
        getElementsListandClick(MenuBar, menu); }

    public void selectMenuContent(String menuItem) {
        log.info("Select Show All Menu Items : " + TabName.toString());
        List<WebElement> topMenuList =TabName;
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menuItem)) {
                    element.click();
                }
            }}
        catch (StaleElementReferenceException e) {
            topMenuList = TabName;
        }

    }
        public String verifyMenuitem(){
            log.info("Verify menu items text : " + VerifyText.toString());
          return getTextFromElement(VerifyText);
    }

}
