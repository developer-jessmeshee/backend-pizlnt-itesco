package com.itesco.pizlntI_itesco.controllers;

import com.itesco.pizlntI_itesco.models.User;
import com.itesco.pizlntI_itesco.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/api/users" )
public class UserController {
    private final UserService userService;

    public UserController( UserService userService ) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> findAllUsers() {
        return userService.findAllUser();
    }
}
