package com.zeatful.springreact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@SpringBootApplication
public class SpringReactApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactApplication.class, args);
	}

	@Bean
	public RouterFunction<ServerResponse> routes(){
		return RouterFunctions.route(
				GET("/"),
				request -> ServerResponse.ok().body(BodyInserters.fromResource(new ClassPathResource("public/index.html")))
		);
	}
}