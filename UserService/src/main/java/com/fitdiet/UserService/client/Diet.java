package com.fitdiet.UserService.client;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diet{
    String did;
    String dietPlan;
    String userid;
}