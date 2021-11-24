package com.cfg.xml.bean;

public class Post {
    private PostInfo postInfo;

    public String getPostInfo() {
        return postInfo.getInfo();
    }

    //<property name="postInformation" ref="postInfo" />
    //setPostInformation => name="postInformation"
    public void setPostInformation(PostInfo postInfo) {
        this.postInfo = postInfo;
    }
}
