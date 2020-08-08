package com.dupeyrat.portfolio.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    private String name;
    private String description;
    private String detail;
}
