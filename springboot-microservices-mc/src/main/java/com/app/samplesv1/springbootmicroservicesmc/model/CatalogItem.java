package com.app.samplesv1.springbootmicroservicesmc.model;

import java.util.logging.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class CatalogItem.
 */
public class CatalogItem {

	/** The logger. */
	Logger logger = Logger.getLogger(CatalogItem.class.getName());
	
	/** The name. */
	private String name;
	
	/** The description. */
	private String description;
	
	/** The rating. */
	private int rating;
	
	/**
	 * Instantiates a new catalog item.
	 */
	public CatalogItem() {
		super();
		logger.info("CatalogItem object is created...");
	}
	
	/**
	 * Instantiates a new catalog item.
	 *
	 * @param name the name
	 * @param description the description
	 * @param rating the rating
	 */
	public CatalogItem(String name, String description, int rating) {
		super();
		this.name = name;
		this.description = description;
		this.rating = rating;
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
