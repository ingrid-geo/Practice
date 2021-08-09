package com.practice.pojo;

import lombok.Data;

@Data
public class AccountAddress {
    private String firstName;
    private String lastName;
    private String company;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipPostalCode;
    private String country;
    private String additionalInformation;
    private String phoneHome;
    private String mobilePhone;
    private String assignAnAddressAlias;

    @Override
    public String toString() {
        return "accountAddress{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipPostalCode='" + zipPostalCode + '\'' +
                ", country='" + country + '\'' +
                ", additionalInformation='" + additionalInformation + '\'' +
                ", phoneHome='" + phoneHome + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", assignAnAddressAlias='" + assignAnAddressAlias + '\'' +
                '}';
    }

}
