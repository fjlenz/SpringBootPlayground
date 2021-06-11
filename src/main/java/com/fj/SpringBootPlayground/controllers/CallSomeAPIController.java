package com.fj.SpringBootPlayground.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.fj.SpringBootPlayground.model.ActivityModel;
import com.fj.SpringBootPlayground.service.BoredAPIService;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CallSomeAPIController {
	
	@Autowired
	private BoredAPIService boredService;
	
	Logger logger = LoggerFactory.getLogger("jsonConsoleAppender");
    
	@GetMapping(value = "/boredactivity")
    public ResponseEntity<ActivityModel> callSomeNonAuthAPI() {

		ActivityModel boredActivity = boredService.retrieveActivity();
		
		logger.info("What I did get from BoredAPI:  '{}'", boredActivity.getActivity());
		return new ResponseEntity<>(boredActivity, HttpStatus.OK);			
    }
	
}

