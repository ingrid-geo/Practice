package PracticeTests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

@RunWith(SerenityRunner.class)
public class GoToMainPage {

    @Managed(driver="chrome")
    WebDriver driver;

    @Test
    public void navigateToMainPage(){
            driver.navigate().to("http://automationpractice.com/");
    }
}
