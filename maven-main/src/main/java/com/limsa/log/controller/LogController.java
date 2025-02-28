package com.limsa.log.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.limsa.log.domain.Login;
import com.limsa.log.service.LogService;

@Controller
public class LogController {

    @Autowired
    private LogService service;

    @GetMapping("/")
    public String api() {
        return "log";
    }

    @PostMapping("/log")
    public String login(@ModelAttribute("user") Login user) {
        Login check = service.log(user.getUsername(), user.getPassword());
        System.out.print(check);
        if (Objects.nonNull(check)) {
            return "redirect:/disp";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping("/disp")
    public String display() {
        return "disp";
    }
}
