package com.itesco.pizlntI_itesco.services;

import com.itesco.pizlntI_itesco.dtos.UserDTO;
import com.itesco.pizlntI_itesco.models.Career;
import com.itesco.pizlntI_itesco.models.User;
import com.itesco.pizlntI_itesco.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final CareerService careerService;

    /*
        De esta forma se realiza la inyección de dependencias que es la forma
        recomendada actualmente.
    */

    public UserService( UserRepository userRepository, CareerService careerService ) {
        this.userRepository = userRepository;
        this.careerService = careerService;
    }

    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    public User saveUser( UserDTO user ) {
        Career career = careerService.findCareerById( user.getCareerId() );
        User newUser = new User();

        newUser.setName(user.getName());
        newUser.setFirstSurname(user.getFirstSurname());
        newUser.setSecondSurname(user.getSecondSurname());
        newUser.setEmail(user.getEmail());
        newUser.setCareerId( career );

        return userRepository.save( newUser );
    }
}
