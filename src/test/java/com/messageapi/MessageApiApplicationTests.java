package com.messageapi;

import com.messageapi.controller.MessagingController;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;

@SpringBootTest
class MessageApiApplicationTests {
	@Autowired
	private MessagingController messagingController;

	@Test
	void contextLoads() {
		Assert.assertTrue(messagingController!=null);
	}

}
