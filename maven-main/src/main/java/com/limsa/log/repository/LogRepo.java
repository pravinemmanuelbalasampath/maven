package com.limsa.log.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.limsa.log.domain.Login;

@Repository
public interface LogRepo extends JpaRepository<Login, String> {
    Login findByUsernameAndPassword(String username, String password);
}
