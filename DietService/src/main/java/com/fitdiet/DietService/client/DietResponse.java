package com.fitdiet.DietService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DietResponse {
    private String did;
    private String dietPlan;
    private List<Exercise> exerciseList;
    private List<List<Review>> reviewList;
}