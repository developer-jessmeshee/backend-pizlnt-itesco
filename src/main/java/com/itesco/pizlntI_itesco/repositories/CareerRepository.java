package com.itesco.pizlntI_itesco.repositories;

import com.itesco.pizlntI_itesco.models.Career;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CareerRepository extends MongoRepository<Career, String> {
    /*
    * A esto se le llama Query Method, esto es casi magico ya que simplemente definiendo
    * el nombre del metodo y los parametros, Spring Data MongoDB genera automaticamente
    * la consulta correspondiente a la base de datos MongoDB.
    * */
    List<Career> findByActiveTrue();
}