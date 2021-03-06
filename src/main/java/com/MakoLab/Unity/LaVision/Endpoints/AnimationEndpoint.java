package com.MakoLab.Unity.LaVision.Endpoints;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MakoLab.Unity.LaVision.Application.AnimationConstantsService;
import com.MakoLab.Unity.LaVision.Application.AnimationService;
import com.MakoLab.Unity.LaVision.Models.ActualAnimation;
import com.MakoLab.Unity.LaVision.Models.AnimationAddRequest;
import com.MakoLab.Unity.LaVision.Models.AnimationConstants;

@Controller
@RestController
@RequestMapping("animation")
public class AnimationEndpoint {
	
	@Autowired
	private AnimationConstantsService animationConstantsService;
	
	@Autowired
	private AnimationService animationService;

	@RequestMapping(value = "/constants", method = RequestMethod.GET)
	public ResponseEntity<AnimationConstants> getAnimationConstants() {
		return new ResponseEntity<AnimationConstants>(animationConstantsService.getAnimationConstants(), HttpStatus.OK);
	}

	@RequestMapping(value = "/constants", method = RequestMethod.POST)
	public ResponseEntity<AnimationConstants> setAnimationConstants(
			@RequestBody AnimationConstants animationConstants) {
		return new ResponseEntity<AnimationConstants>(
				animationConstantsService.changeAnimationConstants(animationConstants), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/actual", method = RequestMethod.POST)
	public ResponseEntity<ActualAnimation> addActualAnimation(@RequestBody AnimationAddRequest animationAddRequest){
		return new ResponseEntity<ActualAnimation>(animationService.addActualAnimation(animationAddRequest), HttpStatus.CREATED);		
	}

	@RequestMapping(value = "/actual/{ID}", method = RequestMethod.POST)
	public ResponseEntity<ActualAnimation> changeActualAnimation(
			@RequestBody ActualAnimation actualAnimation, @PathVariable("ID") String ID) {
		return new ResponseEntity<ActualAnimation>(animationService.changeActualAnimation(actualAnimation, ID), HttpStatus.OK);
	}

	@RequestMapping(value = "/actual/{ID}", method = RequestMethod.GET)
	public ResponseEntity<ActualAnimation> getActualAnimation(@PathVariable("ID") String ID) {
		return new ResponseEntity<ActualAnimation>(animationService.getActualAnimation(ID), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Map<String, List<ActualAnimation>>> getAllAnimationObjects() {
		Map<String, List<ActualAnimation>> result = new HashMap<>();
		result.put("animations", animationService.getAllActualAnimation());
		
		return new ResponseEntity<Map<String, List<ActualAnimation>>>(result, HttpStatus.OK);
	}

}
