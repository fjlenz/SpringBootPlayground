package com.fj.SpringBootPlayground.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.fj.SpringBootPlayground.model.MessageModel;
import com.fj.SpringBootPlayground.service.MessageService;

import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	Logger logger = LoggerFactory.getLogger("jsonConsoleAppender");
 
	@GetMapping(value = "/messages")
    public ResponseEntity<List<MessageModel>> getAllMessages(@RequestParam(required = false, defaultValue = "0") int delaySeconds) {
		
		try {
		    TimeUnit.SECONDS.sleep(delaySeconds); // this is the delay - to view Angular Loading Spinner a little longer
		} catch (InterruptedException ie) {
		    Thread.currentThread().interrupt();
		}
		
		return new ResponseEntity<>(messageService.retrieveAllMessages(), HttpStatus.OK);	
    }
	
	@GetMapping("/message/{id}")
	public ResponseEntity<MessageModel> getMessageById(@PathVariable int id) {

		MessageModel retrievedMessage = messageService.retrieveSingleMessage(id);
		
		if (retrievedMessage == null ) {
			return new ResponseEntity<>(retrievedMessage, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(retrievedMessage, HttpStatus.OK);
		}
	}

	@PostMapping(path = "/message", consumes = "application/json", produces = "application/json")
	public ResponseEntity<MessageModel> addMember(@RequestBody MessageModel messageModel) {
	    // TODO:Validation of JSON
		
		// persist new Message
		MessageModel savedMessage = messageService.addSingleMessage(messageModel, true);
		
		return new ResponseEntity<>(savedMessage, HttpStatus.OK);	
	}
	
	
	@PutMapping("/message/{id}")
	public ResponseEntity<MessageModel> updateMessage(@RequestBody MessageModel messageModel, @PathVariable int id) {
	    
		MessageModel updatedMessage = messageService.updateMessage(id, messageModel);
		
		if (updatedMessage == null ) {
			return new ResponseEntity<>(updatedMessage, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(updatedMessage, HttpStatus.OK);
		}
	
	  }
	
}
