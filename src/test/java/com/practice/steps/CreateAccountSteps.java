package com.practice.steps;

import com.google.gson.*;
import com.practice.actions.*;
import com.practice.pages.*;
import com.practice.pojo.*;
import net.thucydides.core.annotations.*;
import net.thucydides.core.steps.*;

import java.io.*;
import java.nio.file.*;

import static com.practice.util.FileUtil.createAAObj;

public class CreateAccountSteps extends ScenarioSteps {

    private CreateAccountAddressPO createAccountAddressPO;
    private CreateAccountPersonalInfoPO createAccountPersonalInfoPO;

    @Steps
    private CreateAccountAction createAccountAction;

    @Step ("Fill all Account Address information")
    public void completeAccountAddress(String path){
        AccountAddress accountAddress = createAAObj(path);
            //createAccountAction.fillAccountPersonalInfo(personalInformation);
            createAccountAction.fillAccountAddress(accountAddress);
    }



    @Step ("Click on Register button")
    public void clickRegisterButton(){
        createAccountAction.clickRegisterButton();

    }
}
