package com.neo.rabbitmq.rabbit.hello;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/22 10:06
 * @since: 1.8.0
 * @version: 1.0.0
 */
@RabbitListener(queues = "hello")
@Component
public class HelloReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver :" + hello);
    }

}
