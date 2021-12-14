package com.example.artlover.Entity;
import java.util.*;

public class artist2 {
    String name;
    int age;
    String address;
    int phoneNumber;
    int emailAddress;
    String updatePhoneNumber;
    String creditCardInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(int emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUpdatePhoneNumber() {
        return updatePhoneNumber;
    }

    public void setUpdatePhoneNumber(String updatePhoneNumber) {
        this.updatePhoneNumber = updatePhoneNumber;
    }

    public String getCreditCardInfo() {
        return creditCardInfo;
    }

    public void setCreditCardInfo(String creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    public artist2() {

    }

    public artist2(String name, int age, String address, int phoneNumber, int emailAddress, String updatePhoneNumber, String creditCardInfo) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.updatePhoneNumber = updatePhoneNumber;
        this.creditCardInfo = creditCardInfo;
    }
}



