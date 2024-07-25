package com.fitdiet.UserService.controller;

import com.fitdiet.UserService.client.UserResponse;
import com.fitdiet.UserService.dto.Userdto;
import com.fitdiet.UserService.model.User;
import com.fitdiet.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    public ResponseEntity<User> addUser(Userdto user){
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/getuser/{userid}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable String userid){
        return new ResponseEntity<>(userService.getUserById(userid), HttpStatus.OK);
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }
}
