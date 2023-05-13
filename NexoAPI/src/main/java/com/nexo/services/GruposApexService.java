package com.nexo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nexo.entities.GruposApexEntity;
import com.nexo.repositories.IGruposApexRepository;

@Service
public class GruposApexService {
	@Autowired
	private IGruposApexRepository gruposApexRepository;

	public Iterable<GruposApexEntity> listarGrupos() {
		return gruposApexRepository.findAll();
	}

	public ResponseEntity<String> insertarGrupo(GruposApexEntity grupo) {
		gruposApexRepository.save(grupo);
		return new ResponseEntity<>("Inserción correcta!", HttpStatus.OK);
	}

	public ResponseEntity<String> modificarGrupo(Integer id, GruposApexEntity grupo) {
		GruposApexEntity grupoActual = gruposApexRepository.findById(id).orElse(null);
		if (grupoActual == null) {
			return new ResponseEntity<>("El grupo no existe", HttpStatus.NOT_FOUND);
		}
		grupoActual.setJugador1(grupo.getJugador1());
		grupoActual.setJugador2(grupo.getJugador2());
		grupoActual.setDiscordJugador1(grupo.getDiscordJugador1());
		grupoActual.setDiscordJugador2(grupo.getDiscordJugador2());
		gruposApexRepository.save(grupoActual);
		return new ResponseEntity<>("Actualización correcta", HttpStatus.OK);
	}

}
