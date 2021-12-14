package com.example.artlover.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "artist1", schema = "artlover")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class artist1 {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(nullable = false)
  public String name;

  @Column(nullable = false)
  public int age;

  @Column(nullable = false)
  public int phoneNumber;

  @Column(nullable = false)
  public String address;

  @Column(nullable = false)
  public String emailAddress;

  @Column(nullable = false)
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

  public artist1(String name, int age, int phoneNumber, String address, String emailAddress, String updatePhoneNumber) {
    this.name = name;
    this.age = age;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.emailAddress = emailAddress;
    this.updatePhoneNumber = updatePhoneNumber;
  }


}
