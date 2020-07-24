package com.company.company.rest;

import com.company.company.controller.EmployeeRepository;
import com.company.company.controller.EmployeeService;
import com.company.company.controller.MessageRepository;
import com.company.company.controller.MessageService;
import com.company.company.model.Employee;
import com.company.company.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class MessageEndpoint {

    @Autowired
    MessageService ms;

    @Autowired
    MessageRepository mr;

    @Autowired
    EmployeeRepository er;

    @Autowired
    EmployeeService es;


    @PostMapping("/new/all")
    public Message addMessageToAll(@RequestBody Message message) {
        Message theMessage = ms.addMessage(message);
        for (Employee employee : er.findAll()) {
            es.addMessageToEmployee(employee, theMessage);
        }
        return theMessage;
    }
}
