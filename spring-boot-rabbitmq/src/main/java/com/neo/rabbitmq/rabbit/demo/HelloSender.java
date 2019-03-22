package com.neo.rabbitmq.rabbit.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("helloSenderDemo")
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello2", context);
    }


    public void send(Integer num) {
        String context = "hello " + new Date();
        // System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello2", "Send1 Spring boot neo queue" + num);
    }

    public void neoSend(Integer num) {
        this.rabbitTemplate.convertAndSend("hello2", "Send2 Spring boot neo queue" + num);
    }

}