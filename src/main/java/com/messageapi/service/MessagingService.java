package com.messageapi.service;

import java.util.List;

import com.messageapi.model.MessageEntity;


public interface MessagingService {

	public void saveMessageRequest(MessageEntity message);

	public List<MessageEntity> findAll();
}
