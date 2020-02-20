package com.eventoapp.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = {"com.eventoapp.projeto"})
@ComponentScan(value = {"com.eventoapp.projeto"})
@EnableJpaRepositories(basePackages= "com.eventoapp.repository")
@ComponentScan({"com.eventoapp.controllers"})
@EntityScan(basePackages = {"com.eventoapp.models"})

public class ProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

}
