package com.company.company.controller;

import com.company.company.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MessageService {

    @Autowired
    MessageRepository mr;

    public Message addMessage(Message message) {
        System.out.println("Added message to database");
        return mr.save(message);
    }
}
