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

import com.nexo.entities.GruposDota2Entity;
import com.nexo.repositories.IGruposDota2Repository;

@RestController
@CrossOrigin(origins = "http://localhost:8080", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class GruposDota2Controller {

	@Autowired
	private IGruposDota2Repository gruposDota2Repository;

	@GetMapping(value = "/gruposDota2")
	public Iterable<GruposDota2Entity> listarGrupos() {
		return gruposDota2Repository.findAll();
	}

	@PostMapping("/gruposDota2")
	public ResponseEntity<String> insertarGrupo(@RequestBody GruposDota2Entity grupoDota2) {
		gruposDota2Repository.save(grupoDota2);
		return new ResponseEntity<>("Grupo creado con éxito", HttpStatus.OK);
	}
		
}
