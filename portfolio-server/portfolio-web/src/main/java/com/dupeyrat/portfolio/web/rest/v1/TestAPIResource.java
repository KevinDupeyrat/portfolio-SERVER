package com.dupeyrat.portfolio.web.rest.v1;

import com.dupeyrat.portfolio.core.exception.ExceptionMessage;
import com.dupeyrat.portfolio.core.exception.GenericException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@Slf4j
public class TestAPIResource {

    @GetMapping()
    public ResponseEntity<String> testGetApi() {
        return ResponseEntity.ok().body("Tu as fait un GET");
    }

    @GetMapping(path = "error")
    public ResponseEntity<String> testGetException() {
        throw new GenericException(ExceptionMessage.INIT_VALUE);
    }

    @PostMapping()
    public ResponseEntity<String> testPostApi() {
        return ResponseEntity.ok().body("Tu as fait un POST");
    }

}
