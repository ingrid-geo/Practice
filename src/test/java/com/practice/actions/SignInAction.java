package com.practice.actions;

import com.practice.pages.SignInPO;

public class SignInAction {
    private SignInPO signInPO;

    public void createAccount(String email) {
        signInPO.createAccountEmail.sendKeys(email);
        signInPO.createAnAccountBtn.click();
    }
}
