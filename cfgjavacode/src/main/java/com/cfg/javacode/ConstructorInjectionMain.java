package com.cfg.javacode;

import com.cfg.javacode.bean.Article;
import com.cfg.javacode.configuration.ConstructorInjectionConfig;
import com.cfg.javacode.service.ArticleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstructorInjectionMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConstructorInjectionConfig.class);

        ArticleService articleService = context.getBean("articleService", ArticleService.class);

        for (Article article : articleService.allArticles()){
            System.out.println(article.getTitle());
        }

        context.close();
    }
}
