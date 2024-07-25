package com.fitdiet.DietService.feign;

import com.fitdiet.DietService.client.Review;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="reviewservice", url="http://localhost:9096/review")
public interface ReviewClient {
    @GetMapping("/getreviewsByExercise/{eid}")
    List<Review> getReviewsByEid(@PathVariable String eid);
}