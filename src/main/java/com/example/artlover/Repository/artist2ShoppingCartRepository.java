package com.example.artlover.Repository;

import com.example.artlover.Entity.artist2ShoppingCart;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface artist2ShoppingCartRepository {
  public Optional <artist2ShoppingCartRepository>findById(Long Id);

  public List<artist2ShoppingCart> findByNameContaining(String name);
  }


