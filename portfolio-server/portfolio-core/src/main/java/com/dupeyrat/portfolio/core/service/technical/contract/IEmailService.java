package com.dupeyrat.portfolio.core.service.technical.contract;

import com.google.gson.JsonObject;

public interface IEmailService {

    public void sendEmail(JsonObject payload);
}
