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

import com.nexo.entities.GruposLoLEntity;
import com.nexo.services.GruposLoLService;

@RestController
@CrossOrigin(origins = "http://localhost:8080", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class GruposLoLController {

	@Autowired
	private GruposLoLService gruposLolservice;

	@GetMapping(value = "/gruposLeagueOfLegends")
	public Iterable<GruposLoLEntity> listarGrupos() {
		return gruposLolservice.listarGrupos();
	}

	@PostMapping("/gruposLeagueOfLegends")
	public ResponseEntity<String> insertarGrupo(@RequestBody GruposLoLEntity grupo) {
		return gruposLolservice.insertarGrupo(grupo);
	}

	@PutMapping(value = "/gruposLeagueOfLegends/{id}")
	public ResponseEntity<String> modificarGrupo(@PathVariable("id") Integer id, @RequestBody GruposLoLEntity grupo) {
		return gruposLolservice.modificarGrupo(id, grupo);
	}

}
