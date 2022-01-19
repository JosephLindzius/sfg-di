package com.blauwmaan.sfgdo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18Service")
public class I18nSpanishGreetingService implements GreetingService {

    @Override
    public String stateGreeting() {
        return "Hola Mundo!";
    }
}
