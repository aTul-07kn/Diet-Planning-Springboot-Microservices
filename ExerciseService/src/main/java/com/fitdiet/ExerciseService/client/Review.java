package com.fitdiet.ExerciseService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    public long id;
    public String rBody;
    public String eid;
}