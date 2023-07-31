package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import model.Prenotazione;

@Configuration
public class PrenotazioneConfiguration {
	
	@Bean("newPrenotazione")
	@Scope("prototype")
	public Prenotazione newPrenotazione() {
		return new Prenotazione();
	}
}
