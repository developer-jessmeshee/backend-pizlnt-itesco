package com.itesco.pizlntI_itesco.services;

import com.itesco.pizlntI_itesco.models.User;
import com.itesco.pizlntI_itesco.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    /*
        De esta forma se realiza la inyección de dependencias que es la forma
        recomendada actualmente.
    */

    public UserService( UserRepository userRepository ) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUser() {
        return userRepository.findAll();
    }
}
