package com.fitdiet.ReviewService.service;

import com.fitdiet.ReviewService.dto.Reviewdto;
import com.fitdiet.ReviewService.model.Review;
import com.fitdiet.ReviewService.repository.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepo reviewRepo;
    public Review addReview(Reviewdto reviewdto) {
        Review rev = Review.builder()
                .id(reviewdto.getId())
                .rBody(reviewdto.getRBody())
                .eid(reviewdto.getEid())
                .build();
        return reviewRepo.save(rev);
    }

    public List<Review> getAllReviews() {
        return reviewRepo.findAll();
    }

    public Review getReview(long id) {
        return reviewRepo.findById(id).orElse(null);
    }

    public List<Review> getReviewsByEid(String eid) {
        return reviewRepo.findByEid(eid);
    }
}
