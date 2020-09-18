package com.dupeyrat.portfolio.core.service.technical.impl;

import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.annotation.PostConstruct;
import java.util.EnumSet;

public enum MailContentBuilder {


    SENDING {

        private TemplateEngine templateEngine;

        private Context context (JsonObject payload) {
            Context context = new Context();
            context.setVariable("message", payload.get("message").getAsString());
            context.setVariable("name", payload.get("name").getAsString());
            context.setVariable("email", payload.get("email").getAsString());


            return context;
        }

        @Override
        public String build (JsonObject payload) {
            return templateEngine.process("mailTemplate", context(payload));
        }

        @Override
        public void setTemplateEngine(TemplateEngine templateEngine) {
            this.templateEngine = templateEngine;
        }
    },

    RESPONSE {

        private TemplateEngine templateEngine;

        private Context context (JsonObject payload) {
            Context context = new Context();
            context.setVariable("message", payload.get("message").getAsString());
            context.setVariable("name", payload.get("name").getAsString());

            return context;
        }

        @Override
        public String build (JsonObject payload) {
            return templateEngine.process("mailResponseTemplate", context(payload));
        }

        @Override
        public void setTemplateEngine(TemplateEngine templateEngine) {
            this.templateEngine = templateEngine;
        }
    };


    public abstract String build(JsonObject payload);

    public abstract void setTemplateEngine(TemplateEngine templateEngine);


    @Component
    public static class ReportTypeServiceInjector {
        @Autowired
        private TemplateEngine templateEngine;

        @PostConstruct
        public void postConstruct() {
            for (MailContentBuilder rt : EnumSet.allOf(MailContentBuilder.class))
                rt.setTemplateEngine(templateEngine);
        }
    }
}
