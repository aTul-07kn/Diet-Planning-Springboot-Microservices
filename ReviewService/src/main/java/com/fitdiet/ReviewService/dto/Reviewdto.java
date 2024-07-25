package com.fitdiet.ReviewService.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviewdto {
    public long id;

    @NotNull(message = "Review body cannot be null")
    @NotEmpty(message = "Review body cannot be empty")
    public String rBody;

    @NotNull(message="eid cannot be null")
    @NotEmpty(message="eid cannot be empty")
    public String eid;
}
