package com.example.android.musicalapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vladislavakopalova on 5.4.18.
 */

public class SongAdapter extends ArrayAdapter<Song>{

    private final SongsActivity.OnSongClickedListener mOnSongClickedListener;

    public SongAdapter(Context context, ArrayList<Song> songs, SongsActivity.OnSongClickedListener onSongClickedListener) {
            super(context, 0, songs);

        mOnSongClickedListener = onSongClickedListener;
    }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.song_item, parent, false);
            }


            Song currentSong = getItem(position);
            TextView nameTextView = (TextView) listItemView.findViewById(R.id.songName);
            nameTextView.setText(currentSong.getName());

            TextView author = (TextView) listItemView.findViewById(R.id.songAuthor);
            author.setText(currentSong.getAuthor());

            listItemView.setOnClickListener(view -> {
                mOnSongClickedListener.onSongClicked(currentSong);
            });
            return listItemView;

    }
}
