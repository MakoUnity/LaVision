package com.MakoLab.Unity.LaVision.Application;

import java.util.List;

import com.MakoLab.Unity.LaVision.Models.Address;

public interface AddressService {
	Address addNewCountryAddress(Address address);
	Address getActualCountryAddress();
	Address changeActualCountryAddress(Address address);
	Address getCountryAddress(String countryID);
	List<Address> getAllCountryAddress();
}
