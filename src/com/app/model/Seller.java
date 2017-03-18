package com.app.model;

import javax.persistence.Entity;

@Entity
public class Seller {
	
    private String sellerFirstName;
	private String sellerLastName;
	private String sellerEmail;
	private String mobileNo;
	
	public Seller() {
		super();
	}

	public Seller(String sellerFirstName) {
		super();
		this.sellerFirstName = sellerFirstName;
	}

	public Seller(String sellerFirstName, String sellerLastName) {
		super();
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
	}

	public Seller(String sellerFirstName, String sellerLastName, String sellerEmail) {
		super();
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
	}

	public Seller(String sellerFirstName, String sellerLastName, String sellerEmail, String mobileNo) {
		super();
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Seller [sellerFirstName=" + sellerFirstName + ", sellerLastName=" + sellerLastName + ", sellerEmail="
				+ sellerEmail + ", mobileNo=" + mobileNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		result = prime * result + ((sellerEmail == null) ? 0 : sellerEmail.hashCode());
		result = prime * result + ((sellerFirstName == null) ? 0 : sellerFirstName.hashCode());
		result = prime * result + ((sellerLastName == null) ? 0 : sellerLastName.hashCode());
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
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		if (sellerEmail == null) {
			if (other.sellerEmail != null)
				return false;
		} else if (!sellerEmail.equals(other.sellerEmail))
			return false;
		if (sellerFirstName == null) {
			if (other.sellerFirstName != null)
				return false;
		} else if (!sellerFirstName.equals(other.sellerFirstName))
			return false;
		if (sellerLastName == null) {
			if (other.sellerLastName != null)
				return false;
		} else if (!sellerLastName.equals(other.sellerLastName))
			return false;
		return true;
	}

	public String getSellerFirstName() {
		return sellerFirstName;
	}

	public void setSellerFirstName(String sellerFirstName) {
		this.sellerFirstName = sellerFirstName;
	}

	public String getSellerLastName() {
		return sellerLastName;
	}

	public void setSellerLastName(String sellerLastName) {
		this.sellerLastName = sellerLastName;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
             
}
