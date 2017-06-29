package com.MakoLab.Unity.LaVision.Endpoints;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MakoLab.Unity.LaVision.Application.AddressService;
import com.MakoLab.Unity.LaVision.Models.Address;
import com.MakoLab.Unity.LaVision.Models.AddressAddRequest;

@Controller
@RestController
@RequestMapping("country")
public class AddressEndpoint {
	
	@Autowired
	AddressService addressService;
	
	@RequestMapping(value = "/{countryID}", method = RequestMethod.GET)
	public ResponseEntity<Address> changeActualCountry(@PathVariable("countryID") String countryID){		
		Address address = addressService.getCountryAddress(countryID);
		addressService.changeActualCountryAddress(address);
		
		return new ResponseEntity<Address>(address, HttpStatus.OK); 
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Address> getActualCountry(){
		return new ResponseEntity<Address>(addressService.getActualCountryAddress(), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Address> addNewCountryAddress(@RequestBody AddressAddRequest addressAddRequeste){
		Address address = new Address(addressAddRequeste);
		
		return new ResponseEntity<Address>(addressService.addNewCountryAddress(address), HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<Address>> getAllCountryAddresses(){
		return new ResponseEntity<List<Address>>(addressService.getAllCountryAddress(), HttpStatus.OK);
	}
}
