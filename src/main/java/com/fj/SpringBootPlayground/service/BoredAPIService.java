package com.fj.SpringBootPlayground.service;


import com.fj.SpringBootPlayground.model.ActivityModel;

import reactor.core.publisher.Mono;

public interface BoredAPIService {

	public abstract ActivityModel retrieveActivity();
	
}