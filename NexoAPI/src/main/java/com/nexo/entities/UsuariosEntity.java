package com.nexo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UsuariosEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Integer idUsuario;

	@Column(name = "email")
	private String email;

	@Column(name = "nickname")
	private String nickname;

	@Column(name = "password")
	private String password;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidos")
	private String apellidos;

	@Column(name = "nombre_league_of_legends")
	private String nombreLeagueOfLegends;

	@Column(name = "nombre_counter_strike")
	private String nombreCounterStrike;

	@Column(name = "nombre_valorant")
	private String nombreValorant;

	@Column(name = "nombre_apex")
	private String nombreApex;

	@Column(name = "nombre_dota2")
	private String nombreDota2;

	@Column(name = "nombre_overwatch2")
	private String nombreOverwatch2;

	@Column(name = "nombre_rainbow_six")
	private String nombreRainbowSix;

	@Column(name = "nombre_fortnite")
	private String nombreFortnite;

	@Column(name = "nombre_discord")
	private String nombreDiscord;

	public UsuariosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuariosEntity(Integer idUsuario, String email, String nickname, String password, String nombre,
			String apellidos, String nombreLeagueOfLegends, String nombreCounterStrike, String nombreValorant,
			String nombreApex, String nombreDota2, String nombreOverwatch2, String nombreRainbowSix,
			String nombreFortnite, String nombreDiscord) {
		super();
		this.idUsuario = idUsuario;
		this.email = email;
		this.nickname = nickname;
		this.password = password;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nombreLeagueOfLegends = nombreLeagueOfLegends;
		this.nombreCounterStrike = nombreCounterStrike;
		this.nombreValorant = nombreValorant;
		this.nombreApex = nombreApex;
		this.nombreDota2 = nombreDota2;
		this.nombreOverwatch2 = nombreOverwatch2;
		this.nombreRainbowSix = nombreRainbowSix;
		this.nombreFortnite = nombreFortnite;
		this.nombreDiscord = nombreDiscord;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombreLeagueOfLegends() {
		return nombreLeagueOfLegends;
	}

	public void setNombreLeagueOfLegends(String nombreLeagueOfLegends) {
		this.nombreLeagueOfLegends = nombreLeagueOfLegends;
	}

	public String getNombreCounterStrike() {
		return nombreCounterStrike;
	}

	public void setNombreCounterStrike(String nombreCounterStrike) {
		this.nombreCounterStrike = nombreCounterStrike;
	}

	public String getNombreValorant() {
		return nombreValorant;
	}

	public void setNombreValorant(String nombreValorant) {
		this.nombreValorant = nombreValorant;
	}

	public String getNombreApex() {
		return nombreApex;
	}

	public void setNombreApex(String nombreApex) {
		this.nombreApex = nombreApex;
	}

	public String getNombreDota2() {
		return nombreDota2;
	}

	public void setNombreDota2(String nombreDota2) {
		this.nombreDota2 = nombreDota2;
	}

	public String getNombreOverwatch2() {
		return nombreOverwatch2;
	}

	public void setNombreOverwatch2(String nombreOverwatch2) {
		this.nombreOverwatch2 = nombreOverwatch2;
	}

	public String getNombreRainbowSix() {
		return nombreRainbowSix;
	}

	public void setNombreRainbowSix(String nombreRainbowSix) {
		this.nombreRainbowSix = nombreRainbowSix;
	}

	public String getNombreFortnite() {
		return nombreFortnite;
	}

	public void setNombreFortnite(String nombreFortnite) {
		this.nombreFortnite = nombreFortnite;
	}

	public String getNombreDiscord() {
		return nombreDiscord;
	}

	public void setNombreDiscord(String nombreDiscord) {
		this.nombreDiscord = nombreDiscord;
	}

}
