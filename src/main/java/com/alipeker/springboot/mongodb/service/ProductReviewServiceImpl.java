package com.alipeker.springboot.mongodb.service;

import com.alipeker.springboot.mongodb.entity.ProductReview;
import com.alipeker.springboot.mongodb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductReviewServiceImpl implements ProductReviewService {

    @Autowired
    private ProductReviewService productReviewService;

    public List<ProductReview> findAll() {
        return productReviewService.findAll();
    }

    public ProductReview findById(String id) {
        return productReviewService.findById(id);
    }

    public ProductReview save(ProductReview productReview) {
        return productReviewService.save(productReview);
    }

    public void delete(String id) {
        productReviewService.delete(id);
    }

}
