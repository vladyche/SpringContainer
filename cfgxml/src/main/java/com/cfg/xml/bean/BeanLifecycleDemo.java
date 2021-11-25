package com.cfg.xml.bean;

public class BeanLifecycleDemo {
    private String lifeString = "lifecycle demo string";

    public String getLifeString() {
        return lifeString;
    }

    public void initMethod(){
        System.out.println("init method");
    }
    public void destroyMethod(){
        System.out.println("destroy method");
    }
}
