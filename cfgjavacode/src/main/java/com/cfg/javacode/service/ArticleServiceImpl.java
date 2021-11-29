package com.cfg.javacode.service;

import com.cfg.javacode.bean.Article;
import com.cfg.javacode.dao.ArticleDao;

import java.util.List;

public class ArticleServiceImpl implements ArticleService{
    private final ArticleDao articleDao;

    public ArticleServiceImpl(ArticleDao articleDao){
        this.articleDao = articleDao;
    }

    @Override
    public List<Article> allArticles(){
        return articleDao.findAllArticles();
    }
}
