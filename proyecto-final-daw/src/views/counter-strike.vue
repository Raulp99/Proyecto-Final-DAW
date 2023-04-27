<template>
  <div id="contenedor-counter-strike">
    <header class="contenedor-header-counter-strike mb-4">
      <div class="filtro-header"></div>
      <div class="texto-header">
        <h1>Counter strike global Offensive</h1>
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
                <option value="casual">Casual</option>
                <option value="competitivo">Competitivo</option>
                <option value="dangerZone">Danger Zone</option>
                <option value="deathmatch">Deathmatch</option>
                <option value="deathmatch">Retake</option>
                <option value="deathmatch">Demolición</option>
              </select>
            </div>

            <div
              class="form-group mb-3"
              v-if="seleccionModoJuego === 'competitivo'"
            >
              <label>Rango competitivo</label>
              <select class="form-select" name="rank">
                <optgroup label="Rangos Bajos">
                  <option value="silver1">Plata I</option>
                  <option value="silver2">Plata II</option>
                  <option value="silver3">Plata III</option>
                  <option value="silver4">Plata IV</option>
                  <option value="silverElite">Plata Elite</option>
                  <option value="silverEliteMaster">
                    Maestro de Élite de Plata
                  </option>
                </optgroup>

                <optgroup label="Rangos Medios">
                  <option value="goldNova1">Oro Nova I</option>
                  <option value="goldNova2">Oro Nova II</option>
                  <option value="goldNova3">Oro Nova III</option>
                  <option value="goldNovaMaster">Oro Nova Master</option>
                  <option value="masterGuardian1">Guardián Maestro I</option>
                  <option value="masterGuardian2">Guardián Maestro II</option>
                </optgroup>

                <optgroup label="Rangos Altos">
                  <option value="masterGuardianElite">
                    Maestro Guardián Elite
                  </option>
                  <option value="distinguishedMasterGuardian">
                    Maestro Guardián Distinguido
                  </option>
                  <option value="legendaryEagle">Águila Legendaria</option>
                  <option value="legendaryEagleMaster">
                    Águila Legendaria Maestra
                  </option>
                  <option value="supremeMasterFirstClass">
                    Maestro Supremo de Primera Clase
                  </option>
                  <option value="globalElite">Elite Global</option>
                </optgroup>
              </select>
            </div>
            <div
              class="form-group mb-3"
              v-if="seleccionModoJuego === 'dangerZone'"
            >
              <label>Rango Danger Zone</label>
              <select class="form-select" name="rank">
                <option value="" disabled selected>Selecciona el rango</option>
                <option value="Rat 1">Rat 1</option>
                <option value="Rat 2">Rat 2</option>
                <option value="Hare 1">Hare 1</option>
                <option value="Hare 2">Hare 2</option>
                <option value="Scout 1">Scout 1</option>
                <option value="Scout 2">Scout 2</option>
                <option value="Scout Elite">Scout Elite</option>
                <option value="Fox 1">Fox 1</option>
                <option value="Fox 2">Fox 2</option>
                <option value="Fox 3">Fox 3</option>
                <option value="Fox Elite">Fox Elite</option>
                <option value="Timber Wolf">Timber Wolf</option>
                <option value="Ember Wolf">Ember Wolf</option>
                <option value="Wildfire Wolf">Wildfire Wolf</option>
                <option value="Howling Alpha">Howling Alpha</option>
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
              <label
                class="btn col-3"
                for="dosJugadores"
                v-if="seleccionModoJuego !== 'dangerZone'"
                >2</label
              >

              <input
                type="radio"
                class="btn-check"
                name="numeroJugadores"
                id="tresJugadores"
                autocomplete="off"
              />
              <label
                class="btn col-3"
                for="tresJugadores"
                v-if="seleccionModoJuego !== 'dangerZone'"
                >3</label
              >

              <input
                type="radio"
                class="btn-check"
                name="numeroJugadores"
                id="cuatroJugadores"
                autocomplete="off"
              />
              <label
                class="btn col-3"
                for="cuatroJugadores"
                v-if="seleccionModoJuego !== 'dangerZone'"
                >4</label
              >
            </div>

            <!-- Seleccion región -->
            <div class="form-group mb-3">
              <label for="cantidad" class="d-block">Región</label>
              <select class="form-select select-region">
                <option value="" disabled selected>Selecciona la región</option>
                <option value="eu">🇪🇺 Europa</option>
                <option value="na">🇺🇸 Norteamérica</option>
                <option value="sa">🇧🇷 Sudamérica</option>
                <option value="asia">🇨🇳 Asia</option>
                <option value="oce">🇦🇺 Oceanía</option>
                <option value="afr">🇿🇦 África</option>
                <option value="me">🇸🇦 Oriente Medio</option>
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
  name: "CounterStrike",
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
.contenedor-header-counter-strike {
  position: relative;
  height: 40vh;
  background-image: url(@/assets/img/counter-strike/fondo-counter-strike.jpg);
  background-position: center;
  background-size: cover;
  background-position: 0px -200px;
}
</style>
