package com.blauwmaan.sfgdo.services;

import com.blauwmaan.sfgdo.repositories.EnglishGreetingRepository;

public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String stateGreeting() {
        return "Hello World - EN";
    }
}
