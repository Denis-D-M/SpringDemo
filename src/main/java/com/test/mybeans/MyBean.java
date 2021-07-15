package com.test.mybeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class MyBean {

    @PostConstruct
    public void postConstruct(){
        System.out.println("PostConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("PreDestroy");
    }
}
