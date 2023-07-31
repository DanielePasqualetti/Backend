package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import model.Postazione;

@Configuration
public class PostazioneConfiguration {
	
	@Bean("newPostazione")
	@Scope("prototype")
	public Postazione newPostazione() {
		return new Postazione();
	}	
}
