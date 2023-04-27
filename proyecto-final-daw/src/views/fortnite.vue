<template>
  <div id="contenedor-fortnite container">
    <!-- Contenido superior -->
    <header class="col-12 contenedor-header-fortnite mb-4">
      <div class="filtro-header"></div>
      <div class="texto-header">
        <h1>Fortnite</h1>
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
              <label for="asunto">Modo de juego</label>
              <select class="form-select" id="asunto">
                <option value="" disabled selected>
                  Selecciona el modo de juego
                </option>
                <option value="pnormal">BR Escuadrones</option>
                <option value="aram">BR Tríos</option>
                <option value="pclasificatoria">BR Dúos</option>
                <option value="tft">Creativo</option>
                <option value="urf">Modos especiales</option>
              </select>
            </div>
            <!-- Seleccion número de jugadores -->
            <div class="form-group mb-3 mx-auto">
              <label for="cantidad" class="d-block"
                >Número de jugadores necesarios necesarios</label
              >

              <input
                type="radio"
                class="btn-check"
                name="numeroJugadores"
                id="unJugador"
                autocomplete="off"
                checked
              />
              <label class="btn col-4" for="unJugador">1</label>

              <input
                type="radio"
                class="btn-check"
                name="numeroJugadores"
                id="dosJugadores"
                autocomplete="off"
              />
              <label class="btn col-4" for="dosJugadores">2</label>

              <input
                type="radio"
                class="btn-check"
                name="numeroJugadores"
                id="tresJugadores"
                autocomplete="off"
              />
              <label class="btn col-4" for="tresJugadores">3</label>
            </div>

            <!-- Seleccion región -->
            <div class="form-group mb-3">
              <label for="cantidad" class="d-block">Región</label>
              <select class="form-select select-region">
                <option value="" disabled selected>Selecciona la región</option>
                <option value="NA-East">🇺🇸 NA-Este</option>
                <option value="NA-West">🇺🇸 NA-Oeste</option>
                <option value="Europe">🇪🇺 Europa</option>
                <option value="Brazil">🇧🇷 Brasil</option>
                <option value="Asia">🇯🇵 Asia</option>
                <option value="Oceania">🇦🇺 Oceanía</option>
                <option value="Middle-East">🇸🇦 Oriente Medio</option>
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
  name: "FortNite",
  // Aquí van las propiedades, métodos, etc.
};
</script>

<style>
.contenedor-header-fortnite {
  position: relative;
  height: 40vh;
  background-image: url(@/assets/img/fortnite/fondo-fortnite.jpg);
  background-position: center;
  background-size: cover;
}
</style>
