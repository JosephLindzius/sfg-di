package com.blauwmaan.sfgdo.repositories;

/**
 * Created by jt on 2/20/21.
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
