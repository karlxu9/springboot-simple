package com.neo.rabbitmq;

import com.neo.rabbitmq.rabbit.fanout.FanoutSender;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 模块描述: <br>
 * (广播模式)
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/22 11:20
 * @since: 1.8.0
 * @version: 1.0.0
 */
public class FanoutTest extends RabbitmqApplicationTests {

    @Autowired
    private FanoutSender fanoutSender;

    @Test
    public void Sender() {
        fanoutSender.sender();
    }

}
