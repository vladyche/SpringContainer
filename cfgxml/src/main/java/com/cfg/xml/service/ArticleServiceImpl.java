package com.cfg.xml.service;

import com.cfg.xml.dao.ArticleDao;

import java.util.List;

public class ArticleServiceImpl implements ArticleService{
    private final ArticleDao articleDao;

    public ArticleServiceImpl(ArticleDao articleDao){
        this.articleDao = articleDao;
    }

    public List<String> allArticles(){
        return articleDao.findAll();
    }
}
