package com.blauwmaan.sfgdo.services;

public class ConstructorGreetingService implements GreetingService {
    @Override
    public String stateGreeting() {
        return "Hello World! - Constructor";
    }
}
