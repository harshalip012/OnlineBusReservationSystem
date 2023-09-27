package com.obrs.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obrs.entities.Rating;
import com.obrs.repository.RatingRepository;

@Service
public class RatingImpl implements IRating{

	@Autowired
	 private RatingRepository ratingRepository;
	 
	@Override
	public Rating createRating(Rating rating) {
		return ratingRepository.save(rating);
	}

	@Override
	public Rating getRatingByCustomerId(long customerId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByIdlong(customerId);
	}

	
	@Override
	public List<Rating> getall() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}

}
