package com.example.artlover.Repositories;

import com.example.artlover.Entity.Portrait;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PortraitRepo extends JpaRepository<Portrait,Long>{
}
