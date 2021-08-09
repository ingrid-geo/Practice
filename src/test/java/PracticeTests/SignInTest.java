package PracticeTests;

import com.practice.steps.*;
import net.serenitybdd.junit.runners.*;
import net.thucydides.core.annotations.*;
import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.MethodSorters;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SignInTest extends BaseTestClass{
    @Steps
    SignInSteps signInStep;
    @Steps
    CreateAccountSteps createAccountStep;

    @Test
    @Title("Verify if user is redirected to create account page")
    public void createAccount (){
        signInSteps.clickOnCreateAccount("ingrid.pironescu@softvision.com");
    }

    @Test
    @Title("Verify if user can complete all create account details and click on Register Button")
    public void completeNewAccountDetails(){
        signInSteps.clickOnCreateAccount("ingrid.pironescu@softvision.com");
        createAccountStep.completeAccountAddress("/src/test/resources/testData/createAccountAddress.json");
        createAccountStep.clickRegisterButton();
    }

    @Title("Verify if user can complete all create account details and click on Register Button")
    public void completeNewAccountDetails1(){
        signInSteps.clickOnCreateAccount("ingrid.pironescu@softvision.com");
        createAccountStep.completeAccountAddress("/src/test/resources/testData/createAccountAddress12334.json");
        createAccountStep.clickRegisterButton();
    }
}
