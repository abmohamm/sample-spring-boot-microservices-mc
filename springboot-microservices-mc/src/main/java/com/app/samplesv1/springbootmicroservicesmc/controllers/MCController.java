package com.app.samplesv1.springbootmicroservicesmc.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.app.samplesv1.springbootmicroservicesmc.model.CatalogItem;
import com.app.samplesv1.springbootmicroservicesmc.model.Movie;
import com.app.samplesv1.springbootmicroservicesmc.model.Rating;

@RestController
@RequestMapping("/catalog")
public class MCController {
	
	Logger logger = Logger.getLogger(MCController.class.getName());
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		List<CatalogItem> catalogItems = new ArrayList<CatalogItem>();
		Movie movie = null;
		
		//get all the rated movie id's
		List<Rating> ratings = Arrays.asList(new Rating("1234",4),
											 new Rating("5678",3)); 
		
		for(Rating rating : ratings) {
			movie = restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
			catalogItems.add(new CatalogItem(movie.getName(),movie.getDescription(),rating.getRating()));
		}
		
		//for each movie id, call the movie info service to get the movie details
		
		//consolidate all together
		
		logger.info("User Id passed is : "+userId);
		
//		List<CatalogItem> catalogItems = new ArrayList<CatalogItem>();
//		
//		catalogItems.add(new CatalogItem("maharshi","telugu",4));
//		catalogItems.add(new CatalogItem("batla house","hindi",5));
//		catalogItems.add(new CatalogItem("dabangg","hindi",6));
		
		return catalogItems;		
	}

}