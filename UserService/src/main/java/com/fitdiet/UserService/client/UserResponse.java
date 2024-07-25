package com.fitdiet.UserService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String userid;
    private String username;
    private int age;
    private String height;
    private String weight;
    private List<Diet> dietList;
}
