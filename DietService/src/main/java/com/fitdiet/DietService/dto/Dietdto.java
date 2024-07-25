package com.fitdiet.DietService.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dietdto {
    @NotNull(message = "diet id cannot be null")
    @NotEmpty(message="diet id cannot be empty")
    String did;

    @NotNull(message = "diet plan cannot be null")
    @NotEmpty(message="diet plan cannot be empty")
    String dietPlan;

    @NotNull(message = "user id cannot be null")
    @NotEmpty(message="user id cannot be empty")
    String userid;
}
