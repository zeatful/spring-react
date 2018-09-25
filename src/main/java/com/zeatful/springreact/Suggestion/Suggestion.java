package com.zeatful.springreact.Suggestion;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "suggestions")
public class Suggestion {
    private String id;
    private String suggestion;
    private String test;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}