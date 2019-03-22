package com.neo.rabbitmq;

import com.neo.rabbitmq.rabbit.object.ObjectSender;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/22 10:21
 * @since: 1.8.0
 * @version: 1.0.0
 */
@Component
public class ObjectTest extends RabbitmqApplicationTests {
    @Autowired
    private ObjectSender objectSender;

    @Test
    public void sender() {
        objectSender.sender();
    }
}
