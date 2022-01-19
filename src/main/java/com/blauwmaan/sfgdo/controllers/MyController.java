package com.blauwmaan.sfgdo.controllers;

import org.springframework.stereotype.Component;

@Component
public class MyController {

    public String helloWorld(){
        System.out.println("Hello World!");

        return "Hello programmer!";
    }
}
