package com.blauwmaan.sfgdo.controllers;

import com.blauwmaan.sfgdo.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.stateGreeting();
    }
}
