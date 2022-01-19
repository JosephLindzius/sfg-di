package com.blauwmaan.sfgdo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18Service")
public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String stateGreeting() {
        return "Hello World!";
    }
}
