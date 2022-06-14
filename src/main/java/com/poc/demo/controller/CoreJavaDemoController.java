package com.poc.demo.controller;

import com.poc.demo.corejava.InnerclassDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/corejava")
public class CoreJavaDemoController {
    @Autowired
    InnerclassDemo innerclassDemo;

    @GetMapping("/innerclass")
    public void experimentInnerClass(){
        //TODO: need to add testcases
        String s1 = new InnerclassDemo().new InnerClassDemoB().b();
        System.out.println(s1);
    }
}
