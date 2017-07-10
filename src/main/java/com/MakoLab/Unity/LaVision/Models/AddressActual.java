package com.MakoLab.Unity.LaVision.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.MakoLab.Unity.LaVision.Commons.DatabaseHelper;

@Document(collection = "actualAddress")
public class AddressActual {
	@Id
	private String ID;
	private String countryID;
	private String countryName;

	public AddressActual(){
		
	}
	
	public AddressActual(Address address) {
		this.ID = DatabaseHelper.ACTUAL_ADDRESS_ID.getID();
		this.countryID = address.getID();
		this.countryName = address.getCountry();
	}

	public String getCountryID() {
		return countryID;
	}

	public void setCountryID(String countryID) {
		this.countryID = countryID;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
}
