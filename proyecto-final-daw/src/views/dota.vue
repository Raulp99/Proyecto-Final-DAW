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
                <option value="all-pick">All Pick</option>
                <option value="ranked">All Pick Ranked</option>
                <option value="captains-mode">Captains Mode</option>
                <option value="random-draft">Random Draft</option>
                <option value="single-draft">Single Draft</option>
                <option value="all-random">All Random</option>
                <option value="ability-draft">Ability Draft</option>
                <option value="turbo">Turbo</option>
                <option value="mutation">Mutation</option>
                <option value="captains-draft">Captains Draft</option>
                <option value="ability-draft-turbo">Ability Draft Turbo</option>
              </select>
            </div>

            <div class="form-group mb-3" v-if="seleccionModoJuego === 'ranked'">
              <label>Rango competitivo</label>
              <select class="form-select" v-model="subseleccion">
                <option value="" disabled selected>Selecciona el rango</option>
                <option value="herald">Herald</option>
                <option value="guardian">Guardian</option>
                <option value="crusader">Crusader</option>
                <option value="archon">Archon</option>
                <option value="legend">Legend</option>
                <option value="ancient">Ancient</option>
                <option value="divine">Divine</option>
                <option value="immortal">Immortal</option>
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
                <option value="uswest">🇺🇸 US West</option>
                <option value="useast">🇺🇸 US East</option>
                <option value="southamerica">🇧🇷 Sudamérica</option>
                <option value="europewest">🇪🇺 Europa Occidental</option>
                <option value="europenorth">🇪🇺 Europa Oriental</option>
                <option value="russia">🇷🇺 Rusia</option>
                <option value="seasia">🇸🇬 Sudeste Asiático</option>
                <option value="australia">🇦🇺 Australia</option>
                <option value="china">🇨🇳 China</option>
                <option value="perfectworld">🇨🇳 Perfect World</option>
                <option value="dubai">🇦🇪 Dubai</option>
                <option value="southafrica">🇿🇦 Sudáfrica</option>
              </select>
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
  name: "DotaDos",
  data() {
    return {
      seleccionModoJuego: "",
      subseleccion: "",
    };
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
