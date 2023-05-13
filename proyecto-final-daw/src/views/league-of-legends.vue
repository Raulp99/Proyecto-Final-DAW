<template>
  <div id="contenedor-league-of-legends">
    <header class="contenedor-header-league-of-legends mb-4 col-12">
      <div class="filtro-header"></div>
      <div class="texto-header">
        <h1>League Of Legends</h1>
      </div>
    </header>

    <div class="container-fluid">
      <div class="row">
        <!-- Contenido Principal -->
        <div
          class="order-1 order-lg-0 col-11 col-lg-7 mt-4 mt-lg-0 mx-auto shadow contenedor-buscar-grupo container-fluid"
        >
          <!-- Buscar grupos -->
          <h1 class="titulo-form col-12">Explorar grupos</h1>
          <div
            class="grupo p-3 my-3"
            v-for="post in postsGrupos"
            :key="post.idgrupo"
          >
            <h4 class="titulo-grupo">{{ post.tituloGrupo }}</h4>

            <p>
              <span class="campo-grupo">Modo de juego:</span>
              {{ post.modoJuego }}
            </p>
            <p
              v-if="
                post.rangoCompetitivo != null && post.rangoCompetitivo != ''
              "
            >
              <span class="campo-grupo">Rango competitivo:</span>
              {{ post.rangoCompetitivo }}
            </p>
            <p>
              <span class="campo-grupo">Región del servidor:</span>
              {{ post.region }}
            </p>

            <p class="campo-grupo">Descripción</p>
            <div class="descripcion-grupo">
              <p>{{ post.descripcion }}</p>
            </div>

            <p>
              <span class="campo-grupo">Fecha de creación:</span>
              {{ formatoFechaGrupo(post.fechaCreacion) }}
            </p>

            <div class="border p-2 contenedor-miembros">
              <h5 class="campo-grupo">Jugadores</h5>

              <div class="contenedor-miembro">
                <div class="miembro lider-grupo">Líder de grupo</div>

                <div class="nombre-jugador">
                  <img
                    src="@/assets/img/league-of-legends/league-of-legends-icon.png"
                    alt=""
                    class="icono"
                    title="League of legends"
                  />
                  {{ post.liderGrupo }}
                </div>

                <div class="nombre-discord">
                  <img
                    src="@/assets/img/social-media/discord-icon.svg"
                    alt="discord"
                    class="icono"
                    title="Discord"
                  />
                  {{ post.discordLiderGrupo }}
                </div>
              </div>

              <div class="contenedor-miembro" v-if="post.numeroJugadores >= 1">
                <div v-if="comprobarJugador(post.jugador1)">
                  <div class="miembro">Jugador 1</div>
                  <div>
                    <img
                      src="@/assets/img/league-of-legends/league-of-legends-icon.png"
                      alt=""
                      class="icono"
                      title="League of legends"
                    />{{ post.jugador1 }}
                  </div>
                  <div>
                    <img
                      src="@/assets/img/social-media/discord-icon.svg"
                      alt="discord"
                      class="icono"
                      title="Discord"
                    />
                    {{ post.discordJugador1 }}
                  </div>
                </div>
                <div v-if="!comprobarJugador(post.jugador1)">
                  <form
                    method="post"
                    v-on:submit.prevent="
                      modificarGrupo(
                        post.idGrupo,
                        post.jugador1,
                        post.jugador2,
                        post.jugador3,
                        post.jugador4,
                        post.discordJugador1,
                        post.discordJugador2,
                        post.discordJugador3,
                        post.discordJugador4
                      )
                    "
                  >
                    <label class="miembro">Jugador 1</label>
                    <input
                      type="text"
                      id="jugador1"
                      name="jugador1"
                      minlength="3"
                      maxlength="16"
                      placeholder="Jugador 1"
                      v-model="jugador1"
                      required
                    />
                    <input
                      type="text"
                      placeholder="discord + #"
                      id="discordJugador1"
                      name="discordJugador1"
                      v-model="discordJugador1"
                    />
                    <button type="submit">Unirse</button>
                  </form>
                </div>
              </div>

              <div class="contenedor-miembro" v-if="post.numeroJugadores >= 2">
                <div v-if="comprobarJugador(post.jugador2)">
                  <div class="miembro">Jugador 2</div>
                  <div>
                    <img
                      src="@/assets/img/league-of-legends/league-of-legends-icon.png"
                      alt=""
                      class="icono"
                      title="League of legends"
                    />{{ post.jugador2 }}
                  </div>
                  <div>
                    <img
                      src="@/assets/img/social-media/discord-icon.svg"
                      alt="discord"
                      class="icono"
                      title="Discord"
                    />
                    {{ post.discordJugador2 }}
                  </div>
                </div>
                <div v-if="!comprobarJugador(post.jugador2)">
                  <form
                    method="post"
                    v-on:submit.prevent="
                      modificarGrupo(
                        post.idGrupo,
                        post.jugador1,
                        post.jugador2,
                        post.jugador3,
                        post.jugador4,
                        post.discordJugador1,
                        post.discordJugador2,
                        post.discordJugador3,
                        post.discordJugador4
                      )
                    "
                  >
                    <label class="miembro">Jugador 2</label>
                    <input
                      type="text"
                      id="jugador2"
                      name="jugador2"
                      minlength="3"
                      maxlength="16"
                      placeholder="Jugador 2"
                      v-model="jugador2"
                      required
                    />
                    <input
                      type="text"
                      placeholder="discord + #"
                      id="discordJugador2"
                      name="discordJugador2"
                      v-model="discordJugador2"
                    />
                    <button type="submit">Unirse</button>
                  </form>
                </div>
              </div>

              <div class="contenedor-miembro" v-if="post.numeroJugadores >= 3">
                <div v-if="comprobarJugador(post.jugador3)">
                  <div class="miembro">Jugador 3</div>
                  <div>
                    <img
                      src="@/assets/img/league-of-legends/league-of-legends-icon.png"
                      alt=""
                      class="icono"
                      title="League of legends"
                    />{{ post.jugador3 }}
                  </div>
                  <div>
                    <img
                      src="@/assets/img/social-media/discord-icon.svg"
                      alt="discord"
                      class="icono"
                      title="Discord"
                    />
                    {{ post.discordJugador3 }}
                  </div>
                </div>

                <div v-if="!comprobarJugador(post.jugador3)">
                  <form
                    method="post"
                    v-on:submit.prevent="
                      modificarGrupo(
                        post.idGrupo,
                        post.jugador1,
                        post.jugador2,
                        post.jugador3,
                        post.jugador4,
                        post.discordJugador1,
                        post.discordJugador2,
                        post.discordJugador3,
                        post.discordJugador4
                      )
                    "
                  >
                    <label class="miembro">Jugador 3</label>
                    <input
                      type="text"
                      id="jugador3"
                      name="jugador3"
                      minlength="3"
                      maxlength="16"
                      placeholder="Jugador 3"
                      v-model="jugador3"
                      required
                    />
                    <input
                      type="text"
                      placeholder="discord + #"
                      id="discordJugador3"
                      name="discordJugador3"
                      v-model="discordJugador3"
                    />
                    <button type="submit">Unirse</button>
                  </form>
                </div>
              </div>

              <div class="contenedor-miembro" v-if="post.numeroJugadores >= 4">
                <div v-if="comprobarJugador(post.jugador4)">
                  <div class="miembro">Jugador 4</div>
                  <div>
                    <img
                      src="@/assets/img/league-of-legends/league-of-legends-icon.png"
                      alt=""
                      class="icono"
                      title="League of legends"
                    />{{ post.jugador4 }}
                  </div>
                  <div>
                    <img
                      src="@/assets/img/social-media/discord-icon.svg"
                      alt="discord"
                      class="icono"
                      title="Discord"
                    />
                    {{ post.discordJugador4 }}
                  </div>
                </div>
                <div v-if="!comprobarJugador(post.jugador4)">
                  <form
                    method="post"
                    v-on:submit.prevent="
                      modificarGrupo(
                        post.idGrupo,
                        post.jugador1,
                        post.jugador2,
                        post.jugador3,
                        post.jugador4,
                        post.discordJugador1,
                        post.discordJugador2,
                        post.discordJugador3,
                        post.discordJugador4
                      )
                    "
                  >
                    <label class="miembro">Jugador 4</label>
                    <input
                      type="text"
                      id="jugador4"
                      name="jugador4"
                      minlength="3"
                      maxlength="16"
                      placeholder="Jugador 4"
                      v-model="jugador4"
                      required
                    />
                    <input
                      type="text"
                      placeholder="discord + #"
                      id="discordJugador4"
                      name="discordJugador4"
                      v-model="discordJugador4"
                    />
                    <button type="submit">Unirse</button>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>

        <!-- contenedor-crear-grupo -->
        <div
          class="order-0 order-lg-1 col-11 col-lg-4 mx-auto contenedor-crear-grupo shadow"
        >
          <!-- Formulario -->
          <form
            class="formCrearGrupo"
            method="post"
            v-on:submit.prevent="guardarGrupo()"
          >
            <h1 class="titulo-form">Crea un grupo nuevo</h1>

            <fieldset>
              <legend>Líder de grupo</legend>
              <div class="form-group mb-3">
                <label for="nombre"
                  >Nombre de usuario en League of Legends</label
                >
                <input
                  type="text"
                  class="form-control"
                  id="liderGrupo"
                  name="liderGrupo"
                  minlength="3"
                  maxlength="16"
                  v-model="liderGrupo"
                  required
                />
              </div>
              <div class="form-group mb-3">
                <label for="nombre">Nombre en discord + tag</label>
                <input
                  type="text"
                  class="form-control"
                  id="discordLiderGrupo"
                  name="discordLiderGrupo"
                  v-model="discordLiderGrupo"
                  placeholder="Ej. usuario#1234"
                />
              </div>
            </fieldset>

            <fieldset>
              <legend>Preferencias del grupo</legend>

              <!-- Título del grupo -->
              <div class="form-group mb-3">
                <label for="nombre">Título del grupo</label>
                <input
                  type="text"
                  class="form-control"
                  id="tituloGrupo"
                  name="tituloGrupo"
                  placeholder="Titulo"
                  v-model="tituloGrupo"
                  maxlength="32"
                  required
                />
              </div>

              <!-- Seleccion modo de juego -->
              <div class="form-group mb-3">
                <label>Modo de juego</label>
                <select
                  class="form-select"
                  id="modoJuego"
                  name="modoJuego"
                  v-model="modoJuego"
                  required
                >
                  <option value="" disabled selected>
                    Selecciona el modo de juego
                  </option>
                  <option value="Partida Normal">Partida Normal</option>
                  <option value="Partida Clasificatoria">
                    Partida Clasificatoria
                  </option>
                  <option value="ARAM">ARAM</option>
                  <option value="Modos de juego por tiempo limitado">
                    Modos de juego por tiempo limitado
                  </option>
                </select>
              </div>

              <!-- Seleccion rango competitivo -->
              <div
                class="form-group mb-3"
                v-if="modoJuego === 'Partida Clasificatoria'"
              >
                <label>Rango competitivo </label>

                <select
                  class="form-select select-rango"
                  name="rangoCompetitivo"
                  id="rangoCompetitivo"
                  v-model="rangoCompetitivo"
                  required
                >
                  <option value="" disabled selected>
                    Selecciona el rango
                  </option>
                  <option value="Hierro">Hierro</option>
                  <option value="Bronce">Bronce</option>
                  <option value="Plata">Plata</option>
                  <option value="Oro">Oro</option>
                  <option value="Platino">Platino</option>
                  <option value="Diamante">Diamante</option>
                  <option value="Maestro">Maestro</option>
                  <option value="Gran Maestro">Gran Maestro</option>
                  <option value="Retador (Challenger)">
                    Retador (Challenger)
                  </option>
                </select>
              </div>

              <!-- Seleccion número de jugadores -->
              <div class="form-group mb-3 mx-auto">
                <label for="cantidad" class="d-block"
                  >Número de jugadores requeridos</label
                >

                <input
                  type="radio"
                  class="btn-check"
                  name="numeroJugadores"
                  id="unJugador"
                  value="1"
                  autocomplete="off"
                  checked
                  v-model="numeroJugadores"
                  required
                />
                <label class="btn col-3" for="unJugador">1</label>

                <input
                  type="radio"
                  class="btn-check"
                  name="numeroJugadores"
                  id="dosJugadores"
                  value="2"
                  autocomplete="off"
                  v-model="numeroJugadores"
                  required
                />
                <label class="btn col-3" for="dosJugadores">2</label>

                <input
                  type="radio"
                  class="btn-check"
                  value="3"
                  name="numeroJugadores"
                  id="tresJugadores"
                  autocomplete="off"
                  v-model="numeroJugadores"
                  required
                />
                <label class="btn col-3" for="tresJugadores">3</label>

                <input
                  type="radio"
                  class="btn-check"
                  value="4"
                  name="numeroJugadores"
                  id="cuatroJugadores"
                  autocomplete="off"
                  v-model="numeroJugadores"
                  required
                />
                <label class="btn col-3" for="cuatroJugadores">4</label>
              </div>

              <!-- Seleccion región -->
              <div class="form-group mb-3">
                <label for="cantidad" class="d-block">Región</label>
                <select
                  class="form-select select-region"
                  id="region"
                  name="region"
                  v-model="region"
                  required
                >
                  <option value="" disabled selected>
                    Selecciona la región
                  </option>
                  <option value="🇪🇺 Europa Occidental (EUW)">
                    🇪🇺 Europa Occidental (EUW)
                  </option>
                  <option value="🇪🇺 Europa del Este (EUNE)">
                    🇪🇺 Europa del Este (EUNE)
                  </option>
                  <option value="🇺🇸 América del Norte (NA)">
                    🇺🇸 América del Norte (NA)
                  </option>
                  <option value="🇧🇷 Brasil (BR)">🇧🇷 Brasil (BR)</option>
                  <option value="🇲🇽 Latinoamérica Norte (LAN)">
                    🇲🇽 Latinoamérica Norte (LAN)
                  </option>
                  <option value="🇨🇱 Latinoamérica Sur (LAS)">
                    🇨🇱 Latinoamérica Sur (LAS)
                  </option>
                  <option value="🇰🇷 Corea (KR)">🇰🇷 Corea (KR)</option>
                  <option value="🇨🇳 China (CN)">🇨🇳 China (CN)</option>
                  <option value="🇯🇵 Japón (JP)">🇯🇵 Japón (JP)</option>
                  <option value="🇷🇺 Rusia (RU)">🇷🇺 Rusia (RU)</option>
                  <option value="🇦🇺 Oceanía (OCE)">🇦🇺 Oceanía (OCE)</option>
                  <option value="🇹🇷 Turquía (TR)">🇹🇷 Turquía (TR)</option>
                </select>
              </div>

              <!-- Descripción del grupo -->
              <div class="form-group mb-3">
                <label for="mensaje">Descripción:</label>
                <textarea
                  class="form-control"
                  id="mensaje"
                  rows="3"
                  v-model="descripcion"
                ></textarea>
              </div>
            </fieldset>
            <!-- Guardar grupo -->
            <button
              type="submit"
              class="btn boton-guardar"
              style="margin-left: 2rem"
            >
              Crear grupo
            </button>
          </form>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: "LeagueOfLegends",
  data() {
    return {
      gruposLeagueOfLegends: "http://localhost:8081/nexo/gruposLeagueOfLegends",
      postsGrupos: [],
      idgrupo: "",
      tituloGrupo: "",
      modoJuego: "",
      rangoCompetitivo: "",
      numeroJugadores: "1",
      region: "",
      descripcion: "",
      liderGrupo: "",
      jugador1: "",
      jugador2: "",
      jugador3: "",
      jugador4: "",
      discordLiderGrupo: "",
      discordJugador1: "",
      discordJugador2: "",
      discordJugador3: "",
      discordJugador4: "",
      fechaCreacion: "",
      grupoActivo: "",
    };
  },

  methods: {
    async guardarGrupo() {
      this.fechaCreacion = new Date().toISOString();
      this.grupoActivo = 1;
      try {
        const response = await axios.post(this.gruposLeagueOfLegends, {
          tituloGrupo: this.tituloGrupo,
          modoJuego: this.modoJuego,
          rangoCompetitivo: this.rangoCompetitivo,
          numeroJugadores: this.numeroJugadores,
          region: this.region,
          descripcion: this.descripcion,
          liderGrupo: this.liderGrupo,
          fechaCreacion: this.fechaCreacion,
          discordLiderGrupo: this.discordLiderGrupo,
          nombreLiderGrupo: this.nombreLiderGrupo,
          grupoActivo: this.grupoActivo,
        });
        console.log(response);
        this.tituloGrupo = "";
        this.nombreLiderGrupo = "";
        this.discordLiderGrupo = "";
        this.modoJuego = "";
        this.rangoCompetitivo = "";
        this.numeroJugadores = "1";
        this.region = "";
        this.descripcion = "";
        this.liderGrupo = "";
        this.fechaCreacion = "";

        this.listarGrupos(); // Actualiza la lista de grupos
      } catch (error) {
        console.log(error);
      }
    },

    async modificarGrupo(id, j1, j2, j3, j4, d1, d2, d3, d4) {
      this.idgrupo = id;

      const jugadores = {
        jugador1: j1,
        jugador2: j2,
        jugador3: j3,
        jugador4: j4,
      };

      const discordJugadores = {
        discordJugador1: d1,
        discordJugador2: d2,
        discordJugador3: d3,
        discordJugador4: d4,
      };

      for (const jugador in jugadores) {
        if (jugadores[jugador] != null && jugadores[jugador] != "") {
          this[jugador] = jugadores[jugador];
        }
      }

      for (const discordJugador in discordJugadores) {
        if (
          discordJugadores[discordJugador] != null &&
          discordJugadores[discordJugador] != ""
        ) {
          this[discordJugador] = discordJugadores[discordJugador];
        }
      }

      try {
        const response = await axios.put(
          this.gruposLeagueOfLegends + "/" + this.idgrupo,
          {
            jugador1: this.jugador1,
            jugador2: this.jugador2,
            jugador3: this.jugador3,
            jugador4: this.jugador4,
            discordJugador1: this.discordJugador1,
            discordJugador2: this.discordJugador2,
            discordJugador3: this.discordJugador3,
            discordJugador4: this.discordJugador4,
          }
        );
        console.log(response);
        this.listarGrupos(); // Actualiza la lista de grupos
      } catch (error) {
        console.log(error);
      }
    },

    listarGrupos() {
      axios
        .get(this.gruposLeagueOfLegends)
        .then((response) => {
          this.postsGrupos = response.data;
        })
        .catch((e) => {
          this.errors.push(e);
        });
    },

    comprobarJugador(jugador) {
      return jugador != null && jugador != "" ? true : false;
    },

    formatoFechaGrupo(fecha) {
      const fechaFormat = new Date(fecha);
      const dia = fechaFormat.getDate();
      const mes = fechaFormat.getMonth() + 1;
      const anio = fechaFormat.getFullYear();
      return `${dia}-${mes}-${anio}`;
    },
  },
  mounted() {
    this.listarGrupos();
  },
};
</script>

<style>
.contenedor-header-league-of-legends {
  position: relative;
  height: 40vh;
  background-image: url(@/assets/img/league-of-legends/lol-card-image.png);
  background-position: center;
  background-position-y: -240px;
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
