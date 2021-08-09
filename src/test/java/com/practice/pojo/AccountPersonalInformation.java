package com.practice.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class AccountPersonalInformation {
    private Boolean titleMR;
    private Boolean titleMRS;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dob;

    @Override
    public String toString() {
        return "accountPersonalInformation{" +
                "titleMR=" + titleMR +
                ", titleMRS=" + titleMRS +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }


}
