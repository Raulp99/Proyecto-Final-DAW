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

import com.nexo.entities.GruposValorantEntity;
import com.nexo.services.GruposValorantService;

@RestController
@CrossOrigin(origins = "http://localhost:8080", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class GruposValorantController {

	@Autowired
	private GruposValorantService gruposValorantService;

	@GetMapping(value = "/gruposValorant")
	public Iterable<GruposValorantEntity> listarGrupos() {
		return gruposValorantService.listarGrupos();
	}

	@PostMapping("/gruposValorant")
	public ResponseEntity<String> insertarGrupo(@RequestBody GruposValorantEntity grupo) {

		return gruposValorantService.insertarGrupo(grupo);
	}

	@PutMapping(value = "/gruposValorant/{id}")
	public ResponseEntity<String> modificarGrupo(@PathVariable("id") Integer id,
			@RequestBody GruposValorantEntity grupo) {
		return gruposValorantService.modificarGrupo(id, grupo);
	}

}
