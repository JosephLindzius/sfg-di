package com.blauwmaan.sfgdo.controllers;

import com.blauwmaan.sfgdo.services.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.stateGreeting();
    }
}
