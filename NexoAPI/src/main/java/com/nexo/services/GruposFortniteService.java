package com.nexo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nexo.entities.GruposFortniteEntity;
import com.nexo.repositories.IGruposFortniteRepository;

@Service
public class GruposFortniteService {
	@Autowired
	private IGruposFortniteRepository gruposFortniteRepository;

	public Iterable<GruposFortniteEntity> listarGrupos() {
		return gruposFortniteRepository.findAll();
	}

	public ResponseEntity<String> insertarGrupo(GruposFortniteEntity grupo) {
		gruposFortniteRepository.save(grupo);
		return new ResponseEntity<>("Inserción correcta!", HttpStatus.OK);
	}

	public ResponseEntity<String> modificarGrupo(Integer id, GruposFortniteEntity grupo) {
		GruposFortniteEntity grupoActual = gruposFortniteRepository.findById(id).orElse(null);
		if (grupoActual == null) {
			return new ResponseEntity<>("El grupo no existe", HttpStatus.NOT_FOUND);
		}
		grupoActual.setJugador1(grupo.getJugador1());
		grupoActual.setJugador2(grupo.getJugador2());
		grupoActual.setJugador3(grupo.getJugador3());
		grupoActual.setDiscordJugador1(grupo.getDiscordJugador1());
		grupoActual.setDiscordJugador2(grupo.getDiscordJugador2());
		grupoActual.setDiscordJugador3(grupo.getDiscordJugador3());
		gruposFortniteRepository.save(grupoActual);
		return new ResponseEntity<>("Actualización correcta", HttpStatus.OK);
	}

}
