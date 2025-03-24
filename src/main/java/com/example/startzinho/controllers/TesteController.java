package com.example.startzinho.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.startzinho.model.Tabela;
import com.example.startzinho.repository.TabelaRepository;

@RestController
@RequestMapping("food")
public class TesteController {

	@Autowired
	private TabelaRepository repository;
	
	@GetMapping
	public List<Tabela> getAll() {
		List<Tabela> tabelaList = repository.findAll();
		return tabelaList;
	}
}
