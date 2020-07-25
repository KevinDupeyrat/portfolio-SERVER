package com.dupeyrat.portfolio.web.rest.v1;

import com.dupeyrat.portfolio.core.exception.ExceptionMessage;
import com.dupeyrat.portfolio.core.exception.GenericException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class TestAPIResource {

    @GetMapping(path = "test")
    public ResponseEntity testApi() {

        throw new GenericException(ExceptionMessage.INIT_VALUE);
    }

}
