package com.fj.SpringBootPlayground.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.fj.SpringBootPlayground.entity.Message;
import com.fj.SpringBootPlayground.service.MessageService;

import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	Logger logger = LoggerFactory.getLogger("jsonConsoleAppender");
 
	@GetMapping("/message/{id}")
	public ResponseEntity<Optional<Message>> getEmployeesById(@PathVariable int id) {

		Optional<Message> retrievedMessage = messageService.retrieveSingleMessage(id);
		
		if (retrievedMessage.isPresent()) {
			return new ResponseEntity<>(retrievedMessage, HttpStatus.OK);	
		} else {
			return new ResponseEntity<>(retrievedMessage, HttpStatus.NO_CONTENT);	
		}
	}
	
	@GetMapping(value = "/messages")
    public ResponseEntity<List<Message>> getAllMessages() {
		
		return new ResponseEntity<>(messageService.retrieveAllMessages(), HttpStatus.OK);	
    }
	
	
}
