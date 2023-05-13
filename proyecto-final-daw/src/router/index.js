import { createRouter, createWebHashHistory } from "vue-router";

import SeleccionJuego from "@/views/seleccion-juego.vue";
import LeagueOfLegends from "@/views/league-of-legends.vue";
import CounterStrike from "@/views/counter-strike.vue";
import Valorant from "@/views/valorant.vue";
import ApexLegends from "@/views/apex-legends.vue";
import Dota2 from "@/views/dota2.vue";
import Overwatch from "@/views/overwatch.vue";
import RainbowSix from "@/views/rainbow-six.vue";
import Fortnite from "@/views/fortnite.vue";
import FormInicioSesion from "@/views/formulario-inicio-sesion.vue";
import FormRegistro from "@/views/formulario-registro.vue";

const routes = [
  // Vista de inicio
  {
    path: "/",
    name: "SeleccionJuego",
    component: SeleccionJuego,
    meta: {
      title: "NEXO",
    },
  },
  {
    path: "/league-of-legends",
    name: "LeagueOfLegends",
    component: LeagueOfLegends,
    meta: {
      title: "League of Legends",
    },
  },
  {
    path: "/counter-strike",
    name: "CounterStrike",
    component: CounterStrike,
    meta: {
      title: "Counter Strike Global Offensive",
    },
  },
  {
    path: "/valorant",
    name: "Valorant",
    component: Valorant,
    meta: {
      title: "Valorant",
    },
  },
  {
    path: "/apex-legends",
    name: "ApexLegends",
    component: ApexLegends,
    meta: {
      title: "Apex Legends",
    },
  },
  {
    path: "/dota2",
    name: "Dota2",
    component: Dota2,
    meta: {
      title: "Dota2 2",
    },
  },
  {
    path: "/overwatch2",
    name: "Overwatch",
    component: Overwatch,
    meta: {
      title: "Overwatch 2",
    },
  },
  {
    path: "/rainbow-six-siege",
    name: "RainbowSix",
    component: RainbowSix,
    meta: {
      title: "RainbowSix",
    },
  },
  {
    path: "/fortnite",
    name: "Fortnite",
    component: Fortnite,
    meta: {
      title: "Fortnite",
    },
  },
  {
    path: "/formulario-inicio-sesion",
    name: "FormInicioSesion",
    component: FormInicioSesion,
    meta: {
      title: "NEXO Iniciar sesión",
    },
  },
  {
    path: "/formulario-registro",
    name: "FormRegistro",
    component: FormRegistro,
    meta: {
      title: "NEXO Registro",
    },
  },
];

const router = createRouter({
  history: createWebHashHistory(),
  routes,
  // Desplaza al inicio de la página al cambiar de vista
  scrollBehavior() {
    document.getElementById("app").scrollIntoView({ behavior: "smooth" });
  },
});

// Cambiar tittle de la página
router.beforeEach((to, from, next) => {
  if (to.meta.title) {
    document.title = to.meta.title;
  }
  next();
});

export default router;
