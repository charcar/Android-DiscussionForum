package com.example.guest.discussionforum.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.guest.discussionforum.R;
import com.example.guest.discussionforum.models.Discussion;
import com.example.guest.discussionforum.ui.DiscussionDetailActivity;

import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Guest on 5/3/16.
 */
public class DiscussionViewHolder extends RecyclerView.ViewHolder {

    @Bind(R.id.subjectTextView) TextView mSubjectTextView;
    @Bind(R.id.authorTextView) TextView mAuthorTextView;

    private Context mContext;
    private ArrayList<Discussion> mDiscussions = new ArrayList<>();

    public DiscussionViewHolder(View itemView, ArrayList<Discussion> discussions) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        mContext = itemView.getContext();
        mDiscussions = discussions;
        Log.d("DISCUSSIONS", mDiscussions.size() + "");


        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int itemPosition = getLayoutPosition();
                Intent intent = new Intent(mContext, DiscussionDetailActivity.class);
                intent.putExtra("position", itemPosition + "");
                intent.putExtra("discussions", Parcels.wrap(mDiscussions));
                mContext.startActivity(intent);
            }
        });
    }
        public void bindDiscussion(Discussion discussion) {
            mAuthorTextView.setText(discussion.getAuthor());
            mSubjectTextView.setText(discussion.getSubject());

    }
}

