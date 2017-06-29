package com.MakoLab.Unity.LaVision.Models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "actualAddress")
public class AddressActual {
	private String ID;
	private String countryID;
	private String countryName;

	public AddressActual(Address address) {
		this.ID = "666";
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
