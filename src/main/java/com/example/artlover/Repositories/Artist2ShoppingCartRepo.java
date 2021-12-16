package com.example.artlover.Repositories;

import com.example.artlover.Entity.Artist2ShoppingCart;
import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Artist2ShoppingCartRepo extends JpaRepository<Artist2ShoppingCart, Long> {
}
