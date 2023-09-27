package com.obrs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
	private  int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String Gender;
	private long phonenumber;
	private int age;
	private String username;
	private String password;
    
   
    
    
   
   
}