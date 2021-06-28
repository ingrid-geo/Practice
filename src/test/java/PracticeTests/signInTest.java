package PracticeTests;

import net.serenitybdd.junit.runners.*;
import net.thucydides.core.annotations.*;
import org.junit.*;
import org.junit.runner.*;

@RunWith(SerenityRunner.class)
public class signInTest extends BaseTestClass{

    @Test
    @Title("Verify if user is redirected to create account page")
    public void createAccount (){
        signInSteps.clickOnCreateAccount("ingrid.pironescu@softvision.com");
    }

}
