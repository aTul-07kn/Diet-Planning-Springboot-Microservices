package com.fitdiet.ExerciseService.controller;

import com.fitdiet.ExerciseService.client.ExerciseResponse;
import com.fitdiet.ExerciseService.dto.Exercisedto;
import com.fitdiet.ExerciseService.model.Exercise;
import com.fitdiet.ExerciseService.service.ExerciseService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @PostMapping("/addExercise")
    public ResponseEntity<Exercise> addExercise(Exercisedto exercise) {
        return ResponseEntity.ok(exerciseService.addExercise(exercise));
    }

    @GetMapping("/getExercise/{eid}")
    public ResponseEntity<ExerciseResponse> getExercise(@PathVariable String eid){
        return ResponseEntity.ok(exerciseService.getExercise(eid));
    }
    
    @GetMapping("getAllExercises")
    public ResponseEntity<List<Exercise>> getAllExercises() {
        return ResponseEntity.ok(exerciseService.getAllExercises());
    }

    @GetMapping("/getExerciseByDiet/{did}")
    public ResponseEntity<List<Exercise>> getExerciseByDid(@PathVariable String did){
        return ResponseEntity.ok(exerciseService.getExerciseByDid(did));
    }
}