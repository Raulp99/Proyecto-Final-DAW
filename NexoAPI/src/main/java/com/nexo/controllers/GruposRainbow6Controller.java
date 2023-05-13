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

import com.nexo.entities.GruposRainbow6Entity;
import com.nexo.repositories.IGruposRainbow6Repository;

@RestController
@CrossOrigin(origins = "http://localhost:8080", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class GruposRainbow6Controller {

	@Autowired
	private IGruposRainbow6Repository gruposRainbow6Repository;

	@GetMapping(value = "/gruposRainbow6")
	public Iterable<GruposRainbow6Entity> listarGrupos() {
		return gruposRainbow6Repository.findAll();
	}

	@PostMapping("/gruposRainbow6")
	public ResponseEntity<String> insertarGrupo(@RequestBody GruposRainbow6Entity grupoRainbow6) {
		gruposRainbow6Repository.save(grupoRainbow6);
		return new ResponseEntity<>("Grupo creado con éxito", HttpStatus.OK);
	}
		
}
