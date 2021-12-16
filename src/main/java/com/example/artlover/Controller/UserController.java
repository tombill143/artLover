package com.example.artlover.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.artlover.Services.*;

@RestController
public class UserController {

  @Autowired
  UserService userService;

  public UserController(UserService userService){

  }

}
