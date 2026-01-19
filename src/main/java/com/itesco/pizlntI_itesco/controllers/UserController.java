package com.itesco.pizlntI_itesco.controllers;

import com.itesco.pizlntI_itesco.dtos.UserDTO;
import com.itesco.pizlntI_itesco.models.User;
import com.itesco.pizlntI_itesco.services.UserService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public User saveUser( @RequestBody UserDTO user ) {
        return userService.saveUser( user );
    }
}
