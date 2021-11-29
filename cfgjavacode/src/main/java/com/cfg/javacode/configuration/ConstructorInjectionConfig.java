package com.cfg.javacode.configuration;

import com.cfg.javacode.dao.ArticleDao;
import com.cfg.javacode.dao.ArticleDaoImpl;
import com.cfg.javacode.service.ArticleService;
import com.cfg.javacode.service.ArticleServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConstructorInjectionConfig {

    @Bean
    public ArticleDao articleDao(){
        return new ArticleDaoImpl();
    }

    @Bean
    public ArticleService articleService(){
        return new ArticleServiceImpl(articleDao());
    }
}
