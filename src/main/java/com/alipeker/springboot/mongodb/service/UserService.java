package com.alipeker.springboot.mongodb.service;

import com.alipeker.springboot.mongodb.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(String id);

    User save(User category);

    void delete(String id);

}
