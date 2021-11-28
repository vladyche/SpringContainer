package com.cgf.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FieldInjectionMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanContext");

        context.close();
    }
}
