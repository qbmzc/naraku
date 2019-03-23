package com.congco.naraku.user;

import com.congco.naraku.base.BaseTest;
import com.congco.naraku.entity.User;
import com.congco.naraku.service.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * created on 2019/3/23 13:50
 *
 * @author qbmzc
 */
public class UserTests extends BaseTest {


    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSave(){
        User user = new User().setUsername("李四").setAge(17);
        this.userRepository.save(user);
        System.out.println("OK");
    }
}
