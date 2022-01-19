package com.blauwmaan.sfgdo.controllers;

import com.blauwmaan.sfgdo.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.stateGreeting();
    }
}
