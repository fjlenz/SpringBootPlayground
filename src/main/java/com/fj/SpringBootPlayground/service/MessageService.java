package com.fj.SpringBootPlayground.service;

import java.util.List;
import java.util.Optional;

import com.fj.SpringBootPlayground.entity.Message;

public interface MessageService {

	public abstract Optional<Message> retrieveSingleMessage(int id);

	public abstract List<Message> retrieveAllMessages();
	

}