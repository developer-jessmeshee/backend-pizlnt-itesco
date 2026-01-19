package com.itesco.pizlntI_itesco.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class UserDTO {
    @NotBlank(message = "El nombre es obligatorio")
    private String name;

    @NotBlank(message = "El primer apellido es obligatorio")
    private String firstSurname;

    private String secondSurname;

    @Email(message = "El formato del email es inválido")
    @NotBlank(message = "El email es obligatorio")
    private String email;

    @NotBlank(message = "El ID de la carrera es obligatorio")
    @Pattern(regexp = "^[0-9a-fA-F]{24}$", message = "ID de carrera inválido")
    private String careerId;
}
