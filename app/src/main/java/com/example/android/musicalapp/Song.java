package com.example.android.musicalapp;

import java.io.Serializable;

/**
 * Created by vladislavakopalova on 5.4.18.
 */

public class Song implements Serializable {
    private String songName;
    private String songAuthor;

    public Song(String name, String author){
        songName=name;
        songAuthor=author;
    }

    public String getName(){return songName;}
    public String getAuthor(){return songAuthor;}

}
