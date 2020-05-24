package com.neo.redis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/15 13:13
 * @since: 1.8.0
 * @version: 1.0.0
 */
@RestController
public class TokenController {

    @RequestMapping("/token")
    public String token(HttpSession httpSession) {
        UUID token = (UUID) httpSession.getAttribute("token");
        if (token == null) {
            token = UUID.randomUUID();
        }
        httpSession.setAttribute("token", token);
        return httpSession.getId();
    }
}
