package com.practice.pojo;

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

    public AccountAddress(String firstName, String lastName, String company, String address1, String address2, String city, String state, String zipPostalCode, String country, String additionalInformation, String phoneHome, String mobilePhone, String assignAnAddressAlias) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipPostalCode = zipPostalCode;
        this.country = country;
        this.additionalInformation = additionalInformation;
        this.phoneHome = phoneHome;
        this.mobilePhone = mobilePhone;
        this.assignAnAddressAlias = assignAnAddressAlias;
    }

    public AccountAddress(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipPostalCode() {
        return zipPostalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public String getPhoneHome() {
        return phoneHome;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getAssignAnAddressAlias() {
        return assignAnAddressAlias;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipPostalCode(String zipPostalCode) {
        this.zipPostalCode = zipPostalCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setAssignAnAddressAlias(String assignAnAddressAlias) {
        this.assignAnAddressAlias = assignAnAddressAlias;
    }
}
