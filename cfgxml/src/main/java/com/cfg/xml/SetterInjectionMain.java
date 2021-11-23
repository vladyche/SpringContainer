package com.cfg.xml;

import com.cfg.xml.bean.Post;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SetterInjectionContext.xml");

        Post post = context.getBean("post", Post.class);
        System.out.println(post.getPostInfo());

        context.close();
    }
}
