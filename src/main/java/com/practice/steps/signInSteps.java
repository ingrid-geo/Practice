package com.practice.steps;

import com.practice.pages.signInPO;
import net.thucydides.core.annotations.*;
import net.thucydides.core.steps.*;


public class signInSteps extends ScenarioSteps {

     private signInPO signInPO;

    @Step ("Check that user can access create account page")
    public void clickOnCreateAccount(String email){
        signInPO.createAccount(email);
    }

}
