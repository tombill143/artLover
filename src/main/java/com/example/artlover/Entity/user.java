package com.example.artlover.Entity;

public class user {

  private String userId;
  private String password;

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

  public static boolean verifyPassword(){
    return true;
  }


  @Override
  public String toString() {
    return "user{" +
            "userId='" + userId + '\'' +
            ", password='" + password + '\'' +
            '}';
  }


}
