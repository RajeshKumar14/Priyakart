package com.app.model;

public class Seller {
	
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNo;
	private String Token;
	private String Pwd;
	private String PickUpAddress;
	private String dob;
	private String gender;
	
	public Seller() {
		super();
	}

	public Seller(String firstName) {
		super();
		this.firstName = firstName;
	}

	public Seller(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Seller(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Seller(String firstName, String lastName, String email, String mobileNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
	}

	public Seller(String firstName, String lastName, String email, String mobileNo, String token) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
		Token = token;
	}

	public Seller(String firstName, String lastName, String email, String mobileNo, String token, String pwd,
			String pickUpAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
		Token = token;
		Pwd = pwd;
		PickUpAddress = pickUpAddress;
	}

	public Seller(String firstName, String lastName, String email, String mobileNo, String token, String pwd,
			String pickUpAddress, String dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
		Token = token;
		Pwd = pwd;
		PickUpAddress = pickUpAddress;
		this.dob = dob;
	}

	public Seller(String firstName, String lastName, String email, String mobileNo, String token, String pwd,
			String pickUpAddress, String dob, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
		Token = token;
		Pwd = pwd;
		PickUpAddress = pickUpAddress;
		this.dob = dob;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Seller [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", mobileNo="
				+ mobileNo + ", Token=" + Token + ", Pwd=" + Pwd + ", PickUpAddress=" + PickUpAddress + ", dob=" + dob
				+ ", gender=" + gender + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PickUpAddress == null) ? 0 : PickUpAddress.hashCode());
		result = prime * result + ((Pwd == null) ? 0 : Pwd.hashCode());
		result = prime * result + ((Token == null) ? 0 : Token.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (PickUpAddress == null) {
			if (other.PickUpAddress != null)
				return false;
		} else if (!PickUpAddress.equals(other.PickUpAddress))
			return false;
		if (Pwd == null) {
			if (other.Pwd != null)
				return false;
		} else if (!Pwd.equals(other.Pwd))
			return false;
		if (Token == null) {
			if (other.Token != null)
				return false;
		} else if (!Token.equals(other.Token))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		return true;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getToken() {
		return Token;
	}

	public void setToken(String token) {
		Token = token;
	}

	public String getPwd() {
		return Pwd;
	}

	public void setPwd(String pwd) {
		Pwd = pwd;
	}

	public String getPickUpAddress() {
		return PickUpAddress;
	}

	public void setPickUpAddress(String pickUpAddress) {
		PickUpAddress = pickUpAddress;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
               
}
