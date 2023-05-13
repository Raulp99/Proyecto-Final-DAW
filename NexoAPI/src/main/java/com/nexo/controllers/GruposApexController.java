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

import com.nexo.entities.GruposApexEntity;
import com.nexo.services.GruposApexService;

@RestController
@CrossOrigin(origins = "http://localhost:8080", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class GruposApexController {

	@Autowired
	private GruposApexService gruposApexService;

	@GetMapping(value = "/gruposApex")
	public Iterable<GruposApexEntity> listarGrupos() {
		return gruposApexService.listarGrupos();
	}

	@PostMapping("/gruposApex")
	public ResponseEntity<String> insertarGrupo(@RequestBody GruposApexEntity grupo) {
		return gruposApexService.insertarGrupo(grupo);
	}
	
	@PutMapping(value = "/gruposApex/{id}")
	public ResponseEntity<String> modificarGrupo(@PathVariable("id") Integer id, @RequestBody GruposApexEntity grupo) {
		return gruposApexService.modificarGrupo(id, grupo);
	}
}
