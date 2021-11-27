package com.cgf.annotation.bean.service;

import com.cgf.annotation.bean.dao.ArticleDao;
import com.cgf.annotation.bean.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("articles")
public class ArticleServiceImpl implements ArticleService{
    private final ArticleDao articleDao;

    @Autowired
    public ArticleServiceImpl(ArticleDao articleDao){
        this.articleDao = articleDao;
    }

    public List<Article> allArticles(){
        return articleDao.findAll();
    }
}
