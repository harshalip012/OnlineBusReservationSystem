package com.obrs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.obrs.entities.Rating;
import com.obrs.service.RatingImpl;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	
	@Autowired
	private RatingImpl service;

	

	@PostMapping("/create")
	public ResponseEntity<Rating> addRating(@RequestBody Rating rating ){
		Rating rating1 = service.createRating(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
	}
	
	@GetMapping("/users/{userId}")
	public ResponseEntity <Rating>getRatingByCustomerId(@PathVariable int userId){
		return ResponseEntity.ok(service.getRatingByCustomerId(userId));
	}
	
	
	@GetMapping("/users")
	public ResponseEntity<List<Rating>>getAll(){
		return ResponseEntity.ok(service.getall());
	}
}
