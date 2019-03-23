package com.congco.naraku.service;

import com.congco.naraku.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * created on 2019/3/22 20:07
 *
 * @author qbmzc
 */
@Repository
public interface UserRepository extends MongoRepository<User,String> {
    /**
     * 根据username查询
     * @param username
     * @return
     */
    User findByUsername(String username);
}
