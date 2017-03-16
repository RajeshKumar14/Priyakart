package com.app.model;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Consumer {

	private String firstName;
	private String lastName;
	private String email;
	private String mobileNo;
	public Location loc;
	private String Token;
	private String Pwd;
}
