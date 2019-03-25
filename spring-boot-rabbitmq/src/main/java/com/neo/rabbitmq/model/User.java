package com.neo.rabbitmq.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 模块描述: <br>
 * (用户)
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/22 10:02
 * @since: 1.8.0
 * @version: 1.0.0
 */
@Data
public class User implements Serializable {

    private String name;

    private String pass;

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
