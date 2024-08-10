package com.msdemir.SpringBoot.Message.Queue.with.RabbitMQ.controllers;

import com.msdemir.SpringBoot.Message.Queue.with.RabbitMQ.services.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("messages")
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;

    @GetMapping
    public void sayHello() {
        messageService.sayHello();
    }
}
