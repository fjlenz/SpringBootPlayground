package com.fj.SpringBootPlayground.controllers;

import org.springframework.web.bind.annotation.RestController;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloWorldController {

	Logger logger = LoggerFactory.getLogger("jsonConsoleAppender");

	@GetMapping(value = "/hello")
    public ResponseEntity<String> hello(@RequestParam String name) {

		String validatedName = "";
		if (name.isEmpty()){
			logger.info("Missing Parameter");
			return new ResponseEntity<>(validatedName, HttpStatus.BAD_REQUEST);			
		}else{
			validatedName = "Hallo " + name + " :=)";
			logger.info("This is the response: '{}'", name);
			return new ResponseEntity<>(validatedName, HttpStatus.OK);			
		}
    }    
}
