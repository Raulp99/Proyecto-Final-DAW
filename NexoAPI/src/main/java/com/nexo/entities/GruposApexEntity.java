package com.nexo.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "grupos_apex")
public class GruposApexEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_grupo")
	private Integer idGrupo;

	@Column(name = "titulo_grupo")
	private String tituloGrupo;

	@Column(name = "modo_juego")
	private String modoJuego;

	@Column(name = "rango_competitivo")
	private String rangoCompetitivo;

	@Column(name = "numero_jugadores")
	private Integer numeroJugadores;

	@Column(name = "region")
	private String region;

	@Column(name = "microfono_requerido")
	private String microfonoRequerido;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "lider_grupo")
	private String liderGrupo;

	@Column(name = "jugador1")
	private String jugador1;

	@Column(name = "jugador2")
	private String jugador2;

	@Column(name = "discord_lider_grupo")
	private String discordLiderGrupo;

	@Column(name = "discord_jugador1")
	private String discordJugador1;

	@Column(name = "discord_jugador2")
	private String discordJugador2;

	@Column(name = "fecha_creacion")
	private LocalDateTime fechaCreacion;

	@Column(name = "grupo_activo")
	private Integer grupoActivo;

	public GruposApexEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GruposApexEntity(Integer idGrupo, String tituloGrupo, String modoJuego, String rangoCompetitivo,
			Integer numeroJugadores, String region, String microfonoRequerido, String descripcion, String liderGrupo,
			String jugador1, String jugador2, String discordLiderGrupo, String discordJugador1, String discordJugador2,
			LocalDateTime fechaCreacion, Integer grupoActivo) {
		super();
		this.idGrupo = idGrupo;
		this.tituloGrupo = tituloGrupo;
		this.modoJuego = modoJuego;
		this.rangoCompetitivo = rangoCompetitivo;
		this.numeroJugadores = numeroJugadores;
		this.region = region;
		this.microfonoRequerido = microfonoRequerido;
		this.descripcion = descripcion;
		this.liderGrupo = liderGrupo;
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.discordLiderGrupo = discordLiderGrupo;
		this.discordJugador1 = discordJugador1;
		this.discordJugador2 = discordJugador2;
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

	public String getMicrofonoRequerido() {
		return microfonoRequerido;
	}

	public void setMicrofonoRequerido(String microfonoRequerido) {
		this.microfonoRequerido = microfonoRequerido;
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
