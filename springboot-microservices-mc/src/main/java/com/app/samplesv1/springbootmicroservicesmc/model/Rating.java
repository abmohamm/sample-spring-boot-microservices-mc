package com.app.samplesv1.springbootmicroservicesmc.model;

import java.util.logging.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class Rating.
 */
public class Rating {
	
	/** The logger. */
	Logger logger = Logger.getLogger(Rating.class.getName());

    /** The movie id. */
    private String movieId;
    
    /** The rating. */
    private int rating;    

    /**
     * Instantiates a new rating.
     */
    public Rating() {
		super();
		logger.info("Rating object created...");
    }

	/**
	 * Instantiates a new rating.
	 *
	 * @param movieId the movie id
	 * @param rating the rating
	 */
	public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    /**
     * Gets the movie id.
     *
     * @return the movie id
     */
    public String getMovieId() {
        return movieId;
    }

    /**
     * Sets the movie id.
     *
     * @param movieId the new movie id
     */
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    /**
     * Gets the rating.
     *
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * Sets the rating.
     *
     * @param rating the new rating
     */
    public void setRating(int rating) {
        this.rating = rating;
    }
}