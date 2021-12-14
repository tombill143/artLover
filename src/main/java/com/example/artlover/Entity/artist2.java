package com.example.artlover.Entity;
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
@Table(name = "artist2", schema = "artlover")
public class artist2 {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    int age;

    @Column(nullable = false)
    String address;

    @Column(nullable = false)
    int phoneNumber;

    @Column(nullable = false)
    int emailAddress;

    @Column(nullable = false)
    String updatePhoneNumber;

    @Column(nullable = false)
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



