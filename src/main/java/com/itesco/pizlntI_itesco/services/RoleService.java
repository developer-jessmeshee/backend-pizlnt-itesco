package com.itesco.pizlntI_itesco.services;

import com.itesco.pizlntI_itesco.dtos.BaseCreateCatalogDTO;
import com.itesco.pizlntI_itesco.models.Role;
import com.itesco.pizlntI_itesco.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    private final RoleRepository repository;

    public RoleService( RoleRepository repository ) {
        this.repository = repository;
    }

    public Role createRole( BaseCreateCatalogDTO role ) {
        Role newRole = new Role();

        newRole.setName( role.getName() );

        return repository.save( newRole );
    }

    public List<Role> findAllRoles() {
        return repository.findAll();
    }
}
