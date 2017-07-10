package com.MakoLab.Unity.LaVision.Models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "animationcConstants")
public class AnimationConstants {
	private float maxValue;
	private float minValue;

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
