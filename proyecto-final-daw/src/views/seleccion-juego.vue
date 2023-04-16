<template>
  <div id="contenedor-seleccion-juego">
    <header class="contenedor-header mb-4">
      <div class="filtro-header"></div>
      <div class="texto-header">
        <h1>Encuentra jugadores con NEXO</h1>
        <h2 class="">
          Encuentra fácilmente a los jugadores que necesitas, conoce gente nueva
          y mejora los resultados de tus partidas.
        </h2>
      </div>
    </header>
    <div class="container">
      <div class="row">
        <!-- Juego 1 -->
        <router-link to="/league-of-legends" class="col-xl-3 col-md-6 mb-4 juego">
          <div class="card border-0 shadow lol h-100">
            <div class="card-body text-center">
              <p class="card-title mb-0 titulo">League of legends</p>
            </div>
          </div>
        </router-link>
        <!-- Juego 2 -->
        <router-link to="/counter-strike" class="col-xl-3 col-md-6 mb-4 juego">
          <div class="card border-0 shadow csgo h-100">
            <div class="card-body text-center">
              <p class="card-title mb-0 titulo">
                Counter strike global Offensive
              </p>
            </div>
          </div>
        </router-link>
        <!-- Juego 3 -->
        <router-link to="/valorant" class="col-xl-3 col-md-6 mb-4 juego">
          <div class="card border-0 shadow valorant h-100">
            <div class="card-body text-center">
              <p class="card-title mb-0 titulo">Valorant</p>
            </div>
          </div>
        </router-link>
        <!-- Juego 4 -->
        <router-link to="/apex-legends" class="col-xl-3 col-md-6 mb-4 juego">
          <div class="card border-0 shadow apex h-100">
            <div class="card-body text-center">
              <p class="card-title mb-0 titulo">Apex legends</p>
            </div>
          </div>
        </router-link>
        <!-- Juego 5 -->
        <router-link to="/dota" class="col-xl-3 col-md-6 mb-4 juego">
          <div class="card border-0 shadow dota2 h-100">
            <div class="card-body text-center">
              <p class="card-title mb-0 titulo">DOTA 2</p>
            </div>
          </div>
        </router-link>
        <!-- Juego 6 -->
        <router-link to="/overwatch" class="col-xl-3 col-md-6 mb-4 juego">
          <div class="card border-0 shadow overwatch2 h-100">
            <div class="card-body text-center">
              <p class="card-title mb-0 titulo">Overwatch 2</p>
            </div>
          </div>
        </router-link>
        <!-- Juego 7 -->
        <router-link to="/rainbow-six" class="col-xl-3 col-md-6 mb-4 juego">
          <div class="card border-0 shadow rainbow6 h-100">
            <div class="card-body text-center">
              <p class="card-title mb-0 titulo">
                Tom Clancy's Rainbow Six Siege
              </p>
            </div>
          </div>
        </router-link>
        <!-- Juego 8 -->
        <router-link to="/fortnite" class="col-xl-3 col-md-6 mb-4 juego">
          <div class="card border-0 shadow fortnite h-100">
            <div class="card-body text-center">
              <p class="card-title mb-0 titulo">Fortnite</p>
            </div>
          </div>
        </router-link>
      </div>
      <!-- /.row -->
    </div>
   
  </div>
</template>
<!-- eslint-disable-next-line vue/multi-word-component-names -->
<script>

export default {
  name: "SeleccionJuego",
};
</script>

<style>

.contenedor-header {
  position: relative;
  height: 70vh;
  background-image: url(@/assets/imagen-cabecera-inicio.avif);
  background-position: center;
  background-size: cover;
}

.filtro-header {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.6);
  backdrop-filter: blur(2px);
}

.texto-header {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-90%, -60%);
  text-align: left;
  color: #fff;
}

.texto-header h1 {
  font-size: 6rem;
  margin-bottom: 1rem;
}

.texto-header h2 {
  font-size: 2rem;
}

.header-titulo {
  text-align: left;
}

.header-titulo a {
  text-decoration: none;
  color: #f0f0f0;
}

.header-titulo a:hover {
  text-decoration: none;
  color: #527cd6cb;
}

footer {
  background: #636363;
  padding: 20px;
  color: #fff;
  margin-top: 130px;
}

.juego {
  border-radius: 2%;
  font-weight: bold;
  text-decoration: none;
  text-transform: capitalize;
  transition: 0.3s;
}

.juego .titulo {
  text-align: center;
  margin-top: 50%;
  color: #f0f0f0;
  text-shadow: #2c3e50;
  font-size: 30px;
  backdrop-filter: blur(4px);
  border-radius: 2%;
}

.juego:hover {
  color: #636363;
  transform: translate(0, -10px);
}

.csgo {
  background-image: url(@/assets/fondo-counter-strike.jpg);
  background-size: cover;
  background-repeat: no-repeat;
}

.lol {
  background-image: url(@/assets/lol-card-image.png);
  background-size: cover;
  background-repeat: no-repeat;
}

.valorant {
  background-image: url(@/assets/fondo-valorant.jpg);
  background-size: cover;
  background-repeat: no-repeat;
  background-position: center;
}

.apex {
  background-image: url(@/assets/fondo-apex-legends.jpg);
  background-size: cover;
  background-repeat: no-repeat;
  background-position: center;
}

.dota2 {
  background-image: url(@/assets/fondo-dota2.jpg);
  background-size: cover;
  background-repeat: no-repeat;
  background-position: center;
}

.fortnite {
  background-image: url(@/assets/fondo-fortnite.jpg);
  background-size: cover;
  background-repeat: no-repeat;
  background-position: center;
}

.overwatch2 {
  background-image: url(@/assets/fondo-overwatch2.png);
  background-size: cover;
  background-repeat: no-repeat;
  background-position: center;
}

.rainbow6 {
  background-image: url(@/assets/fondo-rainbow6.png);
  background-size: cover;
  background-repeat: no-repeat;
  background-position: center;
}

</style>
