package com.alipeker.springboot.mongodb.service;

import com.alipeker.springboot.mongodb.entity.ProductReview;
import com.alipeker.springboot.mongodb.entity.User;

import java.util.List;

public interface ProductReviewService {

    List<ProductReview> findAll();

    ProductReview findById(String id);

    ProductReview save(ProductReview category);

    void delete(String id);

}
