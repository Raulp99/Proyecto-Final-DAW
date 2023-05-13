package com.nexo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nexo.entities.GruposRainbow6Entity;
import com.nexo.services.GruposRainbow6Service;

@RestController
@CrossOrigin(origins = "http://localhost:8080", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class GruposRainbow6Controller {

	@Autowired
	private GruposRainbow6Service gruposRainbow6Service;

	@GetMapping(value = "/gruposRainbow6")
	public Iterable<GruposRainbow6Entity> listarGrupos() {
		return gruposRainbow6Service.listarGrupos();
	}

	@PostMapping("/gruposRainbow6")
	public ResponseEntity<String> insertarGrupo(@RequestBody GruposRainbow6Entity grupo) {

		return gruposRainbow6Service.insertarGrupo(grupo);
	}

	@PutMapping(value = "/gruposRainbow6/{id}")
	public ResponseEntity<String> modificarGrupo(@PathVariable("id") Integer id,
			@RequestBody GruposRainbow6Entity grupo) {
		return gruposRainbow6Service.modificarGrupo(id, grupo);
	}

}
