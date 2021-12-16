package com.example.artlover.Repositories;

import com.example.artlover.Entity.Artist1ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Artist1ShoppingCartRepo extends JpaRepository<Artist1ShoppingCart,Long> {
}
