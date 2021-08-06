package com.practice.steps;

import com.google.gson.*;
import com.practice.actions.*;
import com.practice.pages.*;
import com.practice.pojo.*;
import net.thucydides.core.annotations.*;
import net.thucydides.core.steps.*;

import java.io.*;
import java.nio.file.*;

public class CreateAccountSteps extends ScenarioSteps {

    private CreateAccountAddressPO createAccountAddressPO;
    private CreateAccountPersonalInfoPO createAccountPersonalInfoPO;

    @Steps
    private CreateAccountAction createAccountAction;

    @Step ("Fill all Account Address information")
    public void completeAccountAddress(){
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(System.getProperty("user.dir") + "/src/test/resources/testData/createAccountAddress.json"));
            AccountAddress accountAddress = gson.fromJson(reader, AccountAddress.class);
            reader = Files.newBufferedReader(Paths.get(System.getProperty("user.dir")+"/src/test/resources/testData/createAccountPersonalInformation.json"));
            AccountPersonalInformation personalInformation = gson.fromJson(reader, AccountPersonalInformation.class);
            reader.close();
            System.out.println(accountAddress);
            createAccountAction.fillAccountPersonalInfo(personalInformation);
            createAccountAction.fillAccountAddress(accountAddress);
        } catch(
                Exception ex)

        {
            ex.printStackTrace();
        }
    }

    @Step ("Click on Register button")
    public void clickRegisterButton(){
        createAccountAction.clickRegisterButton();

    }
}
