package com.example.startzinho.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.startzinho.model.Tabela;

public interface TabelaRepository extends JpaRepository<Tabela, Long> {

	List<Tabela> findAll();
	
	Optional<Tabela> findById();
	
}
