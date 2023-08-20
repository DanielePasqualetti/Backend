package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import model.Dispositivo;

@Configuration
public class DispositivoConfiguration {
	
	@Bean("dispositivo")
	@Scope("prototype")
	public Dispositivo creaDispositivo() {
		return new Dispositivo();
	}
	
}
