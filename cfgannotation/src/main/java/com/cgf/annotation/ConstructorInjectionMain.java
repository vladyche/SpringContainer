package com.cgf.annotation;

import com.cgf.annotation.bean.entity.Article;
import com.cgf.annotation.bean.service.ArticleService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("RetrieveBeanContext.xml");

        ArticleService articleService = context.getBean("articles", ArticleService.class);

        for (Article article : articleService.allArticles()){
            System.out.println(article.getTitle());
        }

        context.close();
    }
}
