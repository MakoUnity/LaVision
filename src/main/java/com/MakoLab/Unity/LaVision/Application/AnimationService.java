package com.MakoLab.Unity.LaVision.Application;

import java.util.List;

import com.MakoLab.Unity.LaVision.Models.ActualAnimation;
import com.MakoLab.Unity.LaVision.Models.AnimationAddRequest;

public interface AnimationService {
	ActualAnimation addActualAnimation(AnimationAddRequest animationAddRequest);
	ActualAnimation changeActualAnimation(ActualAnimation actualAnimation, String ID);
	ActualAnimation getActualAnimation(String ID);
	List<ActualAnimation> getAllActualAnimation();
}
