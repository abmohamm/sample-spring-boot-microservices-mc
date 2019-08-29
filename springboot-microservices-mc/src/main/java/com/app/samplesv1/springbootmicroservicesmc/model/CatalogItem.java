package com.app.samplesv1.springbootmicroservicesmc.model;

import java.util.logging.Logger;

public class CatalogItem {

	Logger logger = Logger.getLogger(CatalogItem.class.getName());
	
	private String name;
	private String description;
	private int rating;
	
	public CatalogItem() {
		super();
		logger.info("CatalogItem object is created...");
	}
	
	public CatalogItem(String name, String description, int rating) {
		super();
		this.name = name;
		this.description = description;
		this.rating = rating;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
