package com.neo.rabbitmq.rabbit.hello;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/22 10:07
 * @since: 1.8.0
 * @version: 1.0.0
 */
@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sender() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        this.amqpTemplate.convertAndSend("hello", context);
    }

}
