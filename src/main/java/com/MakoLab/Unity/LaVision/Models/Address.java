package com.MakoLab.Unity.LaVision.Models;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "availableAddresses")
public class Address {
	@Id
	private String ID;
	private String country;
	private String locationName;
	private String locationAddress;
	private String postAddress;
	private String phoneNumber;
	private String faxNumber;
	private String mailAddress;
	
	public Address(){
		
	}

	public Address(AddressAddRequest addressAddRequest) {
		this.ID = UUID.randomUUID().toString();
		this.country = addressAddRequest.getCountry();
		this.locationName = addressAddRequest.getLocationName();
		this.locationAddress = addressAddRequest.getLocationAddress();
		this.postAddress = addressAddRequest.getPostAddress();
		this.phoneNumber = addressAddRequest.getPhoneNumber();
		this.faxNumber = addressAddRequest.getFaxNumber();
		this.mailAddress = addressAddRequest.getMailAddress();
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLocationAddress() {
		return locationAddress;
	}

	public void setLocationAddress(String locationAddress) {
		this.locationAddress = locationAddress;
	}

	public String getPostAddress() {
		return postAddress;
	}

	public void setPostAddress(String postAddress) {
		this.postAddress = postAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	@Override
	public String toString() {
		return "Address [ID=" + ID + ", country=" + country + ", locationName=" + locationName + ", locationAddress="
				+ locationAddress + ", postAddress=" + postAddress + ", phoneNumber=" + phoneNumber + ", faxNumber="
				+ faxNumber + ", mailAddress=" + mailAddress + "]";
	}
}
