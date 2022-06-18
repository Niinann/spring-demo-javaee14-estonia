package com.sda.spriingdemojavaee14.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


//@RestController creates new Spring bean based on the class
// bean= managed objec (object is created by Spring for us)
// TODO: install postman

@RestController
public class MyFirstRestController {

    private static final Logger log = LoggerFactory.getLogger(MyFirstRestController.class);
//@GetMapping means
    // - code of the method
    //
    @GetMapping("say-hello")

    public String hello(){
        // TODO: explain logger level
        log.info("hello method was called");

        return "Welcome to spring class!";
    }
}
