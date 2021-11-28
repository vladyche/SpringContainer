package com.cgf.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodInjection {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanContext.xml");

        context.close();
    }
}
