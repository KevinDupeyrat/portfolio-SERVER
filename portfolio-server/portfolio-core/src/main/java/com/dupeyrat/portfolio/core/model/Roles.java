package com.dupeyrat.portfolio.core.model;

public enum Roles {

    USER("User"),
    ADMIN("Administrateur");

    private String value;

    Roles(String value) {
        this.value = value;
    }
}
