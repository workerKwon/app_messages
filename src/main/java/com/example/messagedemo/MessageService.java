package com.example.messagedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

    @Autowired
    private MessageRepository repository;

    public Message save(String text) {
        return repository.saveMessage(new Message(text));
    }
}