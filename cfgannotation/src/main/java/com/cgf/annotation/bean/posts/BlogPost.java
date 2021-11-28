package com.cgf.annotation.bean.posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("blogPostId")
public class BlogPost implements Post{
    private PostInfo postInfo;

    public BlogPost() {}

    @Autowired
    public void setPostInfo(PostInfo postInfo) {
        this.postInfo = postInfo;
    }

    @Override
    public String info(){
        return postInfo.infoText();
    }
}
