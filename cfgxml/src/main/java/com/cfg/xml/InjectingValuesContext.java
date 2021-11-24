package com.cfg.xml;

import com.cfg.xml.bean.DatabaseConnection;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectingValuesContext {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("InjectingValuesContext.xml");

        DatabaseConnection databaseConnection = context.getBean("connect", DatabaseConnection.class);
        databaseConnection.connect();

        context.close();
    }
}
