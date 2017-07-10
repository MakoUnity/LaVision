package com.MakoLab.Unity.LaVision.Models;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "actualAnimation")
public class ActualAnimation {
	@Id
	private String ID;
	private String objectName;
	private float animationValue;
	private boolean isActive;
	
	public ActualAnimation(){
		
	}
	
	public ActualAnimation(AnimationAddRequest actualAnimationRequest){
		this.ID = UUID.randomUUID().toString();
		this.objectName = actualAnimationRequest.getObjectName();
		this.animationValue = actualAnimationRequest.getAnimationValue();
		this.isActive = actualAnimationRequest.isActive();
	}

	public String getID() {
		return ID;
	}

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

	@Override
	public String toString() {
		return "ActualAnimation [ID=" + ID + ", objectName=" + objectName + ", animationValue=" + animationValue
				+ ", isActive=" + isActive + "]";
	}
}
