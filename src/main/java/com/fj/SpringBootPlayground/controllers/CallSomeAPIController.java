package com.fj.SpringBootPlayground.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.fj.SpringBootPlayground.model.ActivityModel;
import com.fj.SpringBootPlayground.service.BoredAPIService;
import com.fj.SpringBootPlayground.service.MessageService;

import reactor.core.publisher.Mono;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CallSomeAPIController {
	
	@Autowired
	private BoredAPIService boredService;
	
	Logger logger = LoggerFactory.getLogger("jsonConsoleAppender");
    
	@GetMapping(value = "/call")
    public ResponseEntity<ActivityModel> callSomeNonAuthAPI(@RequestParam String name) {

		ActivityModel boredActivity = boredService.retrieveActivity();
		
		logger.info("what I did get from BoredAPI:  '{}'", boredActivity);
		return new ResponseEntity<>(boredActivity, HttpStatus.OK);			
    }
	
}
