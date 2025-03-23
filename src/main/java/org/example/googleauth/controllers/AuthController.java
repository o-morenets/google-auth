package org.example.googleauth.controllers;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/")
    public String home(OAuth2AuthenticationToken token) {
        return "Привіт, " + token.getPrincipal().getAttributes().get("name");
    }
}
