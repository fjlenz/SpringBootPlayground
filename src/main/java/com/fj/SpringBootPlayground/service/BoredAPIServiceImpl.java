package com.fj.SpringBootPlayground.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fj.SpringBootPlayground.model.ActivityModel;


@Service
public class BoredAPIServiceImpl implements BoredAPIService{
	WebClient webClient = WebClient.create("https://www.boredapi.com/api/");
	
	@Override
	public ActivityModel retrieveActivity() {
		
		ActivityModel retrievedAct = webClient
	        .get()
	        .uri("activity")
	        .retrieve()
	        .bodyToMono(ActivityModel.class)
	        .block();
		
        return retrievedAct;
        
	}

}

