package com.authenticate.keycloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class KeycloakController {

    @GetMapping("/helloWorld")
    @RolesAllowed("admin")
    public String getHelloWorld() {
        return "Hello World!";
    }

}
