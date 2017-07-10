package com.MakoLab.Unity.LaVision.Application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MakoLab.Unity.LaVision.Commons.DatabaseHelper;
import com.MakoLab.Unity.LaVision.Models.Address;
import com.MakoLab.Unity.LaVision.Models.AddressActual;
import com.MakoLab.Unity.LaVision.Repository.ActualAddressRepository;
import com.MakoLab.Unity.LaVision.Repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private ActualAddressRepository actualAddressRepository;
	
	@Override
	public Address addNewCountryAddress(Address address) {
		Address newAddress = addressRepository.save(address);
		
		return newAddress;
	}

	@Override
	public Address getActualCountryAddress() {
		AddressActual addressActual = actualAddressRepository.findOne(DatabaseHelper.ACTUAL_ADDRESS_ID.getID());
		
		return addressRepository.findOne(addressActual.getCountryID());
	}

	@Override
	public Address changeActualCountryAddress(Address address) {
		AddressActual addressActual = new AddressActual(address);
		actualAddressRepository.save(addressActual);
		
		return address;
	}

	@Override
	public Address getCountryAddress(String countryID) {
		return addressRepository.findOne(countryID);
	}

	@Override
	public List<Address> getAllCountryAddress() {
		return addressRepository.findAll();
	}
}
