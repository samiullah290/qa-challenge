package com.messageapi.util;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.messageapi.model.MessageEntity;
import com.messageapi.service.MessagingService;


@Component
public class MessageUtil {

	@Autowired
	private MessagingService messagingService;

	@Scheduled(fixedRate = 60000)
	public void messageDeliveryScheduler() {
		Logger logger = LoggerFactory.getLogger("Logger");
		List<MessageEntity> entities = messagingService.findAll();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
		LocalDateTime now = LocalDateTime.now();
		entities.forEach((value) -> {
			if (!StringUtils.isEmpty(value.getDeliveryTime()) && dtf.format(now).equals(value.getDeliveryTime())) {
				System.out.println("Message " + value.getMessage());
				Instant instant = Instant.now();
				Timestamp timestamp = Timestamp.from(instant);
				value.setDeliveredTime(timestamp);
				messagingService.saveMessageRequest(value);
				System.out.println("Message :"+value.getMessage()+" is Message Delivered at Time: " + timestamp);
				logger.info("Message :"+value.getMessage()+" is Message Delivered at Time: " + timestamp);
			}
		});
	}
}
