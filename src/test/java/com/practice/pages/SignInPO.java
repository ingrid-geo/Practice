package com.practice.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPO extends PageObject {
    @FindBy(id = "email")
    public WebElement signInEmail;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(id = "SubmitLogin")
    public WebElement signInBtn;

    @FindBy(id = "email_create")
    public WebElement createAccountEmail;

    @FindBy(id = "SubmitCreate")
    public WebElement createAnAccountBtn;

    @FindBy(xpath = "//p[contains(@class,\"lost_password\")]/a")
    public WebElement forgotYourPass;

}
