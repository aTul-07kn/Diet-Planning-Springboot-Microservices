package com.fitdiet.ReviewService.repository;
import java.util.List;
import com.fitdiet.ReviewService.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<Review, Long> {
    List<Review> findByEid(String eId);
}
