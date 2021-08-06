package com.practice.actions;

import com.practice.pages.*;
import com.practice.pojo.*;
import org.openqa.selenium.support.ui.*;

public class CreateAccountAction {
    private CreateAccountAddressPO createAccountAddressPO;
    private CreateAccountPersonalInfoPO createAccountPersonalInfoPO;

    public void fillAccountAddress(AccountAddress address){
        createAccountAddressPO.firstName.sendKeys(address.getFirstName());
        createAccountAddressPO.lastName.sendKeys(address.getLastName());
        createAccountAddressPO.company.sendKeys(address.getCompany());
        createAccountAddressPO.address1.sendKeys(address.getAddress1());
        createAccountAddressPO.address2.sendKeys(address.getAddress2());
        createAccountAddressPO.city.sendKeys(address.getCity());
        Select state = new Select(createAccountAddressPO.state);
        state.selectByValue("Arizona");
        createAccountAddressPO.zipPostalCode.sendKeys(address.getZipPostalCode());
        Select country = new Select(createAccountAddressPO.country);
        country.selectByValue("United States");
        createAccountAddressPO.additionalInformation.sendKeys(address.getAdditionalInformation());
        createAccountAddressPO.phoneHome.sendKeys(address.getPhoneHome());
        createAccountAddressPO.mobilePhone.sendKeys(address.getMobilePhone());
        createAccountAddressPO.assignAnAddressAlias.sendKeys(address.getAssignAnAddressAlias());

    }

    public void fillAccountPersonalInfo(AccountPersonalInformation personalInformation){
        if(personalInformation.getTitleMR() && personalInformation.getTitleMRS()){
            System.out.println("Only one can be true");
        } else if (personalInformation.getTitleMR()){
            createAccountPersonalInfoPO.titleMR.click();
        } else {
            createAccountPersonalInfoPO.titleMRS.click();
        }
        createAccountPersonalInfoPO.firstName.sendKeys(personalInformation.getFirstName());
        createAccountPersonalInfoPO.lastName.sendKeys(personalInformation.getLastName());
        createAccountPersonalInfoPO.email.sendKeys(personalInformation.getEmail());
        createAccountPersonalInfoPO.password.sendKeys(personalInformation.getPassword());
        Select dateOfBirthDays = new Select(createAccountPersonalInfoPO.dateOfBirthDays);
        dateOfBirthDays.selectByIndex(2);
        Select dateOfBirthMonths = new Select(createAccountPersonalInfoPO.dateOfBirthMonths);
        dateOfBirthMonths.selectByIndex(4);
        Select dateOfBirthYears = new Select(createAccountPersonalInfoPO.dateOfBirthYears);
        dateOfBirthYears.selectByIndex(10);

    }
    public void clickRegisterButton(){
        createAccountAddressPO.registerBtn.click();
    }

}
