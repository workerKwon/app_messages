package com.example.messagedemo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class MessageService {

    Logger logger = LoggerFactory.getLogger(MessageService.class);

    @Autowired
    private MessageRepository repository;

    @Transactional(readOnly = true)
    public List<Message> getMessages() {
        return repository.getMessages();
    }

    @SecurityCheck
    @Transactional
    public Message save(String text) {
        return repository.saveMessage(new Message(text));
    }

    // private void updateStatistics() {
    //     throw new UnsupportedOperationException("This method is not implemented yet");
    // }
}
