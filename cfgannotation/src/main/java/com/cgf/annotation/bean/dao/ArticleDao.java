package com.cgf.annotation.bean.dao;

import com.cgf.annotation.bean.entity.Article;

import java.util.List;

public interface ArticleDao {
    List<Article> findAll();
}
