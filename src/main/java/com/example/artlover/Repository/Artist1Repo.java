package com.example.artlover.Repository;


import com.example.artlover.Entity.Artist1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
  public interface Artist1Repo extends JpaRepository<Artist1, Long> {
  public Optional<Artist1> findById(Long id);

  public List<Artist1> findByNameContaining(String name);
  }

