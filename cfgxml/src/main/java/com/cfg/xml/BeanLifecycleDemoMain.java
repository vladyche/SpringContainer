package com.cfg.xml;

import com.cfg.xml.bean.BeanLifecycleDemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanLifecycleContext.xml");

        BeanLifecycleDemo lifecycleDemo = context.getBean("lifecycleBean", BeanLifecycleDemo.class);
        System.out.println(lifecycleDemo.getLifeString());

        context.close();
    }
}
