package com.demoqa.pages;
import lombok.*;
import org.testng.annotations.BeforeClass;




@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DemoQAPages {

    protected TextBoxPage textBoxPage;
    protected AlertPage alertPage;
    protected PracticeFormPage practiceFormPage;
    protected ButtonsPage buttonsPage;
    protected MenuPage menuPage;
    protected ProgressBarPage progressBarPage;
    protected OrangeAdminPage orangeAdminPage;
    protected OrangeLoginPage orangeLoginPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        textBoxPage = new TextBoxPage();
        alertPage = new AlertPage();
        practiceFormPage = new PracticeFormPage();
        buttonsPage = new ButtonsPage();
        menuPage = new MenuPage();
        progressBarPage = new ProgressBarPage();
        orangeAdminPage = new OrangeAdminPage();
        orangeLoginPage = new OrangeLoginPage();

    }
}
