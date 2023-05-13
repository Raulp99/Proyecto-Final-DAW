package com.nexo.dao;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import com.nexo.dto.GruposLoLDTO;

public interface IGruposLoLDAO {
	public List<GruposLoLDTO> listarGruposLol(Integer idGrupo, String tituloGrupo, String modoJuego, String rangoCompetitivo,
			Integer numeroJugadores, String region, String descripcion, String liderGrupo, String jugador1,
			String jugador2, String jugador3, String jugador4, String discordLiderGrupo, String discordJugador1,
			String discordJugador2, String discordJugador3, String discordJugador4, String nombreEnJuegoLiderGrupo,
			String nombreEnJuegoJugador1, String nombreEnJuegoJugador2, String nombreEnJuegoJugador3,
			String nombreEnJuegoJugador4, LocalDateTime fechaCreacion, Integer grupoActivo) throws SQLException;
}
