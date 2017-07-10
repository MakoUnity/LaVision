package com.MakoLab.Unity.LaVision.Application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MakoLab.Unity.LaVision.Models.ActualAnimation;
import com.MakoLab.Unity.LaVision.Models.AnimationAddRequest;
import com.MakoLab.Unity.LaVision.Repository.AnimationRepository;

@Service
public class AnimationServiceImpl implements AnimationService {

	@Autowired
	private AnimationRepository animationRespository;
	
	@Override
	public ActualAnimation changeActualAnimation(ActualAnimation actualAnimation, String ID) {		
		ActualAnimation animation = animationRespository.findOne(ID);
		animation.setActive(actualAnimation.isActive());
		animation.setAnimationValue(actualAnimation.getAnimationValue());
		animation.setObjectName(actualAnimation.getObjectName());
				
		return animationRespository.save(animation);
	}

	@Override
	public ActualAnimation getActualAnimation(String ID) {		
		return animationRespository.findOne(ID);
	}

	@Override
	public List<ActualAnimation> getAllActualAnimation() {	
		return animationRespository.findAll();
	}

	@Override
	public ActualAnimation addActualAnimation(AnimationAddRequest animationAddRequest) {
		ActualAnimation actualAnimation = new ActualAnimation(animationAddRequest);
		
		return animationRespository.save(actualAnimation);
	}

}
