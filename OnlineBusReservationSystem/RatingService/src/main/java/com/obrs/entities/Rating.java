package com.obrs.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder

@Table
public class Rating {
	@Id
	private int ratingId;
	private long customerId;
	private int ratings;
	private String feedback;
	
}
