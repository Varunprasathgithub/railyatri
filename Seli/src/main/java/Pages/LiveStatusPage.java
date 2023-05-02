package Pages;

import StepDef.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LiveStatusPage extends BasePage {

    @FindBy(xpath = "//a[@class='RY_vertical train_info_list train-info hide_action']")
    public static WebElement trainInfoDd;

    @FindBy(xpath = "//a[contains(text(),'Live Train Status')]")
    public static WebElement liveTrainSts;

    @FindBy(xpath = "//p[contains(text(),'Search by Train')]")
    public static WebElement searchSection;

    @FindBy(xpath = "//p[contains(text(),'Train Number/Name')]")
    public static WebElement searchBoxHeading;

    @FindBy(css = "input#train_running_status")
    public static WebElement searchBox;

    @FindBy(css = "li#ui-id-4")
    public static WebElement autoSugg;

    @FindBy(css = "button.btn.find-train-btn")
    public static WebElement checkStsBtn;

    @FindBy(xpath = "//div[contains(text(),'Arrival')]")
    public static WebElement arrivalCol;

    @FindBy(xpath = "//div[contains(text(),'Station')]")
    public static WebElement stationCol;

    @FindBy(xpath = "//div[contains(text(),'Departure')]")
    public static WebElement departureCol;



    public LiveStatusPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public void clickOnTrainInfoDd() {
        trainInfoDd.click();
        System.out.println("Train info dropdown is clicked");
    }

    public void clickOnLiveTrainSts() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(liveTrainSts));
        liveTrainSts.click();
        System.out.println("Selected Live Train Status from Train info dropdown");
    }

    public void enterNoInTxtBox(String str) {
        searchBox.sendKeys(str);
        System.out.println("Entered Train number");
    }

    public void verifySearchSection() {
        Assert.assertEquals(searchSection.getText(),"Search by Train");
        System.out.println("Actual search section is "+searchSection.getText()+ "   Expected search section is Search by Train" );
    }

    public void printSearchBoxHeading() {
        System.out.println("Search box heading is "+searchBoxHeading.getText());
    }

    public void clickOnCheckStsBtn() {
        checkStsBtn.click();
        System.out.println("Clicked on Check Status button");
    }

    public void printHelpers() {
        System.out.println();
    }

}
