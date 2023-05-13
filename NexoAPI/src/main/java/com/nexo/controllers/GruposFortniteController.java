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

import com.nexo.entities.GruposFortniteEntity;
import com.nexo.services.GruposFortniteService;

@RestController
@CrossOrigin(origins = "http://localhost:8080", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class GruposFortniteController {

	@Autowired
	private GruposFortniteService gruposFortniteService;

	@GetMapping(value = "/gruposFortnite")
	public Iterable<GruposFortniteEntity> listarGrupos() {
		return gruposFortniteService.listarGrupos();
	}

	@PostMapping("/gruposFortnite")
	public ResponseEntity<String> insertarGrupo(@RequestBody GruposFortniteEntity grupo) {

		return gruposFortniteService.insertarGrupo(grupo);
	}

	@PutMapping(value = "/gruposFortnite/{id}")
	public ResponseEntity<String> modificarGrupo(@PathVariable("id") Integer id,
			@RequestBody GruposFortniteEntity grupo) {
		return gruposFortniteService.modificarGrupo(id, grupo);
	}

}
