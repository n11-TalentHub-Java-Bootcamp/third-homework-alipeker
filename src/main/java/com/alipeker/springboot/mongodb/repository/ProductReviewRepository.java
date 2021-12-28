package com.alipeker.springboot.mongodb.repository;

import com.alipeker.springboot.mongodb.entity.ProductReview;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReviewRepository extends MongoRepository<ProductReview, String> {
}
