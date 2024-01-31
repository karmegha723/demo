package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Unit test for simple App.
 */
@RunWith(SerenityRunner.class)
public class AppTest {
    @Managed(driver = "appium")
    public WebDriver driver;

   /* @Steps
    FlipboardSteps flipboard;*/

    @Test
    public void loginTest() {
        driver.get("https://google.com");
        /*flipboard.clickGetStartedButton();
        flipboard.chooseTopics(3);
        flipboard.clickContinueButton();*/
    }

}

