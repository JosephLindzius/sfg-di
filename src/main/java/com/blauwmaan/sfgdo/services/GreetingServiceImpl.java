package com.blauwmaan.sfgdo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String stateGreeting() {
        return "Hello World!";
    }
}
