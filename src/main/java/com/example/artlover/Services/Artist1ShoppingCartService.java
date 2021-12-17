package com.example.artlover.Services;

import com.example.artlover.Repositories.Artist1ShoppingCartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Artist1ShoppingCartService {
  private final Artist1ShoppingCartRepo artist1ShoppingCartRepo;

  public Artist1ShoppingCartRepo getArtist1ShoppingCartRepo() {
    return artist1ShoppingCartRepo;
  }

  @Autowired
  public Artist1ShoppingCartService(Artist1ShoppingCartRepo artist1ShoppingCartRepo) {
    this.artist1ShoppingCartRepo = artist1ShoppingCartRepo;
  }
}

