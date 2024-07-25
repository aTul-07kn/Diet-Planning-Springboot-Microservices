package com.fitdiet.UserService.feign;

import com.fitdiet.UserService.client.Diet;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="dietservice", url="http://localhost:9098/diet")
public interface DietClient {
    @GetMapping("/getDietsByUserid/{userid}")
    List<Diet> getDietsByUserid(@PathVariable String userid);
}