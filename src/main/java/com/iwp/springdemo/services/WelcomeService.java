package com.iwp.springdemo.services;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
    public String getMessage() {
        return "Hello IWP";
    }
}
