package com.test.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("singleton")
public class MyTestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyTestController.class);

    @GetMapping("/")
    public String mainPage() {
        return "Спасибо индусам, всё работает. Привет из докера!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

}
