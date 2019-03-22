package com.neo.scheduler.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/22 14:50
 * @since: 1.8.0
 * @version: 1.0.0
 */
@Component
public class Scheduler2Task {

    private static final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    // 上一次开始执行时间点之后6秒再执行
    @Scheduled(fixedDelay = 6000)
    // 上一次执行【完毕】时间点之后6秒再执行
    // @Scheduled(fixedDelay = 6000)
    // 第一次延迟1秒后执行，之后按 fixedRate 的规则每6秒执行一次
    // @Scheduled(initialDelay=1000, fixedRate=6000)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + format.format(new Date()));
    }

}
