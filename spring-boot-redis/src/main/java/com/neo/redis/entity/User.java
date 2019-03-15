package com.neo.redis.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/15 12:59
 * @since: 1.8.0
 * @version: 1.0.0
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String userName;
    private String password;
    private String email;
    private String nickname;
    private String regTime;

    public User() {
        super();
    }
    public User(String email, String nickname, String password, String userName, String regTime) {
        super();
        this.email = email;
        this.nickname = nickname;
        this.password = password;
        this.userName = userName;
        this.regTime = regTime;
    }

}
