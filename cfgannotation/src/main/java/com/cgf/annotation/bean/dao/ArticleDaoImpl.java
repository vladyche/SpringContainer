package com.cgf.annotation.bean.dao;

import com.cgf.annotation.bean.entity.Article;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ArticleDaoImpl implements ArticleDao{

    @Override
    public List<Article> findAll(){
        String[] titles = {"title-1", "title-2", "title-3"};
        List<Article> articles = new ArrayList<>();

        for(String s : titles){
            articles.add(new Article(s));
        }

        return articles;
    }
}
