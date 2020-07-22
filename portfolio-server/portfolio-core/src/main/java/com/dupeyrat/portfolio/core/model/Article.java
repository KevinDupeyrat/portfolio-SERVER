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
@Document(collection = "article")
public class Article {

    @Id
    private String id;

    private String title;
    private String picturePath;
    private String content;
    private String createDate;
    private String updateDate;
    private List<String> source;
}
