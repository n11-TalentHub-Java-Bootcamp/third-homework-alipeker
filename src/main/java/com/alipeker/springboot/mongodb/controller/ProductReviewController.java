package com.alipeker.springboot.mongodb.controller;

import com.alipeker.springboot.mongodb.entity.ProductReview;
import com.alipeker.springboot.mongodb.service.ProductReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productReview/")
public class ProductReviewController {

    @Autowired
    private ProductReviewService productReviewService;

    @GetMapping("")
    public List<ProductReview> findAll() {
        return productReviewService.findAll();
    }

    @GetMapping("/{id}")
    public ProductReview findById(@PathVariable String id) {
        return productReviewService.findById(id);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody ProductReview productReview) {
        return new ResponseEntity<>(productReviewService.save(productReview), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        productReviewService.delete(id);
    }

}
