package com.messageapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messageapi.model.MessageEntity;
import com.messageapi.repository.MessagingRepository;
import com.messageapi.service.MessagingService;


@Service
public class MessagingServiceImpl implements MessagingService {

	@Autowired
	private MessagingRepository messagingRepository;

	@Override
	public void saveMessageRequest(MessageEntity message) {
		messagingRepository.save(message);
	}

	@Override
	public List<MessageEntity> findAll() {
		return messagingRepository.findAll();
	}
}
