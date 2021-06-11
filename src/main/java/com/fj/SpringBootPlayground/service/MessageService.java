package com.fj.SpringBootPlayground.service;

import java.util.List;
import java.util.Optional;

import com.fj.SpringBootPlayground.entity.Message;
import com.fj.SpringBootPlayground.model.MessageModel;

public interface MessageService {

	public abstract MessageModel retrieveSingleMessage(int id);

	public abstract MessageModel addSingleMessage(MessageModel messageModel, boolean mapForInsert);

	public abstract List<MessageModel> retrieveAllMessages();
	

}