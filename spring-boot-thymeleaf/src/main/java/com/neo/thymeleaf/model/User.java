package com.neo.thymeleaf.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/15 15:31
 * @since: 1.8.0
 * @version: 1.0.0
 */

@Data
public class User implements Serializable {

    private String name;
    private int age;
    private String pass;

    public User(String name, int age, String pass) {
        this.name = name;
        this.age = age;
        this.pass = pass;
    }

    public User(String name) {
        this.name = name;
    }
}
