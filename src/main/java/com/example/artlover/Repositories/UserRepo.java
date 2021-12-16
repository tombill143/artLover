package com.example.artlover.Repositories;

import com.example.artlover.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public
interface UserRepo extends JpaRepository<User, Integer>{
}

