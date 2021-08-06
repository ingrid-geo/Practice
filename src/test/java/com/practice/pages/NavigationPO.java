package com.practice.pages;

import net.serenitybdd.core.pages.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class NavigationPO extends PageObject {

    @FindBy(id = "contact-link")
    public WebElement contactUsBtn;

    @FindBy(className = "header_user_info")
    public WebElement signInBtn;

    @FindBy(className = "shopping_cart")
    public WebElement cartBtn;

    @FindBy(xpath = "//div[@id='block_top_menu']/ul/li/a")
    public WebElement womenMenu;

    @FindBy(xpath = "///div[@id='block_top_menu']/ul/li[2]/a")
    public WebElement dressesMenu;

    @FindBy(xpath = "//div[@id='block_top_menu']/ul/li[3]/a")
    public WebElement tshirtsMenu;


}
