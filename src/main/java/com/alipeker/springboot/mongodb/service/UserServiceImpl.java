package com.alipeker.springboot.mongodb.service;

import com.alipeker.springboot.mongodb.entity.User;
import com.alipeker.springboot.mongodb.service.entityservice.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityService userEntityService;

    public List<User> findAll() {
        return userEntityService.findAll();
    }

    public User findById(String id) {
        return userEntityService.findById(id);
    }

    public User save(User category) {
        return userEntityService.save(category);
    }

    public void delete(String id) {
        userEntityService.delete(id);
    }

}
