package com.cgf.annotation.bean.demobean;

import org.springframework.stereotype.Component;

@Component("beanId")
public class DemoBeanImpl implements DemoBean{
    private String name = "Bean name";

    public String name(){
        return name;
    }
}
