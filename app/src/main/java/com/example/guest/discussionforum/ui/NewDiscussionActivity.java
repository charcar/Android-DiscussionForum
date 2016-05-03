package com.example.guest.discussionforum.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.guest.discussionforum.Constants;
import com.example.guest.discussionforum.R;
import com.example.guest.discussionforum.models.Discussion;
import com.firebase.client.Firebase;

import butterknife.Bind;
import butterknife.ButterKnife;

public class NewDiscussionActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.subjectEditText) EditText mSubjectEditText;
    @Bind(R.id.bodyEditText) EditText mBodyEditText;
    @Bind(R.id.submitNewTopicButton) Button mSubmitNewTopicButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_discussion);
        ButterKnife.bind(this);

        mSubmitNewTopicButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String subject = mSubjectEditText.getText().toString();
        String body = mBodyEditText.getText().toString();
        Discussion newThread = new Discussion(subject, body);
        saveThreadToFirebase(newThread);
        Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
    }

    public void saveThreadToFirebase(Discussion newThread) {
        Firebase newThreadRef = new Firebase(Constants.FIREBASE_THREADS);
        newThreadRef.push().setValue(newThread);
    }
}