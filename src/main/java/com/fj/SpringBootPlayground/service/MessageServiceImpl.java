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
		
		System.out.println("service: retrieveAllMessages" + messagesRepo.size());
		
	    for (Message m : messagesRepo) {	    	
	    	messagesFound.add(transactionMapper.mapEntityToDto(m));
			System.out.println("loop");
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

