package com.fj.SpringBootPlayground.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fj.SpringBootPlayground.entity.Message;
import com.fj.SpringBootPlayground.repository.MessageRepository;


@Service
public class MessageServiceImpl implements MessageService{

	@Autowired
    private MessageRepository messageRepository;
/*
	@Override
	public Message findSingleMessagebyText(String transasearchTerm) {
		// TODO Auto-generated method stub
		return null;
	}*/


	@Override
	public List<Message> retrieveAllMessages() {
		// TODO Auto-generated method stub
		
	    List<Message> messagesFound = new ArrayList<Message>();
	    
	    for (Message m : messageRepository.findAll()) {
	    	//TODO: Create Mapper class that maps Entity to DTO
	    	messagesFound.add(m);
	    }
	    
		return messagesFound;
	}


	@Override
	public Optional<Message> retrieveSingleMessage(int id) {
		// TODO Auto-generated method stub
		return messageRepository.findById(id);
	}

}

