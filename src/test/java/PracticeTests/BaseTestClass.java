package PracticeTests;

import com.practice.steps.*;
import net.thucydides.core.annotations.*;
import org.junit.*;
import org.openqa.selenium.*;

public class BaseTestClass {

    @Managed
    WebDriver driver;

    @Steps
    protected signInSteps signInSteps;

    @Before
    public void setupTest(){
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @After
    public void tearDownTest(){
        driver.close();
        driver.quit();
    }
}
