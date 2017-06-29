package com.MakoLab.Unity.LaVision.Endpoints;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("country")
public class AddressEndpoint {
	
	@RequestMapping(value = "/{countryCode}", method = RequestMethod.GET)
	public ResponseEntity<Void> changeCountry(@PathVariable("countryCode") String countryCode){
		return null;		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Void> getActualCountry(){
		return null;
		
	}
}
