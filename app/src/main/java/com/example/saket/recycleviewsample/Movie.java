package com.example.saket.recycleviewsample;

import android.widget.ImageView;

/**
 * Created by saket on 02-Sep-16.
 */
public class Movie {
    private String title,genre,year;
    private ImageView imageView;

    public Movie() {
    }
    public Movie(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        //this.imageView=imageView;
    }

    public ImageView getImageView() {
        return imageView;
    }

   /* public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
