package com.blauwmaan.sfgdo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String stateGreeting() {
        return "Hello World! - Constructor";
    }
}
