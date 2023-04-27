<template>
  <div id="contenedor-valorant">
    <header class="contenedor-header-valorant mb-4">
      <div class="filtro-header"></div>
      <div class="texto-header">
        <h1>Valorant</h1>
      </div>
    </header>

    <div class="container-fluid">
      <div class="row">
        <!-- Contenido Principal -->
        <div
          class="order-1 order-lg-0 col-12 col-lg-7 mx-auto contenedor-buscar-grupo shadow"
        >
          <!-- Contenedor-crear-grupo buscar grupos -->
          <h1>Explorar grupos</h1>
        </div>

        <!-- Contenedor-crear-grupo crear grupo -->
        <div
          class="order-0 order-lg-1 col-12 col-lg-4 mx-auto contenedor-crear-grupo shadow"
        >
          <form class="formCrearGrupo">
            <h1 class="titulo-form">Crea un grupo nuevo</h1>
            <div class="form-group mb-3">
              <label for="nombre">Título del grupo</label>
              <input
                type="text"
                class="form-control"
                id="tituloGrupo"
                placeholder=""
              />
            </div>

            <div class="form-group mb-3">
              <label>Modo de juego</label>
              <select class="form-select" v-model="seleccionModoJuego">
                <option value="" disabled selected>
                  Selecciona el modo de juego
                </option>
                <option value="pnormal">Partida no competitiva</option>
                <option value="pclasificatoria">Partida competitiva</option>
                <option value="aram">Fiebre de la spike</option>
                <option value="tft">Deathmatch</option>
                <option value="urf">Partida personalizada</option>
              </select>
            </div>

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
                v-else-if="subseleccion === 'inmortal'"
                src="@/assets/img/league-of-legends/iconos-competitivo/icono-maestro.webp"
                alt="inmortal"
                title="Inmortal"
              />
              <img
                v-else-if="subseleccion === 'radiante'"
                src="@/assets/img/league-of-legends/iconos-competitivo/icono-grandmaster.webp"
                alt="radiante"
                title="Radiante"
              />
              <select class="form-select select-rango" v-model="subseleccion">
                <option value="" disabled selected>Selecciona el rango</option>
                <option value="hierro">Hierro</option>
                <option value="bronce">Bronce</option>
                <option value="plata">Plata</option>
                <option value="oro">Oro</option>
                <option value="platino">Platino</option>
                <option value="diamante">Diamante</option>
                <option value="maestro">Inmortal</option>
                <option value="granMaestro">Radiante</option>
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
                <option value="na">🇺🇸 Norteamérica</option>
                <option value="sa">🇧🇷 Sudamérica</option>
                <option value="eu">🇪🇺 Europa</option>
                <option value="asia">🇨🇳 Asia</option>
                <option value="oceania">🇦🇺 Oceanía</option>
                <option value="middleeast">🇸🇦 Oriente Medio</option>
              </select>
            </div>

            <!-- Selección Micrófono  -->
            <div class="form-group mb-3">
              <label for="mensaje">Micrófono requerido</label>
              <br />
              <input
                type="radio"
                class="btn-check"
                name="microfono"
                id="microSi"
                autocomplete="off"
                checked
              />
              <label
                class="btn col-6"
                for="microSi"
                v-if="seleccionModoJuego !== 'dangerZone'"
                >Sí</label
              >

              <input
                type="radio"
                class="btn-check"
                name="microfono"
                id="microNo"
                autocomplete="off"
              />
              <label
                class="btn col-6"
                for="microNo"
                v-if="seleccionModoJuego !== 'dangerZone'"
                >No</label
              >
            </div>

            <div class="form-group mb-3">
              <label for="mensaje">Descripción:</label>
              <textarea class="form-control" id="mensaje" rows="3"></textarea>
            </div>
            <button
              type="submit"
              class="btn btn-primary btn-dark boton-guardar"
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
  name: "RiotValorant",
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
.contenedor-header-valorant {
  position: relative;
  height: 40vh;
  background-image: url(@/assets/img/valorant/fondo-valorant.jpg);
  background-position: center;
  background-size: cover;
  background-position: 0px -240px;
  background-repeat: no-repeat;
}
</style>
