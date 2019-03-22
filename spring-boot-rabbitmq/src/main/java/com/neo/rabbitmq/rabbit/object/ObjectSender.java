package com.neo.rabbitmq.rabbit.object;

import com.neo.rabbitmq.model.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 模块描述: <br>
 * (对象传递)
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/22 10:19
 * @since: 1.8.0
 * @version: 1.0.0
 */

@Component
public class ObjectSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sender() {
        User user = new User();
        user.setName("xub");
        user.setPass("123");
        this.amqpTemplate.convertAndSend("object", user);
    }

}
