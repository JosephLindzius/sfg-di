package com.blauwmaan.sfgdo.services;

public class PrimaryGreetingService implements GreetingService {

    @Override
    public String stateGreeting() {
        return "Hello World! - From the PRIMARY bean ";
    }
}
