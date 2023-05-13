package com.nexo.dto;

import java.time.LocalDateTime;

public class GruposLoLDTO {
	private Integer idGrupo;
	private String tituloGrupo;
	private String modoJuego;
	private String rangoCompetitivo;
	private Integer numeroJugadores;
	private String region;
	private String descripcion;
	private String liderGrupo;
	private String jugador1;
	private String jugador2;
	private String jugador3;
	private String jugador4;
	private String discordLiderGrupo;
	private String discordJugador1;
	private String discordJugador2;
	private String discordJugador3;
	private String discordJugador4;
	private String nombreEnJuegoLiderGrupo;
	private String nombreEnJuegoJugador1;
	private String nombreEnJuegoJugador2;
	private String nombreEnJuegoJugador3;
	private String nombreEnJuegoJugador4;
	private LocalDateTime fechaCreacion;
	private Integer grupoActivo;

	public GruposLoLDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GruposLoLDTO(Integer idGrupo, String tituloGrupo, String modoJuego, String rangoCompetitivo,
			Integer numeroJugadores, String region, String descripcion, String liderGrupo, String jugador1,
			String jugador2, String jugador3, String jugador4, String discordLiderGrupo, String discordJugador1,
			String discordJugador2, String discordJugador3, String discordJugador4, String nombreEnJuegoLiderGrupo,
			String nombreEnJuegoJugador1, String nombreEnJuegoJugador2, String nombreEnJuegoJugador3,
			String nombreEnJuegoJugador4, LocalDateTime fechaCreacion, Integer grupoActivo) {
		super();
		this.idGrupo = idGrupo;
		this.tituloGrupo = tituloGrupo;
		this.modoJuego = modoJuego;
		this.rangoCompetitivo = rangoCompetitivo;
		this.numeroJugadores = numeroJugadores;
		this.region = region;
		this.descripcion = descripcion;
		this.liderGrupo = liderGrupo;
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.jugador3 = jugador3;
		this.jugador4 = jugador4;
		this.discordLiderGrupo = discordLiderGrupo;
		this.discordJugador1 = discordJugador1;
		this.discordJugador2 = discordJugador2;
		this.discordJugador3 = discordJugador3;
		this.discordJugador4 = discordJugador4;
		this.nombreEnJuegoLiderGrupo = nombreEnJuegoLiderGrupo;
		this.nombreEnJuegoJugador1 = nombreEnJuegoJugador1;
		this.nombreEnJuegoJugador2 = nombreEnJuegoJugador2;
		this.nombreEnJuegoJugador3 = nombreEnJuegoJugador3;
		this.nombreEnJuegoJugador4 = nombreEnJuegoJugador4;
		this.fechaCreacion = fechaCreacion;
		this.grupoActivo = grupoActivo;
	}

	public Integer getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(Integer idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getTituloGrupo() {
		return tituloGrupo;
	}

	public void setTituloGrupo(String tituloGrupo) {
		this.tituloGrupo = tituloGrupo;
	}

	public String getModoJuego() {
		return modoJuego;
	}

	public void setModoJuego(String modoJuego) {
		this.modoJuego = modoJuego;
	}

	public String getRangoCompetitivo() {
		return rangoCompetitivo;
	}

	public void setRangoCompetitivo(String rangoCompetitivo) {
		this.rangoCompetitivo = rangoCompetitivo;
	}

	public Integer getNumeroJugadores() {
		return numeroJugadores;
	}

	public void setNumeroJugadores(Integer numeroJugadores) {
		this.numeroJugadores = numeroJugadores;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getLiderGrupo() {
		return liderGrupo;
	}

	public void setLiderGrupo(String liderGrupo) {
		this.liderGrupo = liderGrupo;
	}

	public String getJugador1() {
		return jugador1;
	}

	public void setJugador1(String jugador1) {
		this.jugador1 = jugador1;
	}

	public String getJugador2() {
		return jugador2;
	}

	public void setJugador2(String jugador2) {
		this.jugador2 = jugador2;
	}

	public String getJugador3() {
		return jugador3;
	}

	public void setJugador3(String jugador3) {
		this.jugador3 = jugador3;
	}

	public String getJugador4() {
		return jugador4;
	}

	public void setJugador4(String jugador4) {
		this.jugador4 = jugador4;
	}

	public String getDiscordLiderGrupo() {
		return discordLiderGrupo;
	}

	public void setDiscordLiderGrupo(String discordLiderGrupo) {
		this.discordLiderGrupo = discordLiderGrupo;
	}

	public String getDiscordJugador1() {
		return discordJugador1;
	}

	public void setDiscordJugador1(String discordJugador1) {
		this.discordJugador1 = discordJugador1;
	}

	public String getDiscordJugador2() {
		return discordJugador2;
	}

	public void setDiscordJugador2(String discordJugador2) {
		this.discordJugador2 = discordJugador2;
	}

	public String getDiscordJugador3() {
		return discordJugador3;
	}

	public void setDiscordJugador3(String discordJugador3) {
		this.discordJugador3 = discordJugador3;
	}

	public String getDiscordJugador4() {
		return discordJugador4;
	}

	public void setDiscordJugador4(String discordJugador4) {
		this.discordJugador4 = discordJugador4;
	}

	public String getNombreEnJuegoLiderGrupo() {
		return nombreEnJuegoLiderGrupo;
	}

	public void setNombreEnJuegoLiderGrupo(String nombreEnJuegoLiderGrupo) {
		this.nombreEnJuegoLiderGrupo = nombreEnJuegoLiderGrupo;
	}

	public String getNombreEnJuegoJugador1() {
		return nombreEnJuegoJugador1;
	}

	public void setNombreEnJuegoJugador1(String nombreEnJuegoJugador1) {
		this.nombreEnJuegoJugador1 = nombreEnJuegoJugador1;
	}

	public String getNombreEnJuegoJugador2() {
		return nombreEnJuegoJugador2;
	}

	public void setNombreEnJuegoJugador2(String nombreEnJuegoJugador2) {
		this.nombreEnJuegoJugador2 = nombreEnJuegoJugador2;
	}

	public String getNombreEnJuegoJugador3() {
		return nombreEnJuegoJugador3;
	}

	public void setNombreEnJuegoJugador3(String nombreEnJuegoJugador3) {
		this.nombreEnJuegoJugador3 = nombreEnJuegoJugador3;
	}

	public String getNombreEnJuegoJugador4() {
		return nombreEnJuegoJugador4;
	}

	public void setNombreEnJuegoJugador4(String nombreEnJuegoJugador4) {
		this.nombreEnJuegoJugador4 = nombreEnJuegoJugador4;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getGrupoActivo() {
		return grupoActivo;
	}

	public void setGrupoActivo(Integer grupoActivo) {
		this.grupoActivo = grupoActivo;
	}

}
