package com.userLoginAuth.controller;


import com.userLoginAuth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
//RestController clarifies that class is a controller
@RestController
public class UserController {

    @Autowired
    private UserService userService;


}
