package com.fitdiet.ExerciseService.repository;

import com.fitdiet.ExerciseService.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExerciseRepo extends JpaRepository<Exercise, String> {
    Exercise findByEid(String eid);
    List<Exercise> findByDid(String did);
}