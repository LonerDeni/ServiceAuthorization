package com.example.serviceauthorization.controller;

import com.example.serviceauthorization.UserArgumentResolver;
import com.example.serviceauthorization.UserImpl;
import com.example.serviceauthorization.method.Authorities;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.serviceauthorization.service.AuthorizationService;

import javax.validation.Valid;
import java.util.List;


@RestController
@Validated
public class AuthorizationController {
    AuthorizationService service;


    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid UserImpl user) {
        return service.getAuthorities(user);
    }
}