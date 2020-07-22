package com.dupeyrat.portfolio.core.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public enum ExceptionMessage {

    INIT_VALUE("Exemple de code d'erreur : 001", "Exemple de message d'erreur.");

    @Getter
    @Setter
    private String code;

    @Getter
    @Setter
    private String message;

    public ExceptionMessage formatErrorMessage(String... args) {
        ExceptionMessage exceptionMessage = ExceptionMessage.INIT_VALUE;
        exceptionMessage.setCode(this.code);
        exceptionMessage.setMessage(String.format(this.message, args));

        return exceptionMessage;
    }
}
