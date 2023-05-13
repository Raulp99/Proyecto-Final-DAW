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

import com.nexo.entities.GruposCsgoEntity;
import com.nexo.services.GruposCsgoService;

@RestController
@CrossOrigin(origins = "http://localhost:8080", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class GruposCsgoController {

	@Autowired
	private GruposCsgoService gruposCsgoService;

	@GetMapping(value = "/gruposCounterStrike")
	public Iterable<GruposCsgoEntity> listarGrupos() {
		return gruposCsgoService.listarGrupos();
	}

	@PostMapping("/gruposCounterStrike")
	public ResponseEntity<String> insertarGrupo(@RequestBody GruposCsgoEntity grupoCsgo) {
		return gruposCsgoService.insertarGrupo(grupoCsgo);
	}

	@PutMapping(value = "/gruposCounterStrike/{id}")
	public ResponseEntity<String> modificarGrupo(@PathVariable("id") Integer id, @RequestBody GruposCsgoEntity grupo) {
		return gruposCsgoService.modificarGrupo(id, grupo);
	}
}
