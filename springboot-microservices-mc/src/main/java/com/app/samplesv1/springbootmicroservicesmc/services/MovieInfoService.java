package com.app.samplesv1.springbootmicroservicesmc.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.app.samplesv1.springbootmicroservicesmc.model.CatalogItem;
import com.app.samplesv1.springbootmicroservicesmc.model.Movie;
import com.app.samplesv1.springbootmicroservicesmc.model.Rating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

// TODO: Auto-generated Javadoc
/**
 * The Class MovieInfoService.
 */
@Service
public class MovieInfoService {
	
	/** The rest template. */
	@Autowired
	RestTemplate restTemplate;
	
	/**
	 * Gets the catalog item.
	 *
	 * @param rating the rating
	 * @return the catalog item
	 */
	@HystrixCommand(fallbackMethod = "getFallbackCatalogItem")
	public CatalogItem getCatalogItem(Rating rating) {
		Movie movie = restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
		return new CatalogItem(movie.getName(),movie.getDescription(),rating.getRating());		
	}
	
	/**
	 * Gets the fallback catalog item.
	 *
	 * @param rating the rating
	 * @return the fallback catalog item
	 */
	public CatalogItem getFallbackCatalogItem(Rating rating) {
		return new CatalogItem("Movie name not found","",rating.getRating());
	}

}
