package com.fitdiet.ReviewService.controller;

import com.fitdiet.ReviewService.dto.Reviewdto;
import com.fitdiet.ReviewService.model.Review;
import com.fitdiet.ReviewService.service.ReviewService;
import jakarta.validation.Valid;
import org.apache.hc.client5.http.ssl.HttpsSupport;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/addreview")
    public ResponseEntity<Review> addReview(@RequestBody @Valid Reviewdto reviewdto) {
        return ResponseEntity.ok(reviewService.addReview(reviewdto));
    }

    @GetMapping("/getreviews")
    public ResponseEntity<List<Review>> getAllReviews(){
        return ResponseEntity.ok(reviewService.getAllReviews());
    }

    @GetMapping("/getreviews/{id}")
    public ResponseEntity<Review> getReview(@PathVariable long id){
        return ResponseEntity.ok(reviewService.getReview(id));
    }

    @GetMapping("/getreviewsByExercise/{eid}")
    public ResponseEntity<List<Review>> getReviewsByEid(@PathVariable String eid){
        return ResponseEntity.ok(reviewService.getReviewsByEid(eid));
    }
}