package com.neo.jap.controller;

import com.neo.jap.model.UserDetail;
import com.neo.jap.param.UserDetailParam;
import com.neo.jap.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/19 14:59
 * @since: 1.8.0
 * @version: 1.0.0
 */
@RestController
public class UserController {

    @Autowired
    private UserDetailService userDetailService;

    @RequestMapping(name = "/userDetail")
    public String userDetail() {
        UserDetailParam param = new UserDetailParam();
        param.setIntroduction("程序员");
        param.setMinAge(10);
        param.setMaxAge(30);
        int page = 0, size = 10;
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<UserDetail> byCondition = userDetailService.findByCondition(param, pageable);
        List<UserDetail> content = byCondition.getContent();
        for (UserDetail userDetail : content) {
            System.out.println(userDetail.toString());
        }
        return "ok";
    }

}
