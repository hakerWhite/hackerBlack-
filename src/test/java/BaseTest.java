import com.demoqa.drivers.DriverManager;
import com.demoqa.helper.AlertHelper;
import com.demoqa.helper.BrowserHelper;
import com.demoqa.helper.WebElementActions;
import com.demoqa.pages.DemoQAPages;
import com.demoqa.utils.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected RandomUtils randomUtils;
    protected WebDriverWait wait;
    protected DemoQAPages demoQAPages;
    protected WebElementActions webElementActions;
    protected AlertHelper alertHelper;
    protected BrowserHelper browserHelper;



    @BeforeClass(alwaysRun = true)
    public void setUp(){
        driver = DriverManager.getDriver();
        randomUtils = new RandomUtils();
        webElementActions = new WebElementActions();
        alertHelper = new AlertHelper(driver);
        browserHelper = new BrowserHelper(driver);
        demoQAPages = new DemoQAPages();
        demoQAPages.setUp();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

//@AfterClass(alwaysRun = true)
//    public void thearDown(){
//        driver.close();
//      driver.quit();
//}

    @BeforeClass(alwaysRun = true)
    public void setUp3() {
        driver = DriverManager.getDriver();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        DriverManager.CloseDriver();
    }
}