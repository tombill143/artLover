package com.example.artlover.Controller;

import com.example.artlover.Entity.Artist1ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.artlover.Services.*;

@RestController
public class Artist1ShoppingCartController {
  @Autowired
  Artist2ShoppingCartService artist2ShoppingCartService;

  public Artist1ShoppingCartController(Artist1ShoppingCartService artist1ShoppingCartService) {

  }
}
