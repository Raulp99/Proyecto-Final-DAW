<template>
  <div>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark navbar-custom">
      <div class="container-fluid">
        <a class="navbar-brand" href="#"><h1>NEXO</h1></a>

        <div class="navbar-nav ms-auto">
          <a class="nav-link" href="#">Iniciar sesión</a>
          <a class="nav-link" href="#">Registrarse</a>
        </div>
      </div>
    </nav>
    <header class="header-container mb-4">
      <div class="header-overlay"></div>
      <div class="header-text">
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
        <a href="" class="col-xl-3 col-md-6 mb-4 juego">
          <div class="card border-0 shadow csgo h-100">
            <div class="card-body text-center">
              <p class="card-title mb-0 titulo">
                Counter strike global Offensive
              </p>
            </div>
          </div>
        </a>
        <!-- Juego 3 -->
        <a href="" class="col-xl-3 col-md-6 mb-4 juego">
          <div class="card border-0 shadow valorant h-100">
            <div class="card-body text-center">
              <p class="card-title mb-0 titulo">Valorant</p>
            </div>
          </div>
        </a>
        <!-- Juego 4 -->
        <a href="" class="col-xl-3 col-md-6 mb-4 juego">
          <div class="card border-0 shadow apex h-100">
            <div class="card-body text-center">
              <p class="card-title mb-0 titulo">Apex legends</p>
            </div>
          </div>
        </a>
        <!-- Juego 5 -->
        <a href="" class="col-xl-3 col-md-6 mb-4 juego">
          <div class="card border-0 shadow dota2 h-100">
            <div class="card-body text-center">
              <p class="card-title mb-0 titulo">DOTA 2</p>
            </div>
          </div>
        </a>
        <!-- Juego 6 -->
        <a href="" class="col-xl-3 col-md-6 mb-4 juego">
          <div class="card border-0 shadow overwatch2 h-100">
            <div class="card-body text-center">
              <p class="card-title mb-0 titulo">Overwatch 2</p>
            </div>
          </div>
        </a>
        <!-- Juego 7 -->
        <a href="" class="col-xl-3 col-md-6 mb-4 juego">
          <div class="card border-0 shadow rainbow6 h-100">
            <div class="card-body text-center">
              <p class="card-title mb-0 titulo">
                Tom Clancy's Rainbow Six Siege
              </p>
            </div>
          </div>
        </a>
        <!-- Juego 8 -->
        <a href="" class="col-xl-3 col-md-6 mb-4 juego">
          <div class="card border-0 shadow fortnite h-100">
            <div class="card-body text-center">
              <p class="card-title mb-0 titulo">Fortnite</p>
            </div>
          </div>
        </a>
      </div>
      <!-- /.row -->
    </div>
    <footer class="bg-dark text-white py-4">
      <div class="container">
        <div class="row">
          <div class="col-md-1">Nexo 2023</div>
          <div class="col-md-11 text-start"></div>
        </div>
      </div>
      <hr />
      <div class="py-3 text-center licenciaCC">
        <a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/">
          <img
            alt="Licencia de Creative Commons"
            style="border-width: 0"
            src="https://i.creativecommons.org/l/by-sa/4.0/80x15.png"
          />
        </a>
        <span
          xmlns:dct="http://purl.org/dc/terms/"
          href="http://purl.org/dc/dcmitype/Dataset"
          property="dct:title"
          rel="dct:type"
        >
          Nexo
        </span>
        by
        <span
          xmlns:cc="http://creativecommons.org/ns#"
          property="cc:attributionName"
        >
          Raúl Pérez Esteban
        </span>
        is licensed under a
        <a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/"
          >Creative Commons Reconocimiento-CompartirIgual 4.0 Internacional
          License</a
        >
        <div class="col-lg-11 col-md-10 col-sm-9">
          <router-view></router-view>
        </div>
      </div>
    </footer>
  </div>
</template>
<!-- eslint-disable-next-line vue/multi-word-component-names -->
<script>

export default {
  name: "VistaSeleccionJuego",
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  box-sizing: border-box;
  background-color: #e7e7e7;
}

.navbar-custom {
  background: #24222e;
  padding: 20px;
  color: #fff;
}

.header-container {
  position: relative;
  height: 70vh;
  background-image: url(https://images.unsplash.com/photo-1560419015-7c427e8ae5ba?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80);
  background-position: center;
  background-size: cover;
}

.header-overlay {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.6);
  backdrop-filter: blur(2px);
}

.header-text {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-90%, -60%);
  text-align: left;
  color: #fff;
}

.header-text h1 {
  font-size: 6rem;
  margin-bottom: 1rem;
}

.header-text h2 {
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

.licenciaCC a {
  text-decoration: none;
}
</style>
