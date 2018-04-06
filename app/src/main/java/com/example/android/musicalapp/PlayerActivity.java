package com.example.android.musicalapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by vladislavakopalova on 5.4.18.
 */

public class PlayerActivity extends AppCompatActivity {

    public static final String EXTRA_SONG = "song";

    public static Intent newIntent(Context context, Song song) {
        final Intent intent = new Intent(context, PlayerActivity.class);
        intent.putExtra(EXTRA_SONG, song);

        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);

        final Song song = (Song) getIntent().getExtras().getSerializable(EXTRA_SONG);

        TextView author = findViewById(R.id.songAuthor);
        author.setText(song.getAuthor());

        TextView name = findViewById(R.id.songName);
        name.setText(song.getName());

    }

    
}

