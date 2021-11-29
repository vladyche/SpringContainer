package com.cfg.javacode;

import com.cfg.javacode.bean.DemoBean;
import com.cfg.javacode.configuration.RetrieveBeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RetrieveBeanMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RetrieveBeanConfig.class);

        DemoBean demoBean = context.getBean("demoBean", DemoBean.class);
        System.out.println(demoBean.info());

        context.close();
    }
}
