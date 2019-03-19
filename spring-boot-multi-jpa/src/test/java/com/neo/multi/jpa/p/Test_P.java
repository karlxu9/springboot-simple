package com.neo.multi.jpa.p;

import com.neo.multi.jpa.MultiJpaApplicationTests;
import com.neo.multi.jpa.model.User;
import com.neo.multi.jpa.repository.primary.UserPrimaryRep;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

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
    private UserPrimaryRep userPrimaryRep;

    @Test
    public void save() {
        User user = new User();
        user.setEmail("1213@163.com");
        user.setNickName("xxxx");
        user.setUserName("xyb");
        user.setPassWord("123245");
        user.setRegTime(LocalDate.now().toString());
        userPrimaryRep.save(user);
    }

}
