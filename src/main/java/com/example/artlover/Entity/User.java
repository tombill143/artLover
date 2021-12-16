package com.example.artlover.Entity;




import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

  @Id
  private Long userId;

  private String password;
  private String emailAddress;

  public User() {

  }

  public Long getUserId() {
    return userId;
  }

  public void setId(Long id) {
    this.userId = id;
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

  public User(Long id, String password, String emailAddress) {
    this.userId = id;
    this.password = password;
    this.emailAddress = emailAddress;
  }
}


