package com.alipeker.springboot.mongodb.service.entityservice;

import com.alipeker.springboot.mongodb.entity.Product;
import com.alipeker.springboot.mongodb.entity.User;
import com.alipeker.springboot.mongodb.repository.ProductRepository;
import com.alipeker.springboot.mongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserEntityService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id){

        Optional<User> optional = userRepository.findById(id);

        User product = null;
        if (optional.isPresent()){
            product = optional.get();
        }

        return product;
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public void delete(String id){
        userRepository.deleteById(id);
    }

}
