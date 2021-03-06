package com.fj.SpringBootPlayground.service;

import java.util.List;

import com.fj.SpringBootPlayground.model.MessageModel;

public interface MessageService {

	public abstract MessageModel retrieveSingleMessage(int id);

	public abstract MessageModel addSingleMessage(MessageModel messageModel, boolean mapForInsert);

	public abstract MessageModel updateMessage(int id, MessageModel messageModel);

	public abstract MessageModel deleteSingleMessage(int id);

	public abstract List<MessageModel> retrieveAllMessages();
	

}