package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import model.Edificio;

@Configuration
public class EdificioConfiguration {
	
	@Bean("newEdificio")
	@Scope("prototype")
	public Edificio newEdificio() {
		return new Edificio();
	}
}
