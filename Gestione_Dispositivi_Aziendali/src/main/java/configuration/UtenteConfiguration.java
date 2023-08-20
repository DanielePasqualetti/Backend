package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import model.Utente;

@Configuration
public class UtenteConfiguration {
	
	@Bean("utente")
	@Scope("prototype")
	public Utente creaUtente() {
		return new Utente();
	}

}
