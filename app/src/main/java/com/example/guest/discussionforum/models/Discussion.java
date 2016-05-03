package com.example.guest.discussionforum.models;

/**
 * Created by Guest on 5/3/16.
 */

public class Discussion {
    String subject;
    String body;

    public Discussion(){}

    public Discussion(String subject, String body) {
        this.subject = subject;
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }
}
