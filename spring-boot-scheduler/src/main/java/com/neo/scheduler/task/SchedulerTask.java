package com.neo.scheduler.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 模块描述: <br>
 * (定时任务)
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/22 14:49
 * @since: 1.8.0
 * @version: 1.0.0
 */
@Component
public class SchedulerTask {

    private int count = 0;

    @Scheduled(cron = "*/6 * * * * ?")
    public void process() {
        System.out.println("this is scheduler task runing  " + (count++));
    }


}
