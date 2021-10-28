package com.cfg.xml;

import com.cfg.xml.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RetrieveBeanMain {
    public static void main(String[] args){
        //context xml configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("RetrieveBeanContext.xml");

        //retrieve bean from container
        User user = context.getBean("user", User.class);

        //use bean
        System.out.println(user.getName());
    }
}
