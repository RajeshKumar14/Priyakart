package com.app.model;

public class Address {
	private String addr1;
	private String addr2;
	private String city;
	private String state;
	private String pinCode;
	private String mobileNo;
	public Address() {
		super();
	}
	public Address(String addr1) {
		super();
		this.addr1 = addr1;
	}
	public Address(String addr1, String addr2) {
		super();
		this.addr1 = addr1;
		this.addr2 = addr2;
	}
	public Address(String addr1, String addr2, String city) {
		super();
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.city = city;
	}
	public Address(String addr1, String addr2, String city, String state) {
		super();
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.city = city;
		this.state = state;
	}
	public Address(String addr1, String addr2, String city, String state, String pinCode) {
		super();
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	public Address(String addr1, String addr2, String city, String state, String pinCode, String mobileNo) {
		super();
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Address [addr1=" + addr1 + ", addr2=" + addr2 + ", city=" + city + ", state=" + state + ", pinCode="
				+ pinCode + ", mobileNo=" + mobileNo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr1 == null) ? 0 : addr1.hashCode());
		result = prime * result + ((addr2 == null) ? 0 : addr2.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		result = prime * result + ((pinCode == null) ? 0 : pinCode.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
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
		Address other = (Address) obj;
		if (addr1 == null) {
			if (other.addr1 != null)
				return false;
		} else if (!addr1.equals(other.addr1))
			return false;
		if (addr2 == null) {
			if (other.addr2 != null)
				return false;
		} else if (!addr2.equals(other.addr2))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		if (pinCode == null) {
			if (other.pinCode != null)
				return false;
		} else if (!pinCode.equals(other.pinCode))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
}
