package com.fitdiet.DietService.controller;

import com.fitdiet.DietService.client.DietResponse;
import com.fitdiet.DietService.dto.Dietdto;
import com.fitdiet.DietService.model.Diet;
import com.fitdiet.DietService.service.DietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diet")
public class DietController {

    @Autowired
    private DietService dietService;

    @PostMapping("/addDiet")
    public ResponseEntity<Diet> addDiet(Dietdto diet){
        return new ResponseEntity<>(dietService.addDiet(diet), HttpStatus.CREATED);
    }

    @GetMapping("/getdiet/{did}")
    public ResponseEntity<DietResponse> getDietById(@PathVariable String did){
        return new ResponseEntity<>(dietService.getDietById(did), HttpStatus.OK);
    }

    @GetMapping("/getAllDiets")
    public ResponseEntity<List<Diet>> getAllDiets(){
        return new ResponseEntity<>(dietService.getAllDiets(), HttpStatus.OK);
    }

    @GetMapping("/getDietsByUserid/{userid}")
    public ResponseEntity<List<Diet>> getDietsByUserid(@PathVariable String userid){
        return new ResponseEntity<>(dietService.getDietsByUserid(userid), HttpStatus.OK);
    }
}