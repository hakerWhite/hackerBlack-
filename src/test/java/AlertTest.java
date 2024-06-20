import com.demoqa.helper.WebElementActions;
import com.demoqa.pages.BasePage;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {

    @Test(groups = {"Smoke","UI","1721"},description = "Alert test")
    @Description("Verify that alert is present")
    @Owner("Aiba")
    @Tag("Smoke")
    @Severity(SeverityLevel.CRITICAL)
    @Story("GCPINT-8877")
    @Epic("Registration")
    @Link("www.google.com")
    void aLertTest() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        webElementActions.click(demoQAPages.getAlertPage().confirmAlertBtn);
        alertHelper.acceptAlert();

    }
    @Test(groups = {"Regression","API","1722"},description = "Alert test1")
    void aLertTest1() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        webElementActions.click(demoQAPages.getAlertPage().confirmAlertBtn);
        alertHelper.acceptAlert();

    }
    @Test(groups = {"E2E","SQL","1723"},description = "Alert test2")
    void aLertTest2() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        webElementActions.click(demoQAPages.getAlertPage().confirmAlertBtn);
        alertHelper.acceptAlert();

    }


}