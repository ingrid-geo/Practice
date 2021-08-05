package com.practice.pages;

import net.serenitybdd.core.pages.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class NavigationPO extends PageObject {

    @FindBy(id = "contact-link")
    private WebElement contactUsBtn;

    @FindBy(className = "header_user_info")
    private WebElement signInBtn;

    @FindBy(className = "shopping_cart")
    private WebElement cartBtn;

    @FindBy(xpath = "//div[@id='block_top_menu']/ul/li/a")
    private WebElement womenMenu;

    @FindBy(xpath = "///div[@id='block_top_menu']/ul/li[2]/a")
    private WebElement dressesMenu;

    @FindBy(xpath = "//div[@id='block_top_menu']/ul/li[3]/a")
    private WebElement tshirtsMenu;


}
