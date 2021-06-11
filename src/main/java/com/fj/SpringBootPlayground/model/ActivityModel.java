package com.fj.SpringBootPlayground.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActivityModel   {

	@JsonProperty(value = "activity", required = true)
	private String activity = null;

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

}
