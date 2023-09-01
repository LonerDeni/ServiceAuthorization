package com.example.serviceauthorization.exceptions;

import com.example.serviceauthorization.errors.InvalidCredentials;
import com.example.serviceauthorization.errors.UnauthorizedUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAuth {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> credentialsHandler(InvalidCredentials e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> authHandler(UnauthorizedUser e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
