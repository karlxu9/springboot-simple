package com.neo.multi.jpa.repository.primary;

import com.neo.multi.jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/19 16:30
 * @since: 1.8.0
 * @version: 1.0.0
 */
@Repository
public interface UserPrimaryRep extends JpaRepository<User, Long> {

    User findByUserName(String userName);

    User findById(long id);

    User findByUserNameOrEmail(String username, String email);

}
