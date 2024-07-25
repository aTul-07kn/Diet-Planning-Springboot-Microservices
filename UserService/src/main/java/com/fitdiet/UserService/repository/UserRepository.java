package com.fitdiet.UserService.repository;

import com.fitdiet.UserService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUserid(String userid);
}