package com.cgf.annotation.bean.posts;

import org.springframework.stereotype.Component;

@Component
public class BlogPostInfo implements PostInfo{

    @Override
    public String infoText(){
        return "text about blog post";
    }
}
