package com.epicode.Capstone.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epicode.Capstone.security.entity.EStatoTavolo;
import com.epicode.Capstone.security.entity.ETipoGioco;
import com.epicode.Capstone.security.entity.Master;
import com.epicode.Capstone.security.entity.Tavolo;

public interface TavoloRepository extends JpaRepository<Tavolo, Long> {
	
	Tavolo getById(Long id);
	
	Tavolo getByMaster(Master m);
	
	List<Tavolo> findByStato(EStatoTavolo stato);
	
	List<Tavolo> findByGioco(ETipoGioco gioco);
	
}
