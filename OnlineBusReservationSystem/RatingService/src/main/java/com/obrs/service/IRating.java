package com.obrs.service;

import java.util.List;

import com.obrs.entities.Rating;

public interface IRating {
	
     public Rating createRating(Rating rating); 
     public List<Rating>getall();
	Rating getRatingByCustomerId(long customerId);
     
	

}
