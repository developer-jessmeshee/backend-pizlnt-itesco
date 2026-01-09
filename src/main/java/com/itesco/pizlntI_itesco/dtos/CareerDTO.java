package com.itesco.pizlntI_itesco.dtos;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class CareerDTO {
    @NotBlank( message = "El nombre de la carrera es obligatorio" )
    @Min( value = 5, message = "El nombre de la carrera debe tener al menos 10 caracteres" )
    private String name;

    private Boolean active = true;
}
