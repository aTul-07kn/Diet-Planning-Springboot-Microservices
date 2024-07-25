package com.fitdiet.DietService.repository;

import com.fitdiet.DietService.model.Diet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DietRepository extends JpaRepository<Diet, String> {
    List<Diet> findByUserid(String userid);

    Diet findByDid(String did);
}
