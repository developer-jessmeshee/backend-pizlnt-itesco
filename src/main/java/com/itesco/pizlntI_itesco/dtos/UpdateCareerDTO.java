package com.itesco.pizlntI_itesco.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UpdateCareerDTO {
    @NotBlank( message = "El nombre de la carrera es obligatorio" )
    @Size( min = 5, message = "El nombre de la carrera debe tener al menos 5 caracteres" )
    private String name;

    @NotBlank( message = "El ID del registro es obligatorio" )
    @Pattern(
            regexp = "^[0-9a-fA-F]{24}$",
            message = "El ID del registro no tiene un formato válido de MongoDB"
    )
    private String id;

    @NotBlank( message = "El ID del usuario es obligatorio" )
    @Pattern(
            regexp = "^[0-9a-fA-F]{24}$",
            message = "El ID del usuario no tiene un formato válido de MongoDB"
    )
    private String userId;
}
