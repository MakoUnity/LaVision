package com.MakoLab.Unity.LaVision.Models;

public class AnimationAddRequest {
	private String objectName;
	private float animationValue;
	private boolean isActive;

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public float getAnimationValue() {
		return animationValue;
	}

	public void setAnimationValue(float animationValue) {
		this.animationValue = animationValue;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
