package com.example.artlover.Services;

import com.example.artlover.Repositories.Artist2ShoppingCartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Artist2ShoppingCartService {
  private final Artist2ShoppingCartRepo artist2ShoppingCartRepo;

  public Artist2ShoppingCartRepo getArtist2ShoppingCartRepo() {
    return artist2ShoppingCartRepo;
  }

  @Autowired
  public Artist2ShoppingCartService(Artist2ShoppingCartRepo artist2ShoppingCartRepo) {
    this.artist2ShoppingCartRepo = artist2ShoppingCartRepo;
  }
}

