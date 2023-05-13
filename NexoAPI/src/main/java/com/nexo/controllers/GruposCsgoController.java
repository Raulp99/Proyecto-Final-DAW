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

import com.nexo.entities.GruposCsgoEntity;
import com.nexo.repositories.IGruposCsgoRepository;

@RestController
@CrossOrigin(origins = "http://localhost:8080", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class GruposCsgoController {

	@Autowired
	private IGruposCsgoRepository gruposCsgoRepository;

	@GetMapping(value = "/gruposCounterStrike")
	public Iterable<GruposCsgoEntity> listarGrupos() {
		return gruposCsgoRepository.findAll();
	}

	@PostMapping("/gruposCounterStrike")
	public ResponseEntity<String> insertarGrupo(@RequestBody GruposCsgoEntity grupoCsgo) {
		gruposCsgoRepository.save(grupoCsgo);
		return new ResponseEntity<>("Grupo creado con éxito", HttpStatus.OK);
	}

//	@PutMapping(value = "/promociones")
//	public ResponseEntity<String> modificarPromocion(@RequestBody PromocionEntity promocion) {
//		promocionRepository.save(promocion);
//
//		return new ResponseEntity<>("Actualización correcta", HttpStatus.OK);
//
//	}

}
