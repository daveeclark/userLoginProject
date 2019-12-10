package com.userLoginAuth.controller;


import com.userLoginAuth.model.User;
import com.userLoginAuth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//RestController clarifies that class is a controller
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<?> getAllUsers(){
      Iterable<User> users = userService.getAllUsers();
      return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<?> getUserById(Long userId){
      Optional<User> user = userService.getUserbyId(userId);
      return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<?> createUser(User user){
      return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
    }

    @PutMapping("/users/{userId}")
    public ResponseEntity<?> updateUser(User user, Long userId){
      return new ResponseEntity<>(userService.updateUser(user, userId), HttpStatus.OK);
    }

    @DeleteMapping("/users/{userId}")
    public ResponseEntity<?> deleteUser(Long userId){
      userService.deleteUser(userId);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
