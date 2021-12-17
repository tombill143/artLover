package com.example.artlover.Controller;

import com.example.artlover.Entity.Artist1ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.artlover.Services.*;

@RestController
public class Artist1ShoppingCartController {
  @Autowired
  Artist1ShoppingCartService artist1ShoppingCartService;

  public Artist1ShoppingCartController(Artist1ShoppingCartService artist1ShoppingCartService) {

  }

  @GetMapping("/addshoppingcartinfo")
  public String addArtist1ShoppingCartData(){
    Artist1ShoppingCart cart1 = new Artist1ShoppingCart(1,13468 ,3);
    Artist1ShoppingCart cart2 = new Artist1ShoppingCart(2, 21241, 5 );
    Artist1ShoppingCart cart3 = new Artist1ShoppingCart(3, 31251, 4);
    Artist1ShoppingCart cart4 = new Artist1ShoppingCart(4, 43225, 1);
    Artist1ShoppingCart cart5 = new Artist1ShoppingCart(5, 55532, 1);
    Artist1ShoppingCart cart6 = new Artist1ShoppingCart(6, 23452, 2);
    Artist1ShoppingCart cart7 = new Artist1ShoppingCart(7, 77131, 4);
    Artist1ShoppingCart cart8 = new Artist1ShoppingCart(8, 10134, 2);
    Artist1ShoppingCart cart9 = new Artist1ShoppingCart(9, 61233, 10);
    Artist1ShoppingCart cart10 = new Artist1ShoppingCart(10, 85460, 4);
    artist1ShoppingCartService.getArtist1ShoppingCartRepo().save(cart1);
    artist1ShoppingCartService.getArtist1ShoppingCartRepo().save(cart2);
    artist1ShoppingCartService.getArtist1ShoppingCartRepo().save(cart3);
    artist1ShoppingCartService.getArtist1ShoppingCartRepo().save(cart4);
    artist1ShoppingCartService.getArtist1ShoppingCartRepo().save(cart5);
    artist1ShoppingCartService.getArtist1ShoppingCartRepo().save(cart6);
    artist1ShoppingCartService.getArtist1ShoppingCartRepo().save(cart7);
    artist1ShoppingCartService.getArtist1ShoppingCartRepo().save(cart8);
    artist1ShoppingCartService.getArtist1ShoppingCartRepo().save(cart9);
    artist1ShoppingCartService.getArtist1ShoppingCartRepo().save(cart10);

    return "The Data on the shopping cart info mentioned in this controller should be now uploaded to the database. Check the MYSQL database artLover to make sure changes have been made";
  }
}
