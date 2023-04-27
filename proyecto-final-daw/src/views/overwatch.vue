<template>
  <div id="contenedor-overwatch">
    <header class="contenedor-header-overwatch mb-4">
      <div class="filtro-header"></div>
      <div class="texto-header">
        <h1>Overwatch 2</h1>
      </div>
    </header>

    <div class="container-fluid">
      <div class="row">
        <!-- Contenido Principal -->
        <div
          class="order-1 order-lg-0 col-12 col-lg-7 mx-auto contenedor-buscar-grupo shadow"
        >
          <!-- contenedor-crear-grupo buscar grupos -->
          <h1>Explorar grupos</h1>
        </div>

        <!-- contenedor-crear-grupo crear grupo -->
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
                <option value="partidaRapida">Partida Rápida</option>
                <option value="partidaCompetitiva">Partida Competitiva</option>
                <option value="modoArcade">Modo arcade</option>
                <option value="partidaPersonalizada">
                  Partida personalizada
                </option>
              </select>
            </div>

            <div
              class="form-group mb-3"
              v-if="seleccionModoJuego === 'partidaCompetitiva'"
            >
              <label>Rango competitivo</label>
              <select class="form-select">
                <option value="" disabled selected>Selecciona el rango</option>
                <option value="bronce">Bronce</option>
                <option value="plata">Plata</option>
                <option value="oro">Oro</option>
                <option value="platino">Platino</option>
                <option value="diamante">Diamante</option>
                <option value="maestro">Maestro</option>
                <option value="granMaestro">Gran Maestro</option>
              </select>
            </div>

            <div
              class="form-group mb-3"
              v-if="seleccionModoJuego === 'partidaCompetitiva'"
            >
              <label>Plataforma</label>
              <select class="form-select" id="plataforma" name="plataforma">
                <option value="" disabled selected>
                  Selecciona la plataforma
                </option>
                <option value="pc">PC</option>
                <option value="ps4">PlayStation 4</option>
                <option value="ps5">PlayStation 5</option>
                <option value="xboxone">Xbox One</option>
                <option value="xboxseriesx">Xbox Series X/S</option>
                <option value="nintendoswitch">Nintendo Switch</option>
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
  name: "OverwatchDos",
  // components: { Breadcrumbs },
  data() {
    return {
      seleccionModoJuego: "",
      subseleccion: "",
    };
  },
};
</script>

<style>
.contenedor-header-overwatch {
  position: relative;
  height: 40vh;
  background-image: url(@/assets/img/overwatch/fondo-overwatch2.png);
  background-position: center;
  background-size: cover;
}
</style>
