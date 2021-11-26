package com.cgf.annotation;

import com.cgf.annotation.bean.demobean.DefaultNameBean;
import com.cgf.annotation.bean.demobean.DemoBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RetrieveBeanMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("RetrieveBeanContext.xml");

        System.out.println("-----------------------------------------------------------------------------------------");

        DemoBean demoBean = context.getBean("beanId", DemoBean.class);
        System.out.println(demoBean.name());

        System.out.println("-----------------------------------------------------------------------------------------");

        DefaultNameBean defaultNameBean = context.getBean("defaultNameBeanImpl", DefaultNameBean.class);
        System.out.println(defaultNameBean.name());

        System.out.println("-----------------------------------------------------------------------------------------");

        context.close();
    }
}
