package com.bofa.demo.demosessionexternalization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo-redis")
public class DemoSessionController {

    @GetMapping(path = "hello")
    public String sayHello(){
        return "Hello Spring Session with Redis.";
    }
}
