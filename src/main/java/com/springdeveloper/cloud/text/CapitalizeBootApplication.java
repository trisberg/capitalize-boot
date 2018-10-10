package com.springdeveloper.cloud.text;

import java.util.function.Function;

import org.apache.commons.text.WordUtils;
import reactor.core.publisher.Flux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CapitalizeBootApplication {

	@Bean
	public Function<Flux<String>, Flux<String>> capitalize() {
		return in -> in.map(s -> WordUtils.capitalizeFully(s));
	}

	public static void main(String[] args) {
		SpringApplication.run(CapitalizeBootApplication.class, args);
	}
}
