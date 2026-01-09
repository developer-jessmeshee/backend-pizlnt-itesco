package com.itesco.pizlntI_itesco.dtos;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class ErrorResponse {
    private int status;
    private String code;
    private String message;
    private Map<String, String> errors;
}
