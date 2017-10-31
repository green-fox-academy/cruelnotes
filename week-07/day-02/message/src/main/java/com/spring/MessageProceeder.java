package com.spring

import com.spring.message.MessageService;*;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {
    @Autowired
    MessageService service;

    public void processMessage(String message, String recipient) {
        service.sendMessage(message, recipient);
    }
}
