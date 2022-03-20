package com.rest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="ngo_details")
public class NGOdetails {
	
	public NGOdetails() {};
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long detailsId;
	
	@NotNull
	private String NGOname;
	@NotNull
	private String OwnerName;
	@NotNull
	private String panNo;
	@NotNull
	private long registrationNo;
	
	// contact and address
	@NotNull
	private long phone;
	private String website;
	
	@NotNull
	@Size(max=100)
	private String Address;
	private String city;
	private long pin;
	private String state;
	
	
	public NGOdetails(String NGOname, String OwnerName, String panNo, long registrationNo, long phone,
			String website, String Address, String city, long pin, String state) {
		this.NGOname = NGOname;
		this.OwnerName = OwnerName;
		this.panNo = panNo;
		this.registrationNo = registrationNo;
		this.phone = phone;
		this.website = website;
		this.Address = Address;
		this.city = city;
		this.pin = pin;
		this.state = state;
	}

	public long getNgoId() {
		return detailsId;
	}

	public void setNgoId(long detailsId) {
		this.detailsId = detailsId;
	}

	public String getNGOname() {
		return NGOname;
	}

	public void setNGOname(String NGOname) {
		this.NGOname = NGOname;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String OwnerName) {
		this.OwnerName = OwnerName;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public long getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(long registrationNo) {
		this.registrationNo = registrationNo;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


}
