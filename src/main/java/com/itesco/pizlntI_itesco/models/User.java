package com.itesco.pizlntI_itesco.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

// Esto genera getters y setters automaticamente si se utiliza lombok
@Data
@Document( collection = "users" ) // Nombre de la colección en MongoDB
public class User {
    @Id
    private String id;
    private String name;
    private String firstSurname;
    private String secondSurname;
    private String email;
    private Boolean active = true;
    @DocumentReference
    private Career careerId;
}
