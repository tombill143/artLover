package com.example.artlover.Repository;

import com.example.artlover.Entity.artist1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface artist1Repository extends JpaRepository <artist1, Long> {
  public Optional<artist1> findById(Long Id);
}
