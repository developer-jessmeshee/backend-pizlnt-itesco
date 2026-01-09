package com.itesco.pizlntI_itesco.repositories;

import com.itesco.pizlntI_itesco.models.Career;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CareerRepository extends MongoRepository<Career, String> {}
