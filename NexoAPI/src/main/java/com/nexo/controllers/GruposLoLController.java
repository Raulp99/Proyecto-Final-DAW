package com.nexo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
import com.nexo.repositories.IGruposLoLRepository;

@RestController
@CrossOrigin(origins = "http://localhost:8080", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class GruposLoLController {

	@Autowired
	private IGruposLoLRepository gruposLolrepository;

	@GetMapping(value = "/gruposLeagueOfLegends")
	public Iterable<GruposLoLEntity> listarGrupos() {
		return gruposLolrepository.findAll();
	}

	@PostMapping("/gruposLeagueOfLegends")
	public ResponseEntity<String> insertarGrupo(@RequestBody GruposLoLEntity grupo) {
		gruposLolrepository.save(grupo);
		return new ResponseEntity<>("Inserción correcta!", HttpStatus.OK);
	}

	@PutMapping(value = "/gruposLeagueOfLegends/{id}")
	public ResponseEntity<String> modificarGrupo(@PathVariable("id") Integer id, @RequestBody GruposLoLEntity grupo) {
		GruposLoLEntity grupoActual = gruposLolrepository.findById(id).orElse(null);
		if (grupoActual == null) {
			return new ResponseEntity<>("El grupo no existe", HttpStatus.NOT_FOUND);
		}
		grupoActual.setJugador1(grupo.getJugador1());
		grupoActual.setJugador2(grupo.getJugador2());
		grupoActual.setJugador3(grupo.getJugador3());
		grupoActual.setJugador4(grupo.getJugador4());
		grupoActual.setDiscordJugador1(grupo.getDiscordJugador1());
		grupoActual.setDiscordJugador2(grupo.getDiscordJugador2());
		grupoActual.setDiscordJugador3(grupo.getDiscordJugador3());
		grupoActual.setDiscordJugador4(grupo.getDiscordJugador4());
		gruposLolrepository.save(grupoActual);
		return new ResponseEntity<>("Actualización correcta", HttpStatus.OK);
	}

}
