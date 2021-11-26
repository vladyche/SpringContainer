package com.cgf.annotation.bean.demobean;

import org.springframework.stereotype.Component;

@Component
public class DefaultNameBeanImpl implements DefaultNameBean{
    private String name = "Bean default name";

    public String name(){
        return name;
    }
}
