package com.company.company.controller;

import com.company.company.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
