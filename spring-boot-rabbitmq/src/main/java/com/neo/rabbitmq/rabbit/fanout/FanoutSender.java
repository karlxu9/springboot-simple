package com.neo.rabbitmq.rabbit.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/22 11:18
 * @since: 1.8.0
 * @version: 1.0.0
 */
@Component
public class FanoutSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sender() {
        String context = "hi, fanout msg ";
        System.out.println("Sender : " + context);
        this.amqpTemplate.convertAndSend("fanoutExchange", "", context);
    }

}
