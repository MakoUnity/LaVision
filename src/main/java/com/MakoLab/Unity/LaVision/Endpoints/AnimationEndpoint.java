package com.MakoLab.Unity.LaVision.Endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MakoLab.Unity.LaVision.Application.AnimationConstantsService;
import com.MakoLab.Unity.LaVision.Models.AnimationConstants;

@Controller
@RestController
@RequestMapping("animation")
public class AnimationEndpoint {
	
	@Autowired
	private AnimationConstantsService animationConstantsService;
	
	@RequestMapping(value = "constants", method = RequestMethod.GET)
	public ResponseEntity<AnimationConstants> getAnimationConstants(){
		return new ResponseEntity<AnimationConstants>(animationConstantsService.getAnimationConstants(), HttpStatus.OK);		
	}
	
	@RequestMapping(value = "constants", method = RequestMethod.POST)
	public ResponseEntity<AnimationConstants> setAnimationConstants(@RequestBody AnimationConstants animationConstants){
		return new ResponseEntity<AnimationConstants>(animationConstantsService.changeAnimationConstants(animationConstants), HttpStatus.OK);		
	}
}
