package hw5.Tests.Ex1;

import hw5.StepsPattern.DifferentElementPageSteps;
import hw5.StepsPattern.HomePageSteps;
import hw5.Tests.TestBase.TestBase;
import hw5.utils.AllureScreenshotListener;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(AllureScreenshotListener.class)
public class FunctionalTest2 extends TestBase {

    protected DifferentElementPageSteps differentElementPageSteps;
    protected HomePageSteps homePageSteps;

    @Story("Log in to site, go to Different Element page, then testing functionality of radio buttons, checkboxes and dropdown")

    @BeforeMethod
    public void init() {
        homePageSteps = new HomePageSteps(driver);
        differentElementPageSteps = new DifferentElementPageSteps(driver);
    }

    @Test
    public void functionalTest() throws InterruptedException {
        standartOperations();
        differentElementPageSteps.goToDifferentElementPage();
        differentElementPageSteps.selectingCheckbox("Water");
        differentElementPageSteps.selectingCheckbox("Wind");
        differentElementPageSteps.selectingRadio("Selen");
        differentElementPageSteps.selectingColorDropdownTo("Yellow");
        differentElementPageSteps.individualLogRowForCheckboxIsDisplayed("Water", "true");
        differentElementPageSteps.individualLogRowForCheckboxIsDisplayed("Wind", "true");
        differentElementPageSteps.individualLogRowForRadioButtonIsDisplayed("Selen");
        differentElementPageSteps.individualLogRowForDropdownIsDisplayed("Yellow");
    }
}
