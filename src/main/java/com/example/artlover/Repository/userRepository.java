package com.example.artlover.Repository;

import com.example.artlover.Entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface userRepository extends JpaRepository<user, Long> {
    public Optional<user> findByEmail(String email);

    public List<user> findById(user id );
    public Boolean existsByEmail(String email);


}
