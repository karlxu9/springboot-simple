package com.neo.rabbitmq.rabbit.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/22 10:38
 * @since: 1.8.0
 * @version: 1.0.0
 */
@Component
public class TopicSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sender1() {
        amqpTemplate.convertAndSend("topicExchange", "topic.message", "topic.message");
    }

    public void sender2() {
        this.amqpTemplate.convertAndSend("topicExchange", "topic.messages", "topic.##");
    }


}
