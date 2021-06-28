package com.practice.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signInPO extends PageObject {
    @FindBy(id = "email")
    private WebElement signInEmail;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "SubmitLogin")
    private WebElement signInBtn;

    @FindBy(id = "email_create")
    private WebElement createAccountEmail;

    @FindBy(id = "SubmitCreate")
    private WebElement createAnAccountBtn;

    @FindBy(xpath = "//a[@href=\"http://automationpractice.com/index.php?controller=password\"]")
    private WebElement forgotYourPass;




    public void createAccount(String email) {
        createAccountEmail.sendKeys(email);
        createAnAccountBtn.click();
    }
}
