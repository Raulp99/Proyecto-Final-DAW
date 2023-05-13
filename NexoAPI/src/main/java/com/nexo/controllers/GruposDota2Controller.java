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

import com.nexo.entities.GruposDota2Entity;
import com.nexo.services.GruposDota2Service;

@RestController
@CrossOrigin(origins = "http://localhost:8080", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class GruposDota2Controller {

	@Autowired
	private GruposDota2Service gruposDota2Service;

	@GetMapping(value = "/gruposDota2")
	public Iterable<GruposDota2Entity> listarGrupos() {
		return gruposDota2Service.listarGrupos();
	}

	@PostMapping("/gruposDota2")
	public ResponseEntity<String> insertarGrupo(@RequestBody GruposDota2Entity grupoDota2) {
		return gruposDota2Service.insertarGrupo(grupoDota2);
	}

	@PutMapping(value = "/gruposDota2/{id}")
	public ResponseEntity<String> modificarGrupo(@PathVariable("id") Integer id, @RequestBody GruposDota2Entity grupo) {
		return gruposDota2Service.modificarGrupo(id, grupo);
	}

}
