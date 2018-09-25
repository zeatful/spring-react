package com.zeatful.springreact.Suggestion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class SuggestionController {
    private final SuggestionRepository suggestionRepository;

    Logger logger = LoggerFactory.getLogger(SuggestionController.class);

    public SuggestionController(SuggestionRepository suggestionRepository) {
        this.suggestionRepository = suggestionRepository;
    }

    @CrossOrigin
    @GetMapping(value = "suggestions", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Suggestion> getSuggestions() {
        return suggestionRepository.findAll();
    }
}
