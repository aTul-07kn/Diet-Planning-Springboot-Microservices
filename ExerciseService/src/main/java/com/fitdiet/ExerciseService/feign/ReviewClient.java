package com.fitdiet.ExerciseService.feign;

import com.fitdiet.ExerciseService.client.Review;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


//    @FeignClient(name = "ProductService", url = "http://localhost:9098/product")
//    public interface ProductClient {
//
//        @GetMapping("company/{mcode}")
//        List<Product> findProductsByMcode(@PathVariable("mcode") Long mcode);
//    }
    @FeignClient(name="reviewservice", url="http://localhost:9096/review")
    public interface ReviewClient {
        @GetMapping("/getreviewsByExercise/{eid}")
        List<Review> getReviewsByEid(@PathVariable String eid);
    }