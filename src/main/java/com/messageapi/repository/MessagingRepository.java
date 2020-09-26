package com.messageapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.messageapi.model.MessageEntity;

public interface MessagingRepository extends JpaRepository<MessageEntity, Integer>{

}
