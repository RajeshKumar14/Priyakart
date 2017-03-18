package com.app.model;

import javax.persistence.Entity;

@Entity
public class Consumer {

	private String consFirstName;
	private String consLastName;
	private String consEmail;
	private String mobileNo;
	private Address shippingAddress;
	private String dob;
	private String gender;
	
}
