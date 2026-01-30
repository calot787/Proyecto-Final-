package com.letrana.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.letrana.exception.ConflictoException;
import com.letrana.exception.RecursoNoEncontradoException;
import com.letrana.exception.ValidacionException;

@RestControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(RecursoNoEncontradoException.class)
    public ResponseEntity<String> noEncontrado(RecursoNoEncontradoException ex){
    return ResponseEntity
    .status(HttpStatus.NOT_FOUND)
    .body(ex.getMessage());
 }
 @ExceptionHandler(ConflictoException.class)
 public ResponseEntity<String> noEncontrado(ConflictoException ex){
    return ResponseEntity
    .status(HttpStatus.CONFLICT)
    .body(ex.getMessage());
 }

  @ExceptionHandler(ValidacionException.class)
 public ResponseEntity<String> noEncontrado(ValidacionException ex){
    return ResponseEntity
    .status(HttpStatus.BAD_REQUEST)
    .body(ex.getMessage());
 }

 @ExceptionHandler(Exception.class)
public ResponseEntity<String> manejarError(Exception ex) {
 return ResponseEntity
 .status(HttpStatus.INTERNAL_SERVER_ERROR)
 .body("Error interno del servidor");
}

}

