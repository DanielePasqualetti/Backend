package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import model.Utente;

@Configuration
public class UtenteConfiguration {

	@Bean("newUtente")
	@Scope("prototype")
	public Utente newUtente() {
		return new Utente();
	}
}