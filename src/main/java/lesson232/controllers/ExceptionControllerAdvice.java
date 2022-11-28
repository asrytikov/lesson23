package lesson232.controllers;

import lesson232.NotEnoughMoneyException;
import lesson232.models.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler(){
    ErrorDetails errorDetails = new ErrorDetails();
            errorDetails.setMessage("Not money in your count");
            return ResponseEntity.badRequest().body(errorDetails);
    }
}
