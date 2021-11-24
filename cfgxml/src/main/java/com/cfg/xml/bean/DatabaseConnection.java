package com.cfg.xml.bean;

public class DatabaseConnection {
    private String host;
    private String username;
    private String password;

    public void setHost(String host) {
        this.host = host;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void connect(){
        System.out.println(host);
        System.out.println(username);
        System.out.println(password);
    }
}
