package com.samyak.encryption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableJpaRepositories("com.samyak.repository")
@EntityScan("com.samyak.entity")
@ComponentScan("com.samyak.*")
@EnableWebMvc
@AutoConfiguration
@Configuration
@SpringBootApplication
public class DataEncryptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataEncryptionApplication.class, args);
	}

}
