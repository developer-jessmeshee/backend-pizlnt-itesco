package com.itesco.pizlntI_itesco.services;

import com.itesco.pizlntI_itesco.dtos.UserDTO;
import com.itesco.pizlntI_itesco.models.Career;
import com.itesco.pizlntI_itesco.models.Role;
import com.itesco.pizlntI_itesco.models.User;
import com.itesco.pizlntI_itesco.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final CareerService careerService;
    private final PasswordEncoder passwordEncoder;
    private final RoleService roleService;

    /*
        De esta forma se realiza la inyección de dependencias que es la forma
        recomendada actualmente.
    */

    public UserService(
            UserRepository userRepository,
            CareerService careerService,
            PasswordEncoder passwordEncoder,
            RoleService roleService
    ) {
        this.userRepository = userRepository;
        this.careerService = careerService;
        this.passwordEncoder = passwordEncoder;
        this.roleService = roleService;
    }

    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    public User saveUser( UserDTO user ) {
        Career career = careerService.findCareerById( user.getCareerId() );
        Role role = roleService.findRoleById( user.getRoleId() );
        User newUser = new User();
        String encodedPassword = passwordEncoder.encode( user.getPassword() );

        newUser.setName(user.getName());
        newUser.setFirstSurname(user.getFirstSurname());
        newUser.setSecondSurname(user.getSecondSurname());
        newUser.setEmail(user.getEmail());
        newUser.setPassword( encodedPassword );
        newUser.setCareerId( career );
        newUser.setRoleId( role );

        return userRepository.save( newUser );
    }
}
