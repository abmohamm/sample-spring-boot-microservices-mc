package com.app.samplesv1.springbootmicroservicesmc.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.app.samplesv1.springbootmicroservicesmc.model.Rating;
import com.app.samplesv1.springbootmicroservicesmc.model.UserRating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

// TODO: Auto-generated Javadoc
/**
 * The Class UserRatingInfo.
 */
@Service
public class UserRatingInfo {
	
	/** The rest template. */
	@Autowired
	RestTemplate restTemplate;
	
	/**
	 * Gets the user rating.
	 *
	 * @param userId the user id
	 * @return the user rating
	 */
	@HystrixCommand(fallbackMethod = "getFallbackUserRating")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		return restTemplate.getForObject("http://localhost:8083/ratingsdata/users/"+userId, UserRating.class);
	}
	
	/**
	 * Gets the fallback user rating.
	 *
	 * @param userId the user id
	 * @return the fallback user rating
	 */
	public UserRating getFallbackUserRating(@PathVariable("userId") String userId) {
		UserRating userRating = new UserRating();
		userRating.setUserId(userId);
		userRating.setRatings(Arrays.asList(new Rating("0",0)));
		return userRating;		
	}

}
