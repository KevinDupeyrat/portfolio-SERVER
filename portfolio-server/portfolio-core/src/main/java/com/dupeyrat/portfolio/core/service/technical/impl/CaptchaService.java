package com.dupeyrat.portfolio.core.service.technical.impl;

import com.dupeyrat.portfolio.core.config.ApplicationProrties;
import com.dupeyrat.portfolio.core.service.technical.contract.ICaptchaService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

@Service
@AllArgsConstructor
public class CaptchaService implements ICaptchaService {

    private final Gson gson;

    private final ApplicationProrties applicationProrties;

    @Override
    public boolean isCaptchaValid(String response) {
        final String url = "https://www.google.com/recaptcha/api/siteverify?"
                + "secret=" + applicationProrties.getCaptcha().getPrivateKey()
                + "&response=" + response;

        try (InputStream res = new URL(url).openStream();
             BufferedReader rd = new BufferedReader(new InputStreamReader(res, Charset.forName("UTF-8")))) {

            StringBuilder sb = new StringBuilder();
            int cp;
            while ((cp = rd.read()) != -1) {
                sb.append((char) cp);
            }
            String jsonText = sb.toString();

            JsonObject json = gson.fromJson(jsonText, JsonObject.class);
            return json.get("success").getAsBoolean();
        } catch (Exception e) {
            return false;
        }
    }
}
