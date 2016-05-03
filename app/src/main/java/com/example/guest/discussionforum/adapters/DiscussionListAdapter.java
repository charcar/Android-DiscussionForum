package com.example.guest.discussionforum.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.guest.discussionforum.R;
import com.example.guest.discussionforum.models.Discussion;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DiscussionListAdapter extends RecyclerView.Adapter<DiscussionViewHolder> {
    private ArrayList<Discussion> mDiscussions = new ArrayList<>();
    private Context mContext;

    public DiscussionListAdapter(Context context, ArrayList<Discussion> discussions) {
        mContext = context;
        mDiscussions = discussions;
    }

    @Override
    public DiscussionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.discussion_list_item, parent, false);
        DiscussionViewHolder viewHolder = new DiscussionViewHolder(view, mDiscussions);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(DiscussionViewHolder holder, int position) {
        holder.bindDiscussion(mDiscussions.get(position));
    }

    @Override
    public int getItemCount() {
        return mDiscussions.size();
    }

}