package com.spring.security.jwt;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtAuthResource {
    @PostMapping(path = "authenticate")
    public Authentication authenticate(Authentication authentication){
        return authentication;
    }
}
