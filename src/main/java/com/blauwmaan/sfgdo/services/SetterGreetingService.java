package com.blauwmaan.sfgdo.services;

import org.springframework.stereotype.Service;

public class SetterGreetingService implements GreetingService {
    @Override
    public String stateGreeting() {
        return "Hello World! - Setter";
    }
}
