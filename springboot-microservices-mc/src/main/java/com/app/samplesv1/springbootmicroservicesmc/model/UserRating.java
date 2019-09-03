package com.app.samplesv1.springbootmicroservicesmc.model;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class UserRating.
 */
public class UserRating {

	/** The user id. */
	private String userId;
	
	/** The ratings. */
	private List<Rating> ratings;
	
	/**
	 * Instantiates a new user rating.
	 */
	public UserRating() {
		super();
	}
	
	/**
	 * Instantiates a new user rating.
	 *
	 * @param ratings the ratings
	 * @param userId the user id
	 */
	public UserRating(List<Rating> ratings,String userId) {
		super();
		this.ratings = ratings;
		this.userId = userId;
	}

	/**
	 * Gets the ratings.
	 *
	 * @return the ratings
	 */
	public List<Rating> getRatings() {
		return ratings;
	}

	/**
	 * Sets the ratings.
	 *
	 * @param ratings the new ratings
	 */
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
