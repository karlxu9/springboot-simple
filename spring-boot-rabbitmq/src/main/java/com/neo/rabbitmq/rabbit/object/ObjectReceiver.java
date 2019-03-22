package com.neo.rabbitmq.rabbit.object;

import com.neo.rabbitmq.model.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 模块描述: <br>
 * (对象传递)
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/22 10:18
 * @since: 1.8.0
 * @version: 1.0.0
 */
@RabbitListener(queues = "object")
@Component
public class ObjectReceiver {

    @RabbitHandler
    public void process(User user) {
        System.out.println("Receiver : " + user);
    }

}
