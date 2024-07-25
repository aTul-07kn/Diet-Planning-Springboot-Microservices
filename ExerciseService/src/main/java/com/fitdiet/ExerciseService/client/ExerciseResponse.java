package com.fitdiet.ExerciseService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseResponse {
    private String eid;
    private String exerciseList;
    private List<Review> reviewList;
}
