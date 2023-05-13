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

import com.nexo.entities.GruposValorantEntity;
import com.nexo.repositories.IGruposValorantRepository;

@RestController
@CrossOrigin(origins = "http://localhost:8080", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class GruposValorantController {

	@Autowired
	private IGruposValorantRepository gruposValorantRepository;

	@GetMapping(value = "/gruposValorant")
	public Iterable<GruposValorantEntity> listarGrupos() {
		return gruposValorantRepository.findAll();
	}

	@PostMapping("/gruposValorant")
	public ResponseEntity<String> insertarGrupo(@RequestBody GruposValorantEntity grupoValorant) {
		gruposValorantRepository.save(grupoValorant);
		return new ResponseEntity<>("Grupo creado con éxito", HttpStatus.OK);
	}
		
}
