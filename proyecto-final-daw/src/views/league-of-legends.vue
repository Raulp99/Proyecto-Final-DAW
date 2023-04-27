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
          class="order-1 order-lg-0 col-11 col-lg-7 mt-4 mt-lg-0 mx-auto shadow contenedor-buscar-grupo"
        >
          <!-- contenedor-crear-grupo buscar grupos -->
          <h1 class="titulo-form">Explorar grupos</h1>
        </div>

        <!-- contenedor-crear-grupo crear grupo -->
        <div
          class="order-0 order-lg-1 col-11 col-lg-4 mx-auto contenedor-crear-grupo shadow"
        >
          <!-- Formulario -->
          <form class="formCrearGrupo">
            <h1 class="titulo-form">Crea un grupo nuevo</h1>

            <!-- Título del grupo -->
            <div class="form-group mb-3">
              <label for="nombre">Título del grupo</label>
              <input
                type="text"
                class="form-control"
                id="tituloGrupo"
                placeholder=""
              />
            </div>

            <!-- Seleccion modo de juego -->
            <div class="form-group mb-3">
              <label>Modo de juego</label>
              <select class="form-select" v-model="seleccionModoJuego">
                <option value="" disabled selected>
                  Selecciona el modo de juego
                </option>
                <option value="pnormal">Partida Normal</option>
                <option value="pclasificatoria">Partida Clasificatoria</option>
                <option value="aram">ARAM</option>
                <option value="urf">Modos de juego por tiempo limitado</option>
              </select>
            </div>

            <!-- Seleccion rango competitivo -->
            <div
              class="form-group mb-3"
              v-if="seleccionModoJuego === 'pclasificatoria'"
            >
              <label>Rango competitivo </label>
              <img
                v-if="subseleccion === 'hierro'"
                src="@/assets/img/league-of-legends/iconos-competitivo/icono-hierro.webp"
                alt="hierro"
                title="Hierro"
              />
              <img
                v-else-if="subseleccion === 'bronce'"
                src="@/assets/img/league-of-legends/iconos-competitivo/icono-bronce.webp"
                alt="bronce"
                title="Bronce"
              />
              <img
                v-else-if="subseleccion === 'plata'"
                src="@/assets/img/league-of-legends/iconos-competitivo/icono-plata.webp"
                alt="plata"
                title="Plata"
              />
              <img
                v-else-if="subseleccion === 'oro'"
                src="@/assets/img/league-of-legends/iconos-competitivo/icono-oro.webp"
                alt="oro"
                title="Oro"
              />
              <img
                v-else-if="subseleccion === 'platino'"
                src="@/assets/img/league-of-legends/iconos-competitivo/icono-platino.webp"
                alt="platino"
                title="Platino"
              />
              <img
                v-else-if="subseleccion === 'diamante'"
                src="@/assets/img/league-of-legends/iconos-competitivo/icono-diamante.webp"
                alt="diamante"
                title="Diamante"
              />
              <img
                v-else-if="subseleccion === 'maestro'"
                src="@/assets/img/league-of-legends/iconos-competitivo/icono-maestro.webp"
                alt="maestro"
                title="Maestro"
              />
              <img
                v-else-if="subseleccion === 'granMaestro'"
                src="@/assets/img/league-of-legends/iconos-competitivo/icono-grandmaster.webp"
                alt="gran maestro"
                title="Gran Maestro"
              />
              <img
                v-else-if="subseleccion === 'retador'"
                src="@/assets/img/league-of-legends/iconos-competitivo/icono-challenger.webp"
                alt="retador (challenger)"
                title="Retador (Challenger)"
              />
              <select class="form-select select-rango" v-model="subseleccion">
                <option value="" disabled selected>Selecciona el rango</option>
                <option value="hierro">Hierro</option>
                <option value="bronce">Bronce</option>
                <option value="plata">Plata</option>
                <option value="oro">Oro</option>
                <option value="platino">Platino</option>
                <option value="diamante">Diamante</option>
                <option value="maestro">Maestro</option>
                <option value="granMaestro">Gran Maestro (Grandmaster)</option>
                <option value="retador">Retador (Challenger)</option>
              </select>
            </div>

            <div class="form-group mb-3"></div>

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
                autocomplete="off"
                checked
              />
              <label class="btn col-3" for="unJugador">1</label>

              <input
                type="radio"
                class="btn-check"
                name="numeroJugadores"
                id="dosJugadores"
                autocomplete="off"
              />
              <label class="btn col-3" for="dosJugadores">2</label>

              <input
                type="radio"
                class="btn-check"
                name="numeroJugadores"
                id="tresJugadores"
                autocomplete="off"
              />
              <label class="btn col-3" for="tresJugadores">3</label>

              <input
                type="radio"
                class="btn-check"
                name="numeroJugadores"
                id="cuatroJugadores"
                autocomplete="off"
              />
              <label class="btn col-3" for="cuatroJugadores">4</label>
            </div>

            <!-- Seleccion región -->
            <div class="form-group mb-3">
              <label for="cantidad" class="d-block">Región</label>
              <select class="form-select select-region">
                <option value="" disabled selected>Selecciona la región</option>
                <option value="EUW">🇪🇺 Europa Occidental (EUW)</option>
                <option value="EUNE">🇪🇺 Europa del Este (EUNE)</option>
                <option value="NA">🇺🇸 América del Norte (NA)</option>
                <option value="BR">🇧🇷 Brasil (BR)</option>
                <option value="LAN">🇲🇽 Latinoamérica Norte (LAN)</option>
                <option value="LAS">🇨🇱 Latinoamérica Sur (LAS)</option>
                <option value="KR">🇰🇷 Corea (KR)</option>
                <option value="CN">🇨🇳 China (CN)</option>
                <option value="JP">🇯🇵 Japón (JP)</option>
                <option value="RU">🇷🇺 Rusia (RU)</option>
                <option value="OCE">🇦🇺 Oceanía (OCE)</option>
                <option value="TR">🇹🇷 Turquía (TR)</option>
              </select>
            </div>
            <!-- <div class="form-group mb-3">
              <label class="d-block">Plataforma de comunicación</label>

              <select class="form-select select-platf-com">
                <option value="discord">Discord</option>
                <option value="teamspeak">TeamSpeak</option>
                <option value="mumble">Mumble</option>
                <option value="skype">Skype</option>
                <option value="otra">Otra plataforma</option>
              </select>
            </div> -->

            <!-- Descripción del grupo -->
            <div class="form-group mb-3">
              <label for="mensaje">Descripción:</label>
              <textarea class="form-control" id="mensaje" rows="3"></textarea>
            </div>

            <!-- Fecha de creación del grupo -->
            <input
              type="datetime-local"
              id="fecha-creacion"
              name="fecha-creacion"
              style="display: none"
            />

            <!-- Guardar grupo -->
            <button
              type="submit"
              class="btn boton-guardar"
              style="margin-left: 2rem"
            >
              Guardar
            </button>
          </form>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "LeagueOfLegends",
  data() {
    return {
      seleccionModoJuego: "",
      subseleccion: "",
    };
  },
  // Aquí van las propiedades, métodos, etc.
};
</script>

<style>
.contenedor-header-league-of-legends {
  position: relative;
  height: 40vh;
  background-image: url(@/assets/img/league-of-legends/lol-card-image.png);
  background-position: center;
  background-size: cover;
  background-position: 0px -240px;
}

.select-rango option[value="hierro"] {
  /* background-image: url(@/assets/img/league-of-legends/iconos-competitivo/icono-hierro.webp); */
  background-image: url(@/assets/img/league-of-legends/iconos-competitivo/icono-bronce.webp);
  background-color: auto;
}
</style>
