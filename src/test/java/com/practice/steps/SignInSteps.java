package com.practice.steps;

import com.practice.actions.SignInAction;
import net.thucydides.core.annotations.*;
import net.thucydides.core.steps.*;


public class SignInSteps extends ScenarioSteps {

    @Steps
    private SignInAction signInAction;

    @Step ("Check that user can access create account page")
    public void clickOnCreateAccount(String email){
        signInAction.createAccount(email);
    }
}
