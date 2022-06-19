package com.sda.spriingdemojavaee14.controller;

import com.sda.spriingdemojavaee14.service.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//@RestController creates new Spring bean based on the class
// bean= managed objec (object is created by Spring for us)
// TODO: install postman

@RestController
public class MyFirstRestController {

    private static final Logger log = LoggerFactory.getLogger(MyFirstRestController.class);

    private final GreetingService greetingService;
//@Autowired - optional. Not good approach. Only in tests
    //dependency injection = providing required collaborators/dependencies by Spring
    public MyFirstRestController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    //@GetMapping means
    // - code of the method
    //
    @GetMapping("say-hello")

    public String hello(){
        // TODO: explain logger level
        log.info("hello method was called");

        return "Welcome to spring class!";
    }

    //example query link from google:
    //https://www.google.com/search?q=Estonia
    //server: https://www.google.com/
    // /search: application (endpoint) on the server
    // ? : query separator
    // q=Estonia, q:parameter name, Estonia i value for q parameter
    //& is used if more parameters is coming
    // /greeting?name=Niina&surname=Kr

    @GetMapping("/greeting")
    public String greetUser(String name, String surname){
        log.info("greetUser called with params: name [{}], surname: [{}]", name, surname); // String.format("name:%s", name);

        return greetingService.makeSomeGreetingToUser( name + " " + surname);

    }
}
