package com.example.guest.discussionforum.models;

import java.util.Date;

/**
 * Created by Guest on 5/3/16.
 */


public class Discussion {
    String subject;
    String author;
    String body;
    Date date;

    public Discussion(){}


    public Discussion(String subject, String author, String body) {
        this.subject = subject;
        this.author = author;
        this.body = body;
        this.date = new Date();
    }


    public Date getDate() {
        return date;
    }

    public String getSubject() {
        return subject;
    }

    public String getAuthor() {return author; }

    public String getBody() {
        return body;
    }
}
