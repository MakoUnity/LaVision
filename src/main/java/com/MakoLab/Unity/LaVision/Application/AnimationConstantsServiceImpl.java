package com.MakoLab.Unity.LaVision.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MakoLab.Unity.LaVision.Commons.DatabaseHelper;
import com.MakoLab.Unity.LaVision.Models.AnimationConstants;
import com.MakoLab.Unity.LaVision.Repository.AnimationConstantsRepository;

@Service
public class AnimationConstantsServiceImpl implements AnimationConstantsService {

	@Autowired
	private AnimationConstantsRepository animationConstantsRepository;
	
	@Override
	public AnimationConstants getAnimationConstants() {		
		return animationConstantsRepository.findOne(DatabaseHelper.ANIMATION_CONSTANTS_ID.getID());
	}

	@Override
	public AnimationConstants changeAnimationConstants(AnimationConstants animationConstants) {		
		return animationConstantsRepository.save(animationConstants);
	}

}
