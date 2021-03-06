package com.cfg.xml;

import com.cfg.xml.bean.Animal;
import com.cfg.xml.bean.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RetrieveBeanMain {
    public static void main(String[] args){
        //context xml configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("RetrieveBeanContext.xml");

        //retrieve bean from container
        User user = context.getBean("user", User.class);

        //use bean
        System.out.println("User: " + user.getName());

        //retrieve bean from container use interface
        Animal dog = context.getBean("dog", Animal.class);
        Animal cat = context.getBean("cat", Animal.class);

        //use bean
        System.out.println("Dog: " + dog.breed());
        System.out.println("Cat: " + cat.breed());

        //close context
        context.close();
    }
}
