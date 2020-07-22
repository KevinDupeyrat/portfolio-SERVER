package com.dupeyrat.portfolio.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "article")
public class User {

    @Id
    private String id;

    private boolean company;
    private String lastName;
    private String firstName;
    private String companyName;
    private String email;
    private String password;
}
