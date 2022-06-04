package com.poc.demo.controller;

import com.poc.demo.component.SingletonDesignPattern;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("design-pattern")
public class DesignPatternController {

    private SingletonDesignPattern s1;
    private SingletonDesignPattern s2;

    @GetMapping("/singleton")
     void singletonDPPoc(){
        s1 = SingletonDesignPattern.getInstance();
        s2 = SingletonDesignPattern.getInstance();

        System.out.println("s1 hashcode:" + s1.hashCode());
        System.out.println("s2 hashcode:" + s2.hashCode());
    }

}
