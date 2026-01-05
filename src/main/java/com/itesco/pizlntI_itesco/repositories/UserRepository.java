package com.itesco.pizlntI_itesco.repositories;

import com.itesco.pizlntI_itesco.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/*
* Esta clase contiene los métodos comunes para interactuar con la colección
* de usuarios en MongoDB
*/
@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
