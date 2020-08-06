package com.dupeyrat.portfolio.core.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Arrays;

@ControllerAdvice
@RestController
@Slf4j
public class UnhandleGeneriqueException<T extends Throwable> extends ResponseEntityExceptionHandler {

    @ExceptionHandler(GenericException.class)
    public final ResponseEntity<ErrorMessage> handleGenericException(GenericException ex, WebRequest request) {
        ErrorMessage errorMessage = ErrorMessage.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .code(ex.getExceptionMessage().getCode())
                .message(ex.getExceptionMessage().getMessage())
                .messageDetail(Arrays.toString(ex.getStackTrace()))
                .build();
        ex.printStackTrace();
        return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorMessage> handleAllException(Exception ex, WebRequest request) {
        ErrorMessage errorMessage = ErrorMessage.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .code(HttpStatus.INTERNAL_SERVER_ERROR.toString())
                .message(ex.getMessage())
                .messageDetail(Arrays.toString(ex.getStackTrace()))
                .build();
        ex.printStackTrace();
        return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
