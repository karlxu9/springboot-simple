package com.neo.multi.jpa;

import com.neo.multi.jpa.model.User;
import com.neo.multi.jpa.repository.primary.UserPrimaryRep;
import com.neo.multi.jpa.repository.second.UserSencondRep;
import org.junit.Test;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.Date;

public class UserRepositoryTests extends MultiJpaApplicationTests {
    @Resource
    private UserPrimaryRep userTest1Repository;
    @Resource
    private UserSencondRep userTest2Repository;

    @Test
    public void testSave() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        userTest1Repository.save(new User("aa", "aa123456", "aa@126.com", "aa", formattedDate));
        userTest1Repository.save(new User("bb", "bb123456", "bb@126.com", "bb", formattedDate));
        userTest2Repository.save(new User("cc", "cc123456", "cc@126.com", "cc", formattedDate));
    }


    @Test
    public void testDelete() throws Exception {
        userTest1Repository.deleteAll();
        userTest2Repository.deleteAll();
    }

    @Test
    public void testBaseQuery() {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        User user = new User("ff", "ff123456", "ff@126.com", "ff", formattedDate);
        userTest1Repository.findAll();
        userTest2Repository.findById(3l);
        userTest2Repository.save(user);
        user.setId(2l);
        userTest1Repository.delete(user);
        userTest1Repository.count();
        userTest2Repository.findById(3l);
    }


}