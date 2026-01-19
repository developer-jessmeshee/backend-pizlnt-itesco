package com.itesco.pizlntI_itesco.repositories;

import com.itesco.pizlntI_itesco.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {}
