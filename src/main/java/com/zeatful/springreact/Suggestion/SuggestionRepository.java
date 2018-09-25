package com.zeatful.springreact.Suggestion;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface SuggestionRepository extends ReactiveMongoRepository<Suggestion, String> {
}