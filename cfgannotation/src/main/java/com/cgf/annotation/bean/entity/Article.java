package com.cgf.annotation.bean.entity;

public class Article {
    private String title;

    public Article(){}

    public Article(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
