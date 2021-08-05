package com.practice.pages;

import net.serenitybdd.core.pages.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;



public class CreateAccountAddressPO extends PageObject {

    @FindBy (id = "firstname")
    public WebElement firstName;

    @FindBy (id = "lastname")
    public WebElement lastName;

    @FindBy (id = "company")
    public WebElement company;

    @FindBy (id = "address1")
    public WebElement address1;

    @FindBy (id = "address2")
    public WebElement address2;

    @FindBy (id = "city")
    public WebElement city;

    @FindBy (id ="id_state")
    public WebElement state;

    @FindBy (id = "postcode")
    public WebElement zipPostalCode;

    @FindBy (id = "id_country")
    public WebElement country;

    @FindBy (id = "other")
    public WebElement additionalInformation;

    @FindBy (id ="phone")
    public WebElement phoneHome;

    @FindBy (id = "phone_mobile")
    public WebElement mobilePhone;

    @FindBy (id = "alias")
    public WebElement assignAnAddressAlias;

    @FindBy (id = "submitAccount")
    public WebElement registerBtn;


}
