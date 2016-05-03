package com.example.guest.discussionforum;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Guest on 5/3/16.
 */
public class DiscussionForumApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
