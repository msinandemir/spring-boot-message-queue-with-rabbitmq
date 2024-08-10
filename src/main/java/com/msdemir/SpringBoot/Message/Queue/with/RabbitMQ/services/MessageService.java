package com.msdemir.SpringBoot.Message.Queue.with.RabbitMQ.services;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final DirectExchange exchange;
    private final AmqpTemplate rabbitTemplate;

    public void sayHello() {
        rabbitTemplate.convertAndSend(exchange.getName(), "routingKey", "Hello!");
    }

    @RabbitListener(queues = "queue")
    public void sayHelloListener(String message) {
        System.out.println("Received message:" + message);
    }
}
