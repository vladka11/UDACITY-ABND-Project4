package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button songlist = (Button) findViewById(R.id.specialButton);

        songlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songssIntent = new Intent(MainActivity.this,SongsActivity.class);
                startActivity(songssIntent);
            }
        });


    }


}
