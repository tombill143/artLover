package com.example.artlover.Entity;

public class user {

  public String userId;
  public String password;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "user{" +
            "userId='" + userId + '\'' +
            ", password='" + password + '\'' +
            '}';
  }

  public user(){

  }

  public user(String userId, String password) {
      this.userId = userId;
      this.password = password;
    }
}
