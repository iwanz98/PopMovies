package com.wanztudio.iak.popmovies.models;

import java.util.ArrayList;

/**
 * For LEARNING
 * Created by Ridwan Ismail on 05 Mei 2016
 * You can contact me at : ismail.ridwan98@gmail.com
 * -------------------------------------------------
 * POP MOVIES
 * com.wanztudio.iak.popmovies.models
 * or see link for more detail https://github.com/iwanz98/PopMovies
 */


public class ReviewEvent {
    public ArrayList<Review> reviewArrayList;
    public String status;
    public String message;

    public ReviewEvent(String status, ArrayList<Review> reviewArrayList) {
        this.status = status;
        this.reviewArrayList = reviewArrayList;
    }

    public ReviewEvent(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
