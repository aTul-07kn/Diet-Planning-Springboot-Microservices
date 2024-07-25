package com.fitdiet.ExerciseService.service;

import com.fitdiet.ExerciseService.client.ExerciseResponse;
import com.fitdiet.ExerciseService.client.Review;
import com.fitdiet.ExerciseService.dto.Exercisedto;
import com.fitdiet.ExerciseService.feign.ReviewClient;
import com.fitdiet.ExerciseService.model.Exercise;
import com.fitdiet.ExerciseService.repository.ExerciseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepo exerciseRepo;

    @Autowired
    private ReviewClient reviewClient;

    public Exercise addExercise(Exercisedto exercise) {
        Exercise exe=Exercise.builder()
                .eid(exercise.getEid())
                .did(exercise.getDid())
                .exerciseList(exercise.getExerciseList())
                .build();
        return exerciseRepo.save(exe);
    }

    public ExerciseResponse getExercise(String eid) {
        Exercise exe= exerciseRepo.findByEid(eid);
        List<Review> reviewList= reviewClient.getReviewsByEid(eid);
        ExerciseResponse response=new ExerciseResponse();

        response.setEid(exe.getEid());
        response.setExerciseList(exe.getExerciseList());
        response.setReviewList(reviewList);

        return response;
    }

    public List<Exercise> getAllExercises() {
        return exerciseRepo.findAll();
    }

    public List<Exercise> getExerciseByDid(String did) {
        return exerciseRepo.findByDid(did);
    }
}