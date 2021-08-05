package com.practice.pages;

import net.serenitybdd.core.pages.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class CreateAccountPersonalInfoPO extends PageObject {
    @FindBy(id = "id_gender1")
    public WebElement titleMR;

    @FindBy(id = "id_gender2")
    public WebElement titleMRS;

    @FindBy(id = "customer_firstname")
    public WebElement firstName;

    @FindBy(id = "customer_lastname")
    public WebElement lastName;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy (id ="days")
    public WebElement dateOfBirthDays;

    @FindBy (id = "months")
    public WebElement dateOfBirthMonths;

    @FindBy (id = "years")
    public WebElement dateOfBirthYears;

}
