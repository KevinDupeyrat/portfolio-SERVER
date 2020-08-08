package com.dupeyrat.portfolio.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "experience")
public class Experience {

    @Id
    private String id;

    private String company;
    private String situation;
    private String startDate;
    private String endDate;
    private boolean currently;
    private List<Project> project;
}
