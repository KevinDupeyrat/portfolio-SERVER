package com.dupeyrat.portfolio.core.exception;

import lombok.Data;

@Data
public class GenericException extends RuntimeException {

    private final ExceptionMessage exceptionMessage;

    public GenericException(ExceptionMessage exceptionMessage) {
        super(exceptionMessage.getMessage());
        this.exceptionMessage = exceptionMessage;
    }
}
