package com.epicode.Spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.Spring.model.Sonda;

@Configuration
public class SondaConfiguration {

	@Bean
	@Scope("prototype")
	public Sonda creaSonda() {
		return new Sonda();
	}
	
}
