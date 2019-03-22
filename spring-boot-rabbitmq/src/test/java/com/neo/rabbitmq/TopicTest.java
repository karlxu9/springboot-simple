package com.neo.rabbitmq;

import com.neo.rabbitmq.rabbit.topic.TopicSender;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/22 10:40
 * @since: 1.8.0
 * @version: 1.0.0
 */
public class TopicTest extends RabbitmqApplicationTests {

    @Autowired
    private TopicSender topicSender;

    @Test
    public void sender() {
        // 发送给指定的队列
        // topicSender.sender1();

        // 发送给通配符队列
        topicSender.sender2();

    }

}
