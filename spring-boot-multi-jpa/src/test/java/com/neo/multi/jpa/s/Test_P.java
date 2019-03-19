package com.neo.multi.jpa.s;

import com.neo.multi.jpa.MultiJpaApplicationTests;
import com.neo.multi.jpa.model.User;
import com.neo.multi.jpa.repository.primary.UserPrimaryRep;
import com.neo.multi.jpa.repository.second.UserSencondRep;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/19 16:35
 * @since: 1.8.0
 * @version: 1.0.0
 */

public class Test_P extends MultiJpaApplicationTests {

    @Autowired
    private UserSencondRep userSencondRep;

    @Test
    public void save() {
        User user = new User();
        user.setEmail("1213@163.com");
        user.setNickName("xxxx");
        user.setUserName("xyb");
        user.setPassWord("123245");
        user.setRegTime(LocalDate.now().toString());
        userSencondRep.save(user);
    }

}
