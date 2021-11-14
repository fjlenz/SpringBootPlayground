package com.fj.SpringBootPlayground.service;

import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fj.SpringBootPlayground.entity.Message;
import com.fj.SpringBootPlayground.mapper.MessageMapper;
import com.fj.SpringBootPlayground.model.MessageModel;

@Service
public class MessageServiceImpl implements MessageService{

	private static List<Message> messagesRepo = new ArrayList<>(){{
		add(new Message(1, "Message number 1"));
		add(new Message(2, "Message number 2"));
		add(new Message(9, "Message number 9"));
		add(new Message(10, "Message number 10"));
		add(new Message(11, "Message number 11"));
		add(new Message(34, "Message number 34"));
		add(new Message(56, "Message number 56"));
	}};
	
	private MessageMapper transactionMapper = new MessageMapper(); 
	
	/*
	@Override
	public Message findSingleMessagebyText(String transasearchTerm) {
		// TODO Auto-generated method stub
		return null;
	}*/


	@Override
	public List<MessageModel> retrieveAllMessages() {
		List<MessageModel> messagesFound  = new ArrayList<MessageModel>();
		
		System.out.println("Service: retrieveAllMessages: " + messagesRepo.size());
		
	    for (Message m : messagesRepo) {	    	
	    	messagesFound.add(transactionMapper.mapEntityToDto(m));
	    }
	    
		return messagesFound;
	}


	@Override
	public MessageModel retrieveSingleMessage(int id) {
		//Optional<Message> foundMessage = messagesRepo. .foundMessage ..;
	
		/*
		if (foundMessage.isPresent()) {
			return transactionMapper.mapEntityToDto(foundMessage.get());
		} else {
			return null;
		}	
		*/
		return null;
	}
	

	@Override
	public MessageModel addSingleMessage(MessageModel messageModel, boolean mapForInsert) {

		Message messageForPersist = transactionMapper.mapDtoToEntity(messageModel, mapForInsert);
		messagesRepo.add(messageForPersist);

		return transactionMapper.mapEntityToDto(messageForPersist);
	}

}

