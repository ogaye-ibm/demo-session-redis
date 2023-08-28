package com.bofa.demo.sessionexternalization.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DemoSessionService {

    private String sessionId;

    @Cacheable(value = "defaultCache")
    public String getSessionAttribute (){

        System.out.println("*** From Service, Session ID: " + this.sessionId);
        return this.sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
