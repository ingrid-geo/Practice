package com.practice.pojo;

public class AccountPersonalInformation {
    private Boolean titleMR;
    private Boolean titleMRS;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @Override
    public String toString() {
        return "accountPersonalInformation{" +
                "titleMR=" + titleMR +
                ", titleMRS=" + titleMRS +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public AccountPersonalInformation(Boolean titleMR, Boolean titleMRS, String firstName, String lastName, String email, String password) {
        this.titleMR = titleMR;
        this.titleMRS = titleMRS;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public AccountPersonalInformation() {
    }

    public Boolean getTitleMR() {
        return titleMR;
    }

    public Boolean getTitleMRS() {
        return titleMRS;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setTitleMR(Boolean titleMR) {
        this.titleMR = titleMR;
    }

    public void setTitleMRS(Boolean titleMRS) {
        this.titleMRS = titleMRS;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
