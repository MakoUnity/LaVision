package com.MakoLab.Unity.LaVision.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.MakoLab.Unity.LaVision.Commons.DatabaseHelper;

@Document(collection = "animationcConstants")
public class AnimationConstants {
	@Id
	private String ID;
	private float maxValue;
	private float minValue;
	
	public AnimationConstants(){
		ID = DatabaseHelper.ANIMATION_CONSTANTS_ID.getID();
	}

	public float getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(float maxValue) {
		this.maxValue = maxValue;
	}

	public float getMinValue() {
		return minValue;
	}

	public void setMinValue(float minValue) {
		this.minValue = minValue;
	}

	@Override
	public String toString() {
		return "AnimationConstants [maxValue=" + maxValue + ", minValue=" + minValue + "]";
	}
}
