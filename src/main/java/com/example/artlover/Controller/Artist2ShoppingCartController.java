package com.example.artlover.Controller;

import com.example.artlover.Entity.Artist2ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.artlover.Services.*;

@RestController
public class Artist2ShoppingCartController {
  @Autowired
  Artist2ShoppingCartService artist2ShoppingCartService;

  public Artist2ShoppingCartController(Artist2ShoppingCartService artist2ShoppingCartService) {

  }

  @GetMapping("/addmoreshoppingcartinfo")
  public String addArtist2ShoppingCartData() {
    Artist2ShoppingCart cart1 = new Artist2ShoppingCart(1, 13468, 3);
    Artist2ShoppingCart cart2 = new Artist2ShoppingCart(2, 21241, 5);
    Artist2ShoppingCart cart3 = new Artist2ShoppingCart(3, 31251, 4);
    Artist2ShoppingCart cart4 = new Artist2ShoppingCart(4, 43225, 1);
    Artist2ShoppingCart cart5 = new Artist2ShoppingCart(5, 55532, 1);
    Artist2ShoppingCart cart6 = new Artist2ShoppingCart(6, 23452, 2);
    Artist2ShoppingCart cart7 = new Artist2ShoppingCart(7, 77131, 4);
    Artist2ShoppingCart cart8 = new Artist2ShoppingCart(8, 10134, 2);
    Artist2ShoppingCart cart9 = new Artist2ShoppingCart(9, 61233, 10);
    Artist2ShoppingCart cart10 = new Artist2ShoppingCart(10, 85460, 4);
    artist2ShoppingCartService.getArtist2ShoppingCartRepo().save(cart1);
    artist2ShoppingCartService.getArtist2ShoppingCartRepo().save(cart2);
    artist2ShoppingCartService.getArtist2ShoppingCartRepo().save(cart3);
    artist2ShoppingCartService.getArtist2ShoppingCartRepo().save(cart4);
    artist2ShoppingCartService.getArtist2ShoppingCartRepo().save(cart5);
    artist2ShoppingCartService.getArtist2ShoppingCartRepo().save(cart6);
    artist2ShoppingCartService.getArtist2ShoppingCartRepo().save(cart7);
    artist2ShoppingCartService.getArtist2ShoppingCartRepo().save(cart8);
    artist2ShoppingCartService.getArtist2ShoppingCartRepo().save(cart9);
    artist2ShoppingCartService.getArtist2ShoppingCartRepo().save(cart10);

    return "The Data on the shopping cart info mentioned in this controller should be now uploaded to the database. Check the MYSQL database artLover to make sure changes have been made. Have a nice day";
  }
}
