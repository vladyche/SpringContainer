package com.cfg.xml.bean;

public class Post {
    private PostInfo postInfo;

    public String getPostInfo() {
        return postInfo.getInfo();
    }

    public void setPostInfo(PostInfo postInfo) {
        this.postInfo = postInfo;
    }
}
