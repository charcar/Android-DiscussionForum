package com.example.guest.discussionforum.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.guest.discussionforum.R;
import com.example.guest.discussionforum.models.Discussion;
import com.example.guest.discussionforum.util.FirebaseRecyclerAdapter;
import com.firebase.client.Query;

/**
 * Created by Guest on 5/3/16.
 */
public class FirebaseDiscussionListAdapter extends FirebaseRecyclerAdapter<DiscussionViewHolder, Discussion> {

    public FirebaseDiscussionListAdapter(Query query, Class<Discussion> itemClass) {
        super(query, itemClass);
        Log.d("QUERY", query.toString());
    }

    @Override
    public DiscussionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.discussion_list_item, parent, false);
        Log.d("ITEMS NUM", getItems().size() + "");
        return new DiscussionViewHolder(view, getItems());
    }

    @Override
    public void onBindViewHolder(DiscussionViewHolder holder, int position) {
        holder.bindDiscussion(getItem(position));
    }

    @Override
    protected void itemAdded(Discussion item, String key, int position) {

    }

    @Override
    protected void itemChanged(Discussion oldItem, Discussion newItem, String key, int position) {

    }

    @Override
    protected void itemRemoved(Discussion item, String key, int position){}

    @Override
    protected void itemMoved(Discussion item, String key, int oldPosition, int newPosition){}

}
