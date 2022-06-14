package com.poc.demo.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.reflect.Field;

@ExtendWith(MockitoExtension.class)
public class DesignPatternControllerTest {

    @Test
    void chkSingletonDesignPattern() throws NoSuchFieldException, IllegalAccessException {

        DesignPatternController designPatternController = new  DesignPatternController();
        designPatternController.singletonDPPoc();
        //Use Reflect APi to get the instance  of the class and change the accessible status
        Field s1Field= designPatternController.getClass().getDeclaredField("s1");
        s1Field.setAccessible(true);
        var s1 = s1Field.get(designPatternController);

        Field s2Field= designPatternController.getClass().getDeclaredField("s1");
        s2Field.setAccessible(true);
        var s2 = s2Field.get(designPatternController);

        Assertions.assertEquals(s1.hashCode(),s2.hashCode(),"singleton design pattern is not working");

    }
}
