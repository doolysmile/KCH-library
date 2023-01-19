package com.setting.kch.utility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UtilityApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilityApplication.class, args);
	}

}
