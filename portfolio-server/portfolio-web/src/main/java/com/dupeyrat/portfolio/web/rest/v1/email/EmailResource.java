package com.dupeyrat.portfolio.web.rest.v1.email;

import com.dupeyrat.portfolio.core.service.impl.EmailService;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("email")
@Slf4j
public class EmailResource {

    @Autowired
    private Gson gson;

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<String> postEmail(@RequestBody String payload) {
        JsonObject jsonObject = gson.fromJson(payload, JsonObject.class);
        emailService.sendEmail(jsonObject);
        return ResponseEntity.ok().body("Envoie de mail réussi !");
    }
}
