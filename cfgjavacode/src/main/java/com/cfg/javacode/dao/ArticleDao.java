package com.cfg.javacode.dao;

import com.cfg.javacode.bean.Article;

import java.util.List;

public interface ArticleDao {
    List<Article> findAllArticles();
}
