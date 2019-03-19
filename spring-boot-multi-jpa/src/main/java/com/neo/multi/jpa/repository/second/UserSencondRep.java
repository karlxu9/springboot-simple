package com.neo.multi.jpa.repository.second;

import com.neo.multi.jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 接口: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/19 16:34
 * @since: 1.8.0
 * @version: 1.0.0
 */
public interface UserSencondRep extends JpaRepository<User, Long> {

    User findByUserName(String userName);

    User findById(long id);

    User findByUserNameOrEmail(String username, String email);

}
