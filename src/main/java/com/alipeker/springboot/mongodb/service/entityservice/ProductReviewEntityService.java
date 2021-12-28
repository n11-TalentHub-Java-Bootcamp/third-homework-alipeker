package com.alipeker.springboot.mongodb.service.entityservice;

import com.alipeker.springboot.mongodb.entity.ProductReview;
import com.alipeker.springboot.mongodb.repository.ProductReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductReviewEntityService {
    @Autowired
    private ProductReviewRepository productReviewRepository;

    public List<ProductReview> findAll(){
        return productReviewRepository.findAll();
    }

    public ProductReview findById(String id){

        Optional<ProductReview> optional = productReviewRepository.findById(id);

        ProductReview product = null;
        if (optional.isPresent()){
            product = optional.get();
        }

        return product;
    }

    public ProductReview save(ProductReview user){
        return productReviewRepository.save(user);
    }

    public void delete(String id){
        productReviewRepository.deleteById(id);
    }

}