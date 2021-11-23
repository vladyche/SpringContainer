package com.cfg.xml.dao;

import java.util.ArrayList;
import java.util.List;

public class ArticleDaoImpl implements ArticleDao{

    @Override
    public List<String> findAll(){
        List<String> articles = new ArrayList<>();
        articles.add("article-1");
        articles.add("article-2");
        articles.add("article-3");

        return articles;
    }
}
