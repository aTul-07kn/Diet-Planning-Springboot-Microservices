package com.fitdiet.UserService.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Userdto {
    @NotNull(message="user id cannot be null")
    @NotEmpty(message="user id cannot be empty")
    private String userid;

    @NotNull(message="user name cannot be null")
    @NotEmpty(message="user name cannot be empty")
    private String username;

    @Min(value=12, message="age should be greater than 12 years")
    @NotNull(message="age cannot be null")
    private int age;

    @NotNull(message="height cannot be null")
    @NotEmpty(message="height cannot be empty")
    private String height;

    @NotNull(message="weight cannot be null")
    @NotEmpty(message="weight cannot be empty")
    private String weight;
}
