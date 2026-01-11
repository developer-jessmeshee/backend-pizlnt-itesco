package com.itesco.pizlntI_itesco.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class BaseDeleteRecord {
    @NotBlank( message = "El ID del registro es obligatorio" )
    @Pattern(
            regexp = "^[0-9a-fA-F]{24}$",
            message = "El ID del registro no tiene un formato válido de MongoDB"
    )
    private String recordId;

    @NotBlank( message = "El ID del usuario es obligatorio" )
    @Pattern(
            regexp = "^[0-9a-fA-F]{24}$",
            message = "El ID del usuario no tiene un formato válido de MongoDB"
    )
    private String userId;
}
