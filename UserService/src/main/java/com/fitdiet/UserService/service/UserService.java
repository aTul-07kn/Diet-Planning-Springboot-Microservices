package com.fitdiet.UserService.service;

import com.fitdiet.UserService.client.Diet;
import com.fitdiet.UserService.client.UserResponse;
import com.fitdiet.UserService.dto.Userdto;
import com.fitdiet.UserService.feign.DietClient;
import com.fitdiet.UserService.model.User;
import com.fitdiet.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    @Autowired
    private DietClient client;

    public User addUser(Userdto user) {
        User u=User.builder()
                .userid(user.getUserid())
                .username(user.getUsername())
                .age(user.getAge())
                .height(user.getHeight())
                .weight(user.getWeight())
                .build();
        return repo.save(u);
    }

    public UserResponse getUserById(String userid) {
        User u=repo.findByUserid(userid);
        List<Diet> dietList=client.getDietsByUserid(userid);
        UserResponse res=new UserResponse();
        res.setUserid(u.getUserid());
        res.setUsername(u.getUsername());
        res.setAge(u.getAge());
        res.setHeight(u.getHeight());
        res.setWeight(u.getWeight());
        res.setDietList(dietList);

        return res;
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
