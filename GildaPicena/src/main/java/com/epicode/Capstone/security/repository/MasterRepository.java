package com.epicode.Capstone.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epicode.Capstone.security.entity.Master;

public interface MasterRepository extends JpaRepository<Master, Long> {

	Optional<Master> findByEmail(String email);
	
	Optional<Master> findByUsername(String username);

	Optional<Master> findByUsernameOrEmail(String username, String email);
	
	Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
