package com.example.artlover;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ArtLoverApplication implements CommandLineRunner {

  @Autowired
  public JdbcTemplate jdbcTemplate;

  public static void main(String[] args) {
    SpringApplication.run(ArtLoverApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    String sql ="INSERT INTO user (userid, password) VALUES (?, ?)";


    int result = jdbcTemplate.update("12345", "mypassword");

    if (result > 0){
      System.out.println("A new row has been inserted");
    }

  }
}
