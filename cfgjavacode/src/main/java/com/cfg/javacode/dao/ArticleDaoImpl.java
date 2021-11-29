package com.cfg.javacode.dao;

import com.cfg.javacode.bean.Article;

import java.util.ArrayList;
import java.util.List;

public class ArticleDaoImpl implements ArticleDao{

    @Override
    public List<Article> findAllArticles(){
        String[] titles = {"title-1", "title-2", "title-3"};

        List<Article> articles = new ArrayList<>();

        for (String title : titles) {
            Article article = new Article();
            article.setTitle(title);
            articles.add(article);
        }

        return articles;
    }
}
