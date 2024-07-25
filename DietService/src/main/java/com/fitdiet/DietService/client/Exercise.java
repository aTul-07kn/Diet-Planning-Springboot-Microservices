package com.fitdiet.DietService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exercise {
    private String eid;
    private String did;
    private String exerciseList;
}