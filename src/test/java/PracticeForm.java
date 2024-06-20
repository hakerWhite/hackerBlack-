import com.demoqa.entities.PracticeFormEntity;
import com.demoqa.pages.PracticeFormPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracticeForm extends BaseTest {
    @Test
    public void testFormFill() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        PracticeFormEntity practiceFormEntity = randomUtils.generateRandomPracticeFormEntity();
        demoQAPages.getPracticeFormPage().fillForm(practiceFormEntity);

    }






}


