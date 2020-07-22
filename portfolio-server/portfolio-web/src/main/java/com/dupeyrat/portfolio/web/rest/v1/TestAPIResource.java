package com.dupeyrat.portfolio.web.rest.v1;

import com.dupeyrat.portfolio.core.exception.ExceptionMessage;
import com.dupeyrat.portfolio.core.exception.GenericException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
@Slf4j
public class TestAPIResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity testApi() {

        throw new GenericException(ExceptionMessage.INIT_VALUE);
    }

}
