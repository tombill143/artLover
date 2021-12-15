package com.example.artlover.Entity;

public class User {
  private int id;
  private String password;
  private String emailAddress;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public User(int id, String password, String emailAddress) {
    this.id = id;
    this.password = password;
    this.emailAddress = emailAddress;
  }
}


