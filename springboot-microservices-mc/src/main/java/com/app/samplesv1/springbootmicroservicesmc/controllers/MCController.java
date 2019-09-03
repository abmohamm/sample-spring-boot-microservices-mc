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
import org.springframework.web.reactive.function.client.WebClient;

import com.app.samplesv1.springbootmicroservicesmc.model.CatalogItem;
import com.app.samplesv1.springbootmicroservicesmc.model.Movie;
import com.app.samplesv1.springbootmicroservicesmc.model.Rating;
import com.app.samplesv1.springbootmicroservicesmc.model.UserRating;
import com.app.samplesv1.springbootmicroservicesmc.services.MovieInfoService;
import com.app.samplesv1.springbootmicroservicesmc.services.UserRatingInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

// TODO: Auto-generated Javadoc
/**
 * The Class MCController.
 */
@RestController
@RequestMapping("/catalog")
public class MCController {
	
	/** The logger. */
	Logger logger = Logger.getLogger(MCController.class.getName());
	
	/** The rest template. */
	@Autowired
	RestTemplate restTemplate;
	
	/** The web client builder. */
	@Autowired
	WebClient webClient;
	
	@Autowired
	MovieInfoService movieInfoService;
	
	@Autowired
	UserRatingInfo userRatingService;
	
	/**
	 * Gets the catalog.
	 *
	 * @param userId the user id
	 * @return the catalog
	 */
	@RequestMapping("/{userId}")
	//@HystrixCommand(fallbackMethod = "getFallbackCatalog")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		List<CatalogItem> catalogItems = new ArrayList<CatalogItem>();
		UserRating userRating = userRatingService.getUserRating(userId);
		
		//get all the rated movie id's
		/*List<Rating> ratings = Arrays.asList(new Rating("1234",4),
											 new Rating("5678",3)); */
		
		for(Rating rating : userRating.getRatings()) {
			/*movie = webClient.get()
					 		 .uri("http://localhost:8082/movies/"+rating.getMovieId())
					 		 .retrieve()
					 		 .bodyToMono(Movie.class).block();*/
			catalogItems.add(movieInfoService.getCatalogItem(rating));
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

//	public List<CatalogItem> getFallbackCatalog(@PathVariable("userId") String userId){
//		return Arrays.asList(new CatalogItem("No Movie","",0));
//	}

}
