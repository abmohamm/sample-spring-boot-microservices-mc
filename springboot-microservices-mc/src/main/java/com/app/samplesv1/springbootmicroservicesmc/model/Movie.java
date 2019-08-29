package com.app.samplesv1.springbootmicroservicesmc.model;

import java.util.logging.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class Movie.
 */
public class Movie {
	
	/** The logger. */
	Logger logger = Logger.getLogger(Movie.class.getName());
	
    /** The movie id. */
    private String movieId;
    
    /** The name. */
    private String name;
    
    /** The description. */
    private String description;    

    /**
     * Instantiates a new movie.
     */
    public Movie() {
		super();
		logger.info("Movie object created...");
	}

	/**
	 * Instantiates a new movie.
	 *
	 * @param movieId the movie id
	 * @param name the name
	 * @param description the description
	 */
	public Movie(String movieId, String name, String description) {
        this.movieId = movieId;
        this.name = name;
        this.description = description;
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
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
