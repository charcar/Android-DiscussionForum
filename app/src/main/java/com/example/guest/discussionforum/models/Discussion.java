package com.example.guest.discussionforum.models;

import java.util.Date;

/**
 * Created by Guest on 5/3/16.
 */

public class Discussion {
    String subject;
    String body;
    Date date;

    public Discussion(){}


    public Discussion(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.date = new Date();
    }


    public Date getDate() {
        return date;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }
}
