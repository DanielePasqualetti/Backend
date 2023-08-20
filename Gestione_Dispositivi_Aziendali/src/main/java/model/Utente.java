package model;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "Utenti")
public class Utente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cognome;
	@Column(unique = true)
	private String username;
	@Column(unique = true)
	private String email;
	@ManyToMany
	private List<Dispositivo> dispositivo;
	
	public void setDevices(Set<Dispositivo> uDispositivi) {
		// TODO Auto-generated method stub
		
	}

	public void setDispositivi(Set<Dispositivo> uDispositivi) {
		// TODO Auto-generated method stub
		
	}
		
}
