<template>
  <div id="contenedor-dota">
    <header class="contenedor-header-dota mb-4">
      <div class="filtro-header"></div>
      <div class="texto-header">
        <h1>Dota 2</h1>
      </div>
    </header>
    <div class="container-fluid">
      <div class="row">
        <!-- Contenido Principal -->
        <div
          class="order-1 order-lg-0 col-11 col-lg-7 mt-4 mt-lg-0 mx-auto shadow contenedor-buscar-grupo container-fluid"
        >
          <!-- contenedor-crear-grupo buscar grupos -->
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

            <div class="border p-2 contenedor-miembros">
              <h5 class="campo-grupo">Jugadores</h5>

              <div class="contenedor-miembro">
                <div class="miembro lider-grupo">Líder de grupo</div>

                <div class="nombre-jugador">
                  <img
                    src="@/assets/img/dota2/dota2-icon.png"
                    alt=""
                    class="icono"
                    title="Dota 2"
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
                      src="@/assets/img/dota2/dota2-icon.png"
                      alt=""
                      class="icono"
                      title="Dota 2"
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
                  <form method="post" v-on:submit.prevent="modificarGrupo()">
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
                      src="@/assets/img/dota2/dota2-icon.png"
                      alt=""
                      class="icono"
                      title="Dota 2"
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
                  <label class="miembro">Jugador 2</label>
                  <input type="text" placeholder="Jugador 2" class="" />
                  <input
                    type="text"
                    placeholder="discord + #"
                    class=""
                  /><button>Unirse</button>
                </div>
              </div>

              <div class="contenedor-miembro" v-if="post.numeroJugadores >= 3">
                <div v-if="comprobarJugador(post.jugador3)">
                  <div class="miembro">Jugador 3</div>
                  <div>
                    <img
                      src="@/assets/img/dota2/dota2-icon.png"
                      alt=""
                      class="icono"
                      title="Dota 2"
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
                  <label class="miembro">Jugador 3</label>
                  <input type="text" placeholder="Jugador 3" class="" />
                  <input
                    type="text"
                    placeholder="discord + #"
                    class=""
                  /><button>Unirse</button>
                </div>
              </div>

              <div class="contenedor-miembro" v-if="post.numeroJugadores >= 4">
                <div v-if="comprobarJugador(post.jugador4)">
                  <div class="miembro">Jugador 4</div>
                  <div>
                    <img
                      src="@/assets/img/dota2/dota2-icon.png"
                      alt=""
                      class="icono"
                      title="Dota 2"
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
                  <label class="miembro">Jugador 4</label>
                  <input type="text" placeholder="Jugador 4" class="" />

                  <input
                    type="text"
                    placeholder="discord + #"
                    class=""
                  /><button>Unirse</button>
                </div>
              </div>
            </div>
          </div>
        </div>

        <!-- contenedor-crear-grupo crear grupo -->
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
                <label for="nombre">Nombre de usuario en Dota 2</label>
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
                  <optgroup label="Modos Competitivos">
                    <option value="RANKED ALL PICK">RANKED ALL PICK</option>
                    <option value="MODO CAPITÁN">MODO CAPITÁN</option>
                    <option value="SELECCIÓN ALEATORIA RANKED">
                      SELECCIÓN ALEATORIA RANKED
                    </option>
                  </optgroup>
                  <optgroup label="Modos normales">
                    <option value="ELECCIÓN LIBRE">ELECCIÓN LIBRE</option>
                    <option value="SELECCIÓN SIMPLE">SELECCIÓN SIMPLE</option>
                    <option value="SELECCIÓN ALEATORIA">
                      SELECCIÓN ALEATORIA
                    </option>
                    <option value="MENOS JUGADOS">MENOS JUGADOS</option>
                    <option value="TODOS ALEATORIO">TODOS ALEATORIO</option>
                    <option value="HÉROES LIMITADOS">HÉROES LIMITADOS</option>
                    <option value=" SELECCIÓN CON CAPITÁN">
                      SELECCIÓN CON CAPITÁN
                    </option>
                    <option value="TODOS ALEATORIO A MUERTE">
                      TODOS ALEATORIO A MUERTE
                    </option>
                  </optgroup>
                </select>
              </div>

              <div class="form-group mb-3" v-if="comprobarModo(modoJuego)">
                <label>Rango competitivo</label>
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
                  <option value="Herald">Herald</option>
                  <option value="Guardian">Guardian</option>
                  <option value="Crusader">Crusader</option>
                  <option value="Archon">Archon</option>
                  <option value="Legend">Legend</option>
                  <option value="Ancient">Ancient</option>
                  <option value="Divine">Divine</option>
                  <option value="Immortal">Immortal</option>
                </select>
              </div>

              <!-- Seleccion número de jugadores -->
              <div class="form-group mb-3 mx-auto">
                <label for="cantidad" class="d-block"
                  >Número de jugadores necesarios</label
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
                  <option value="🇺🇸 US West">🇺🇸 US West</option>
                  <option value="🇺🇸 US East">🇺🇸 US East</option>
                  <option value="🇧🇷 Sudamérica">🇧🇷 Sudamérica</option>
                  <option value="🇪🇺 Europa Occidental">
                    🇪🇺 Europa Occidental
                  </option>
                  <option value="🇪🇺 Europa Oriental">🇪🇺 Europa Oriental</option>
                  <option value="🇷🇺 Rusia">🇷🇺 Rusia</option>
                  <option value="🇸🇬 Sudeste Asiático">
                    🇸🇬 Sudeste Asiático
                  </option>
                  <option value="🇦🇺 Australia">🇦🇺 Australia</option>
                  <option value="🇨🇳 China">🇨🇳 China</option>
                  <option value="🇨🇳 Perfect World">🇨🇳 Perfect World</option>
                  <option value="🇦🇪 Dubai">🇦🇪 Dubai</option>
                  <option value="🇿🇦 Sudáfrica">🇿🇦 Sudáfrica</option>
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
  name: "DotaDos",
  data() {
    return {
      gruposDota2: "http://localhost:8081/nexo/gruposDota2",
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
      try {
        const response = await axios.post(this.gruposDota2, {
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

    async modificarGrupo() {
      try {
        const response = await axios.put(
          this.gruposDota2 + "/" + this.idgrupo,
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
        .get(this.gruposDota2)
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

    comprobarModo(modoJuego) {
      switch (modoJuego) {
        case "RANKED ALL PICK":
        case "MODO CAPITÁN":
        case "SELECCIÓN ALEATORIA RANKED":
          return true;

        default:
          return false;
      }
    },
  },
  mounted() {
    this.listarGrupos();
  },
};
</script>

<style>
.contenedor-header-dota {
  position: relative;
  height: 40vh;
  background-image: url(@/assets/img/dota2/fondo-dota2.jpg);
  background-position: center;
  background-size: cover;
}
</style>
