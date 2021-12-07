package com.example.artlover.Entity;

public class user {
  public String name;
  public int age;
  public int phoneNumber;
  public String address;
  public String emailAddress;
  public String updatePhoneNumber;


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

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getEmailAdress() {
    return emailAddress;
  }

  public void setEmailAdress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getUpdatePhoneNumber() {
    return updatePhoneNumber;
  }

  public void setUpdatePhoneNumber(String updatePhoneNumber) {
    this.updatePhoneNumber = updatePhoneNumber;
  }

  @Override
  public String toString() {
    return "user{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", phoneNumber=" + phoneNumber +
            ", address='" + address + '\'' +
            ", emailAddress='" + emailAddress + '\'' +
            ", updatePhoneNumber='" + updatePhoneNumber + '\'' +
            '}';
  }

}
