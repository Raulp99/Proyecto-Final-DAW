<template>
  <div id="app">
    <!-- Contenido superior -->
    <nav class="navbar navbar-expand-lg navbar-dark barra-navegacion">
      <div class="container-fluid">
        <router-link to="/" class="navbar-brand">
          <h1 class="logo">NEXO</h1>
        </router-link>
        <div class="navbar-nav ms-auto">
          <router-link class="nav-link" to="/formulario-inicio-sesion"
            >Acerca de</router-link
          >
          <!-- <router-link class="nav-link" to="/formulario-registro"
            >Registrarse</router-link
          > -->
        </div>
      </div>
    </nav>
    <!-- Contenido principal -->
    <main>
      <router-view></router-view>
    </main>

    <!-- Contenido inferior -->
    <footer class="text-white footer">
      <div class="container">
        <div class="row m-3">
          <div
            class="col-md-12 col-lg-10 contenedor-contacto order-1 order-lg-0"
          >
            <h4>Nexo 2023</h4>
            <ul class="list-unstyled ms-3">
              <li>
                Email de contacto:<a href="#" v-on:click="abrirCorreo()">
                  contacto@nexo.com</a
                >
              </li>
              <li>Teléfono: <a href="tel:+34912345678">+34 912 345 678</a></li>
            </ul>
          </div>

          <div
            class="col-md-12 col-lg-2 mt-4 mt-lg-0 order-0 order-lg-1 contenedor-iconos-redes d-flex justify-content-lg-end justify-content-center"
          >
            <a href="https://www.facebook.com/" target="_blank">
              <img
                src="@/assets/img/social-media/facebook_icon.png"
                alt="Facebook"
              />
            </a>
            <a href="https://telegram.org/" target="_blank">
              <img
                src="@/assets/img/social-media/telegram_icon.png"
                alt="Telegram"
              />
            </a>
            <a href="https://twitter.com/" target="_blank">
              <img
                src="@/assets/img/social-media/twitter_icon.png"
                alt="Twitter"
              />
            </a>
            <a href="https://www.whatsapp.com/" target="_blank">
              <img
                src="@/assets/img/social-media/whatsapp_icon.png"
                alt="WhatsApp"
              />
            </a>
          </div>
          <hr class="d-block d-lg-none my-3" />
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
<script>
export default {
  methods: {
    // Abre correo en nueva pestaña
    abrirCorreo() {
      window.open("mailto:contacto@nexo.com", "_blank");
    },
  },
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

.barra-navegacion {
  background: #2a2d34;
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
  background: #2a2d34;
  padding: 20px;
  color: #fff;
  margin-top: 130px;
}

.contenedor-contacto {
  text-align: left;
}

.contenedor-contacto a {
  color: rgb(141, 136, 136);
  text-decoration: none;
}

.contenedor-contacto a:hover {
  color: rgb(104, 104, 104);
  text-decoration: none;
}

.contenedor-iconos-redes a img {
  width: 2.5em;
  margin: 0 10px 5px 10px;
}

.contenedor-iconos-redes a img:hover {
  transform: translate(0, -2px);
}

.licenciaCC {
  font-size: 15px;
}
.licenciaCC a {
  text-decoration: none;
  color: rgb(141, 136, 136);
}

.licenciaCC a:hover {
  color: rgb(104, 104, 104);
  text-decoration: none;
}
</style>
