package com.example.artlover.Repositories;

import com.example.artlover.Entity.Artist2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Artist2Repo extends JpaRepository<Artist2,Long> {
}


