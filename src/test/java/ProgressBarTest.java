import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest {

    @Test(description = "Test to stop the progress bar when it reaches 53%")
    public void progressBarTest() throws InterruptedException {
        browserHelper.open("https://demoqa.com/progress-bar");
        webElementActions.click(demoQAPages.getProgressBarPage().startStopButton);
        boolean stopClick = false;
        while (!stopClick) {
            String prBar = demoQAPages.getProgressBarPage().progressBar.getAttribute("aria-valuenow");
            int progressValue = Integer.parseInt(prBar);
            if (progressValue >= 52) {
                webElementActions.click(demoQAPages.getProgressBarPage().startStopButton);
                stopClick = true;
            }
        }
        String Final52 = demoQAPages.getProgressBarPage().progressBar.getAttribute("aria-valuenow");
        System.out.println("Final progress value(52): " + Final52);
        Assert.assertEquals(Final52, "53");
    }

}
