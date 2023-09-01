package com.example.serviceauthorization.controller;

import com.example.serviceauthorization.method.Authorities;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.serviceauthorization.service.AuthorizationService;

import java.util.List;


@RestController
public class AuthorizationController {
    AuthorizationService service;


    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
}