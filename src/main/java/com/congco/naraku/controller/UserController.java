package com.congco.naraku.controller;

import com.congco.naraku.entity.User;
import com.congco.naraku.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * created on 2019/3/23 9:09
 *
 * @author qbmzc
 */
@RestController
@RequestMapping("user")
public class UserController {


    private MongoTemplate mongoTemplate;
    private final UserRepository userRepository;

    @Autowired
    public UserController(MongoTemplate mongoTemplate, UserRepository userRepository) {
        this.mongoTemplate = mongoTemplate;
        this.userRepository = userRepository;
    }

    /**
     * 保存一条新的记录
     */
    @PostMapping
    public void save() {
        User user = new User();
        user.setUsername("李四");
        user.setAge(15);
        this.userRepository.save(user);
        System.out.println("ok>>>>>");
    }

    /**
     * 根据用户名查询
     *
     * @param username
     * @return
     */
    @GetMapping
    public User findByUsername(@RequestParam String username) {
        return this.userRepository.findByUsername(username);
    }
}
