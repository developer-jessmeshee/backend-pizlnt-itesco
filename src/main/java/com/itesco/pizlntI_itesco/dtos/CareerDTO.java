package com.itesco.pizlntI_itesco.dtos;
import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CareerDTO {
    @NotBlank( message = "El nombre de la carrera es obligatorio" )
    @Size( min = 5, message = "El nombre de la carrera debe tener al menos 5 caracteres" )
    private String name;

    private Boolean active = true;
}
