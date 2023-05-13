package com.nexo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nexo.entities.GruposOverwatchEntity;
import com.nexo.repositories.IGruposOverwatchRepository;

@Service
public class GruposOverwatchService {
	@Autowired
	private IGruposOverwatchRepository gruposOverwatchRepository;

	public Iterable<GruposOverwatchEntity> listarGrupos() {
		return gruposOverwatchRepository.findAll();
	}

	public ResponseEntity<String> insertarGrupo(GruposOverwatchEntity grupo) {
		gruposOverwatchRepository.save(grupo);
		return new ResponseEntity<>("Inserción correcta!", HttpStatus.OK);
	}

	public ResponseEntity<String> modificarGrupo(Integer id, GruposOverwatchEntity grupo) {
		GruposOverwatchEntity grupoActual = gruposOverwatchRepository.findById(id).orElse(null);
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
		gruposOverwatchRepository.save(grupoActual);
		return new ResponseEntity<>("Actualización correcta", HttpStatus.OK);
	}

}
