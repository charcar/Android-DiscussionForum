package com.example.guest.discussionforum.ui;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;

        import com.example.guest.discussionforum.Constants;
        import com.example.guest.discussionforum.R;
        import com.example.guest.discussionforum.adapters.FirebaseDiscussionListAdapter;
        import com.example.guest.discussionforum.models.Discussion;
        import com.firebase.client.Firebase;
        import com.firebase.client.Query;

        import butterknife.Bind;
        import butterknife.ButterKnife;

public class DiscussionListActivity extends AppCompatActivity {

    private Firebase mFirebaseDiscussionsRef;
    private FirebaseDiscussionListAdapter mAdapter;
    private Query mQuery;

    @Bind(R.id.recyclerView) RecyclerView mRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discussion_list);
        ButterKnife.bind(this);

        mFirebaseDiscussionsRef = new Firebase(Constants.FIREBASE_THREADS);

        setUpFirebaseQuery();
        setUpRecyclerView();
    }

    private void setUpFirebaseQuery() {
        String allThreads = mFirebaseDiscussionsRef.toString();
        mQuery = new Firebase(allThreads);
    }

    private void setUpRecyclerView() {
        mAdapter = new FirebaseDiscussionListAdapter(mQuery, Discussion.class);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);
    }
}