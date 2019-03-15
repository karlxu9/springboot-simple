package com.neo.redis.controller;

import com.neo.redis.entity.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/15 13:08
 * @since: 1.8.0
 * @version: 1.0.0
 */
@RestController
public class UserController {


    @RequestMapping("/getUser")
    @Cacheable(value = "user-key")
    public User getUser() {
        User user = new User("asa@163.com", "aa", "as234234", "123", "12");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }

}
