package com.nexo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nexo.entities.GruposOverwatchEntity;
import com.nexo.repositories.IGruposOverwatchRepository;

@RestController
@CrossOrigin(origins = "http://localhost:8080", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class GruposOverwatchController {

	@Autowired
	private IGruposOverwatchRepository gruposOverwatchRepository;

	@GetMapping(value = "/gruposOverwatch")
	public Iterable<GruposOverwatchEntity> listarGrupos() {
		return gruposOverwatchRepository.findAll();
	}

	@PostMapping("/gruposOverwatch")
	public ResponseEntity<String> insertarGrupo(@RequestBody GruposOverwatchEntity grupoOverwatch) {
		gruposOverwatchRepository.save(grupoOverwatch);
		return new ResponseEntity<>("Grupo creado con éxito", HttpStatus.OK);
	}
		
}
