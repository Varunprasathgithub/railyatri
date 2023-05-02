package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverUtils extends BasePage {

    @Before
    public void launchDriverAndBrowser() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\varun\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.railyatri.in/");
    }


    @After
    public void closeBrowserSession() {
        driver.quit();
    }

}
