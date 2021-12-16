package com.example.artlover.Repositories;

import com.example.artlover.Entity.Artist1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Artist1Repo extends JpaRepository<Artist1,Long> {
}

