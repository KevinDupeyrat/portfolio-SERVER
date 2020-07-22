package com.dupeyrat.portfolio.core.exception;

public class ApplicationException extends GenericException {

    public ApplicationException(ExceptionMessage exceptionMessage) {
        super(exceptionMessage);
    }
}
