package com.example.artlover.Controller;

import com.example.artlover.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.artlover.Services.*;

@RestController
public class UserController {

  @Autowired
  UserService userService;

  public UserController(UserService userService){

  }

  @GetMapping("/addnewusers")
  public String addUser(){
    User user1 = new User(1L, "warmachinerox", "myfairlady@hotmail.com" );
    User user2 = new User(2L, "donkeypunchandjudidench", "armpitsuncreme@aol.com" );
    User user3 = new User(3L, "bobthepigdog", "rentaghost@yahoo.com" );
    User user4 = new User(4L, "elvislives", "serenitynow@gmail.com" );
    User user5 = new User(5L, "myfamilyandotheranimals", "theweeyin@gmail.com" );
    User user6 = new User(6L, "baldricksdreamturnip", "aldilizards@gmail.com" );
    User user7 = new User(7L, "12missafew", "rodhullstvrepairservice@hotmail.com" );
    User user8 = new User(8L, "dontcallmeshirley", "dremmond@aol.com" );
    User user9 = new User(9L, "thesegouptoeleven", "hubbinsmedia@hotmail.com" );
    User user10 = new User(10L, "canihavemynutsbackplease", "georgiedawes@zoho.com" );
    userService.getUserRepo().save(user1);
    userService.getUserRepo().save(user2);
    userService.getUserRepo().save(user3);
    userService.getUserRepo().save(user4);
    userService.getUserRepo().save(user5);
    userService.getUserRepo().save(user6);
    userService.getUserRepo().save(user7);
    userService.getUserRepo().save(user8);
    userService.getUserRepo().save(user9);
    userService.getUserRepo().save(user10);

    return "The users mentioned in the controller should be now uploaded to the database. Check the MYSQL database artLover to make sure changes have been made";
  }

}
