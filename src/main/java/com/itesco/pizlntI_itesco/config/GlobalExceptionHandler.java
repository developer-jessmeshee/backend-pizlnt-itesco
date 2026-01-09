package com.itesco.pizlntI_itesco.config;

import com.itesco.pizlntI_itesco.dtos.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler( MethodArgumentNotValidException.class )
    public ResponseEntity<ErrorResponse> handleValidationExceptions(
            MethodArgumentNotValidException ex
    ) {
        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getFieldErrors().forEach( error ->
                errors.put( error.getField(), error.getDefaultMessage() )
        );

        ErrorResponse response = ErrorResponse.builder()
                .status( HttpStatus.BAD_REQUEST.value() )
                .code( "VALIDATION_ERROR" )
                .message( "Se encontraron errores en los datos enviados" )
                .errors( errors )
                .build();

        return ResponseEntity.badRequest().body( response );
    }
}
