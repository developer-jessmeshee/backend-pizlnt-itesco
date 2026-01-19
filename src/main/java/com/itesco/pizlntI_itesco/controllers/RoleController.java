package com.itesco.pizlntI_itesco.controllers;

import com.itesco.pizlntI_itesco.dtos.BaseCreateCatalogDTO;
import com.itesco.pizlntI_itesco.models.Role;
import com.itesco.pizlntI_itesco.services.RoleService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/api/roles" )
public class RoleController {
    private final RoleService roleService;

    public RoleController( RoleService roleService ) {
        this.roleService = roleService;
    }

    @GetMapping
    public List<Role> getAllRoles() {
        return roleService.findAllRoles();
    }

    @PostMapping
    public Role createRole( @Valid @RequestBody BaseCreateCatalogDTO role ) {
        return roleService.createRole( role );
    }
}
