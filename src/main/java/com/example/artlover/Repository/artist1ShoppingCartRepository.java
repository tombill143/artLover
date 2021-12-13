package com.example.artlover.Repository;

import com.example.artlover.Entity.artist1ShoppingCart;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface artist1ShoppingCartRepository {
    public Optional<artist1Repository> findById(Long Id);

    public List<artist1ShoppingCart> findByNameContaining(String name);
  }


