package com.example.artlover.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Artist2 {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "artist_two_id", nullable = false)
  private Long artistTwoId;

  private int id;
    private String address;
    private int age;
    private String emailAddress;
    private String firstName;
    private String secondName;
    private int updatePhoneNumber;

  public Long getArtistTwoId() {
    return artistTwoId;
  }

  public void setArtistTwoId(Long artistTwoId) {
    this.artistTwoId = artistTwoId;
  }

  public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getAddress() {
      return address;
    }

    public void setAddress(String address) {
      this.address = address;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public String getEmailAddress() {
      return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
      this.emailAddress = emailAddress;
    }

    public String getFirstName() {
      return firstName;
    }

    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

    public String getSecondName() {
      return secondName;
    }

    public void setSecondName(String secondName) {
      this.secondName = secondName;
    }

    public int getUpdatePhoneNumber() {
      return updatePhoneNumber;
    }

    public void setUpdatePhoneNumber(int updatePhoneNumber) {
      this.updatePhoneNumber = updatePhoneNumber;
    }

    public Artist2(){

    }

    public Artist2(int id, String address, int age, String emailAddress, String firstName, String secondName, int updatePhoneNumber) {
      this.id = id;
      this.address = address;
      this.age = age;
      this.emailAddress = emailAddress;
      this.firstName = firstName;
      this.secondName = secondName;
      this.updatePhoneNumber = updatePhoneNumber;
    }
  }


