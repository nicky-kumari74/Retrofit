package com.example.local;

public class Model {
    int uid,id;
    String title,body;

    public Model(int uid, int id, String title, String body) {
        this.uid = uid;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
