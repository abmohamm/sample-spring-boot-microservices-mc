package com.app.samplesv1.springbootmicroservicesmc.model;

import java.util.logging.Logger;

public class Rating {
	
	Logger logger = Logger.getLogger(Rating.class.getName());

    private String movieId;
    private int rating;    

    public Rating() {
		super();
		logger.info("Rating object created...");
    }

	public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}