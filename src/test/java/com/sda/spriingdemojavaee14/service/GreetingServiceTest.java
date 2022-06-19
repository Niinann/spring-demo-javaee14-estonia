package com.sda.spriingdemojavaee14.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest //prepares all required beans for testing purposes
public class GreetingServiceTest {

    @Autowired  //request to Spring for providing the bean
    private GreetingService greetingService;

    @Test
    public void injectionTest() {
        Assertions.assertNotNull(greetingService, "Greeting service should not be null!");

    }
}
