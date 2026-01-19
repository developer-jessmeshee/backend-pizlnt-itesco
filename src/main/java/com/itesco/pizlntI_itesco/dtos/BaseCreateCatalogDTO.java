package com.itesco.pizlntI_itesco.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class BaseCreateCatalogDTO {
    @NotBlank( message = "El name del registro es obligatorio" )
    @Size( min = 5, message = "El name del registro debe tener al menos 5 caracteres" )
    private String name;

    private Boolean active = true;
}
