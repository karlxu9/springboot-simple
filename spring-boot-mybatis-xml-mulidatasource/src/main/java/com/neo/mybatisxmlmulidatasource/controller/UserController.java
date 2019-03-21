package com.neo.mybatisxmlmulidatasource.controller;

import com.neo.mybatisxmlmulidatasource.mapper.test1.User1Mapper;
import com.neo.mybatisxmlmulidatasource.mapper.test2.User2Mapper;
import com.neo.mybatisxmlmulidatasource.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/21 16:32
 * @since: 1.8.0
 * @version: 1.0.0
 */
@RestController
public class UserController {


    @Autowired
    private User1Mapper user1Mapper;

    @Autowired
    private User2Mapper user2Mapper;


    @GetMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users = user1Mapper.getAll();
        return users;
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Long id) {
        User one = user2Mapper.getOne(id);
        return one;
    }

    @RequestMapping("/add")
    public void save(User user) {
        user2Mapper.insert(user);
    }

    @RequestMapping(value="update")
    public void update(User user) {
        user2Mapper.update(user);
    }

    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        user1Mapper.delete(id);
    }
}
