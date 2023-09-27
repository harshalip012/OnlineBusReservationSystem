package com.obrs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.obrs.entities.Rating;

public interface RatingRepository extends JpaRepository<Rating,Integer>{

    @Query(value = "select * from rating WHERE customer_id = ?1", nativeQuery = true)
	Rating findByIdlong(long userId);

	
}
