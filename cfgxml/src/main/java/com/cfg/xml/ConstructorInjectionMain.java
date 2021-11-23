package com.cfg.xml;

import com.cfg.xml.service.ArticleService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ConstructorInjectionContext.xml");

        ArticleService articleService = context.getBean("articleService", ArticleService.class);

        for(String s : articleService.allArticles()){
            System.out.println(s);
        }

        context.close();
    }
}
