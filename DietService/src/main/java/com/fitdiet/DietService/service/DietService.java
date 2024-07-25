package com.fitdiet.DietService.service;

import com.fitdiet.DietService.client.DietResponse;
import com.fitdiet.DietService.client.Exercise;
import com.fitdiet.DietService.client.Review;
import com.fitdiet.DietService.dto.Dietdto;
import com.fitdiet.DietService.feign.ExerciseClient;
import com.fitdiet.DietService.feign.ReviewClient;
import com.fitdiet.DietService.model.Diet;
import com.fitdiet.DietService.repository.DietRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DietService {

    @Autowired
    private DietRepository repo;

    @Autowired
    private ReviewClient reviewClient;

    @Autowired
    private ExerciseClient exerciseClient;

    public Diet addDiet(Dietdto diet) {
        Diet d=Diet.builder()
                .did(diet.getDid())
                .dietPlan(diet.getDietPlan())
                .userid(diet.getUserid())
                .build();
        return repo.save(d);
    }

    public DietResponse getDietById(String did) {
        Diet d=repo.findByDid(did);
        List<Exercise> exerciseList=exerciseClient.getExerciseByDid(did);
        List<List<Review>> reviewListByExercise=new ArrayList<>();
        for(Exercise exe : exerciseList){
            reviewListByExercise.add(reviewClient.getReviewsByEid(exe.getEid()));
        }

        DietResponse dr=new DietResponse();
        dr.setDid(did);
        dr.setDietPlan(d.getDietPlan());
        dr.setExerciseList(exerciseList);
        dr.setReviewList(reviewListByExercise);
        return dr;
    }

    public List<Diet> getAllDiets() {
        return repo.findAll();
    }

    public List<Diet> getDietsByUserid(String userid) {
        return repo.findByUserid(userid);
    }
}
