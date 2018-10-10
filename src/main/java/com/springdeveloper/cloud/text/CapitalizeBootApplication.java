package com.springdeveloper.cloud.text;

import java.util.function.Function;

import org.apache.commons.text.WordUtils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CapitalizeBootApplication {

	@Bean
	public Function<String, String> capitalize() {
		return s -> WordUtils.capitalizeFully(s);
	}

	public static void main(String[] args) {
		SpringApplication.run(CapitalizeBootApplication.class, args);
	}
}
