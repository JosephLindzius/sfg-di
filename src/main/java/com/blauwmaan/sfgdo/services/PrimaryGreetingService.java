package com.blauwmaan.sfgdo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String stateGreeting() {
        return "Hello World! - From the PRIMARY bean ";
    }
}
