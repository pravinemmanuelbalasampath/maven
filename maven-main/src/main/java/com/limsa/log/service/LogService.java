package com.limsa.log.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.limsa.log.domain.Login;
import com.limsa.log.repository.LogRepo;

@Service
public class LogService {

    @Autowired
    private LogRepo rep;

    public Login log(String username, String password) {
        Login user = rep.findByUsernameAndPassword(username, password);
        return user;
    }
}
