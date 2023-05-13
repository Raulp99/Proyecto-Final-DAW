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

import com.nexo.entities.GruposOverwatchEntity;
import com.nexo.services.GruposOverwatchService;

@RestController
@CrossOrigin(origins = "http://localhost:8080", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class GruposOverwatchController {

	@Autowired
	private GruposOverwatchService gruposOverwatchService;

	@GetMapping(value = "/gruposOverwatch")
	public Iterable<GruposOverwatchEntity> listarGrupos() {
		return gruposOverwatchService.listarGrupos();
	}

	@PostMapping("/gruposOverwatch")
	public ResponseEntity<String> insertarGrupo(@RequestBody GruposOverwatchEntity grupoOverwatch) {
		return gruposOverwatchService.insertarGrupo(grupoOverwatch);
	}
	
	@PutMapping(value = "/gruposOverwatch/{id}")
	public ResponseEntity<String> modificarGrupo(@PathVariable("id") Integer id, @RequestBody GruposOverwatchEntity grupo) {
		return gruposOverwatchService.modificarGrupo(id, grupo);
	}

}
