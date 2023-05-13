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

import com.nexo.entities.GruposApexEntity;
import com.nexo.repositories.IGruposApexRepository;

@RestController
@CrossOrigin(origins = "http://localhost:8080", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class GruposApexController {

	@Autowired
	private IGruposApexRepository gruposApexRepository;

	@GetMapping(value = "/gruposApex")
	public Iterable<GruposApexEntity> listarGrupos() {
		return gruposApexRepository.findAll();
	}

	@PostMapping("/gruposApex")
	public ResponseEntity<String> insertarGrupo(@RequestBody GruposApexEntity grupoApex) {
		gruposApexRepository.save(grupoApex);
		return new ResponseEntity<>("Grupo creado con éxito", HttpStatus.OK);
	}

}
