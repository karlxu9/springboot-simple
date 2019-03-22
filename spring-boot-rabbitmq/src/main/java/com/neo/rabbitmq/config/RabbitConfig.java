package com.neo.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Mr. xyb
 * @Desc 普通模式一对多 多对多发送消息
 * @Date 2019/3/22 11:27
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue Queue() {
        return new Queue("hello2");
    }


    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }

    @Bean
    public Queue neoQueue() {
        return new Queue("neo");
    }

    @Bean
    public Queue objectQueue() {
        return new Queue("object");
    }

}