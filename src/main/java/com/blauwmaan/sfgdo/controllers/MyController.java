package com.blauwmaan.sfgdo.controllers;

import com.blauwmaan.sfgdo.services.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String helloWorld(){
        return greetingService.stateGreeting();
    }
}
