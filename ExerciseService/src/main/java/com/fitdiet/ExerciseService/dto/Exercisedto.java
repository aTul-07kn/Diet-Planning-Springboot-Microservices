package com.fitdiet.ExerciseService.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exercisedto {

    @NotNull(message="exercise id cannot be null")
    @NotEmpty(message="exercise id cannot be empty")
    private String eid;

    @NotNull(message="diet id cannot be null")
    @NotEmpty(message="diet id cannot be empty")
    private String did;

    @NotNull(message = "exercise list cannot be null")
    @NotEmpty(message = "exercise list cannot be empty")
    private String exerciseList;
}
