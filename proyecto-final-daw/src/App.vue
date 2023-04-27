<template>
  <div id="app">
    <!-- Contenido superior -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark barra-navegacion">
      <div class="container-fluid">
        <router-link to="/nexo" class="navbar-brand">
          <h1 class="logo">NEXO</h1>
        </router-link>
        <div class="navbar-nav ms-auto">
          <router-link class="nav-link" to="/nexo/formulario-inicio-sesion"
            >Iniciar sesión</router-link
          >
          <router-link class="nav-link" to="/nexo/formulario-registro"
            >Registrarse</router-link
          >
        </div>
      </div>
    </nav>
    <!-- Contenido principal -->
    <main>
      <router-view></router-view>
    </main>

    <!-- Contenido inferior -->
    <footer class="bg-dark text-white py-4 footer">
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
      </div>
    </footer>
  </div>
</template>
<script></script>
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

.barra-navegacion {
  background: #24222e;
  padding: 20px;
  color: #fff;
}

.logo {
  transition: 0.3s;
}

.logo:hover {
  color: #636363;
  transform: translate(0, -3px);
}

main {
  min-height: 70vh;
}

footer {
  background: #636363;
  padding: 20px;
  color: #fff;
  margin-top: 130px;
}

.licenciaCC a {
  text-decoration: none;
}
</style>
