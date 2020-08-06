package com.dupeyrat.portfolio.core.exception;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class ErrorMessage {

    private int status;

    private String code;

    private String message;

    private String messageDetail;
}
