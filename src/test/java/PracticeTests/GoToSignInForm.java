package PracticeTests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(SerenityRunner.class)
public class GoToSignInForm {
    @Managed(driver="chrome")
    WebDriver driver;

    @Step
    public class signIn extends PageObject {
        public void click_on_LogIn_Button() {
            open();
            WebElement link = getDriver().findElement(By.xpath(//nav/div/a[@href="http://automationpractice.com/index.php?controller=my-account"]));
           link.click();
        }
    }


}
