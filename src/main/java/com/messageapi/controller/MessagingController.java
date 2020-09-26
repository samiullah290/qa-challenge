package com.messageapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.messageapi.model.MessageEntity;
import com.messageapi.service.MessagingService;


@RestController
public class MessagingController {
	
	@Autowired
	private MessagingService messagingService;
	
	@PostMapping("/addMessage")
	public ResponseEntity<?> saveMessageRequest(@RequestBody MessageEntity message) {
		if(!StringUtils.isEmpty(message.getMessage()) && !StringUtils.isEmpty(message.getDeliveryTime())) {
			messagingService.saveMessageRequest(message);
			return new ResponseEntity<String>("Successful!", HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<String>("Please Provide Proper Input", HttpStatus.BAD_REQUEST);
		}
	}

}
