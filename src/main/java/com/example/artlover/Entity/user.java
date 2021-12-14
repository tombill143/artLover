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
@Table(name = "user", schema = "artlover")
@JsonInclude(JsonInclude.Include.NON_NULL)

public class user {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(nullable = false)
  private String userId;

  @Column(nullable = false)
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

  @Override
  public String toString() {
    return "user{" +
            "userId='" + userId + '\'' +
            ", password='" + password + '\'' +
            '}';
  }

  public user(String userId, String password) {
      this.userId = userId;
      this.password = password;
    }
}
