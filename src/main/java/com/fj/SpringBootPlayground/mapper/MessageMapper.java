package com.fj.SpringBootPlayground.mapper;

import com.fj.SpringBootPlayground.entity.Message;
import com.fj.SpringBootPlayground.model.MessageModel;

public class MessageMapper {

	public Message mapDtoToEntity (MessageModel messageModel, boolean mapForInsert) {

		Message mappedMessageEntity = new Message();
		if (!mapForInsert) {
			mappedMessageEntity.setId(messageModel.getId());	
		}
		mappedMessageEntity.setText(messageModel.getMessage());
				
		return mappedMessageEntity;
	}
	
	public MessageModel mapEntityToDto (Message foundMessage) {
		
		MessageModel mappedMessageDto = new MessageModel();
		mappedMessageDto.setId(foundMessage.getId());
		mappedMessageDto.setMessage(foundMessage.getText());
		
		return mappedMessageDto;
	}

}