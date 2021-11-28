package com.cgf.annotation;

import com.cgf.annotation.bean.posts.Post;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("RetrieveBeanContext.xml");

        Post post = context.getBean("blogPostId", Post.class);
        System.out.println(post.info());

        context.close();
    }
}
