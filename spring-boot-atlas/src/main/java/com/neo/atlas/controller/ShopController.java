/**
 * 模块描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/5/24 18:54
 * @since: 1.8.0
 * @version: 1.0.0
 */
package com.neo.atlas.controller;

import com.neo.atlas.entity.Shop;
import com.neo.atlas.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("shop")
public class ShopController {


    @Autowired
    private ShopService shopService;


    @RequestMapping("list")
    public Object list() {

        List<Shop> list = shopService.list();
        System.out.println(list);
        return list;
    }


    @PostMapping("/save/{name}")
    public Object save(@PathVariable("name") String name) {
        shopService.save(name);
        return "success";
    }


    @GetMapping("test")
    public Object test() throws SQLException {

        shopService.test();
        return null;
    }
}
