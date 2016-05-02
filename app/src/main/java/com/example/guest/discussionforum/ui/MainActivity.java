package com.example.guest.discussionforum.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.guest.discussionforum.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.startTopicButton) Button mStartTopicButton;
    @Bind(R.id.viewThreadsButton) Button mViewThreadsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mViewThreadsButton.setOnClickListener(this);
        mStartTopicButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mStartTopicButton) {
            Intent intent = new Intent(MainActivity.this, NewDiscussionActivity.class);
            startActivity(intent);
        }
        if (v == mViewThreadsButton) {
            Intent intent = new Intent(MainActivity.this, DiscussionListActivity.class);
            startActivity(intent);
        }
    }
}
