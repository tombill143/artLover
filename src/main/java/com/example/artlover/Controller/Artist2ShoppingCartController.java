package com.example.artlover.Controller;

import com.example.artlover.Entity.Artist2ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.artlover.Services.*;

@RestController
public class Artist2ShoppingCartController {
  @Autowired
  Artist2ShoppingCartService artist2ShoppingCartService;

  public Artist2ShoppingCartController(Artist2ShoppingCartService artist2ShoppingCartService) {

  }
}
