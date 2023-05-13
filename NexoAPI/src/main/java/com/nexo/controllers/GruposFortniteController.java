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

import com.nexo.entities.GruposFortniteEntity;
import com.nexo.repositories.IGruposFortniteRepository;

@RestController
@CrossOrigin(origins = "http://localhost:8080", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class GruposFortniteController {

	@Autowired
	private IGruposFortniteRepository gruposFortniteRepository;

	@GetMapping(value = "/gruposFortnite")
	public Iterable<GruposFortniteEntity> listarGrupos() {
		return gruposFortniteRepository.findAll();
	}

	@PostMapping("/gruposFortnite")
	public ResponseEntity<String> insertarGrupo(@RequestBody GruposFortniteEntity grupoFortnite) {
		gruposFortniteRepository.save(grupoFortnite);
		return new ResponseEntity<>("Grupo creado con éxito", HttpStatus.OK);
	}
		
}
