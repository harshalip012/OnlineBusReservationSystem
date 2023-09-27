package com.obrs.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


public class Customer {
	private long customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private long phonenumber;
	private int age;
	private String username;
	private String password;
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", gender=" + gender + ", phonenumber=" + phonenumber + ", age=" + age + ", userName="
				+ username + ", password=" + password + "]";
	}
	
}

