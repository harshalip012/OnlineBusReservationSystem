package com.obrs.entity;

 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

 

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="customer")
public class Customer {
	@Id
	private int customerId;
	@NotNull(message = "First name cannot be blank")
	@Size(max = 50, message = "First name cannot be longer than 50 characters")
	private String firstName;
	@NotNull(message = "Last name cannot be blank")
	@Size(max = 50, message = "Last name cannot be longer than 50 characters")
	private String lastName;
	@Email(message = "Invalid email format")
	private String email;
	
	@NotNull(message = "Gender cannot be blank")
	private String gender;
	@Positive(message = "Phone number must be a positive number")
	private long phonenumber;
	private int age;
//	@NotNull(message = "Username cannot be blank")
//    @Size(max = 50, message = "Username cannot be longer than 50 characters")
//	@Pattern(regexp = "[a-zA-Z0-9_-]+", message = "Username can only contain letters, numbers, underscores, and hyphens")
	private String username;
	@NotNull(message = "Password cannot be blank")
	@Size(min = 8, message = "Password must be at least 8 characters long")
	private String password;
	 
	    
    
}

