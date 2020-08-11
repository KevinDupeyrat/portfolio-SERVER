package com.dupeyrat.portfolio.web.rest.v1.technical;

import com.dupeyrat.portfolio.core.config.ApplicationProrties;
import com.dupeyrat.portfolio.core.service.technical.contract.ICaptchaService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/technical/captcha")
@Slf4j
public class CaptchaResource {

    @Autowired
    private ICaptchaService captchaService;

    @PostMapping
    public ResponseEntity<?> validateReCaptha(@RequestBody Map<String, String> captchaMap) {
        if (!captchaService.isCaptchaValid( captchaMap.get("captcha"))) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.noContent().build();
    }

}
