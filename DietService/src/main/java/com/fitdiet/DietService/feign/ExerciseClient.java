package com.fitdiet.DietService.feign;

import com.fitdiet.DietService.client.Exercise;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="exerciseservice", url="http://localhost:9097/exercise")
public interface ExerciseClient {
    @GetMapping("/getExerciseByDiet/{did}")
    List<Exercise> getExerciseByDid(@PathVariable String did);
}