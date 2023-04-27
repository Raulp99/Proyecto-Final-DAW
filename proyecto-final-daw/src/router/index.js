import { createRouter, createWebHistory } from "vue-router";
import SeleccionJuego from "@/views/seleccion-juego.vue";
import LeagueOfLegends from "@/views/league-of-legends.vue";
import CounterStrike from "@/views/counter-strike.vue";
import Valorant from "@/views/valorant.vue";
import ApexLegends from "@/views/apex-legends.vue";
import Dota from "@/views/dota.vue";
import Overwatch from "@/views/overwatch.vue";
import RainbowSix from "@/views/rainbow-six.vue";
import Fortnite from "@/views/fortnite.vue";
import FormInicioSesion from "@/views/formulario-inicio-sesion.vue";
import FormRegistro from "@/views/formulario-registro.vue";

const routes = [
  // Vista de inicio
  {
    path: "/nexo",
    name: "SeleccionJuego",
    component: SeleccionJuego,
    meta: {
      title: 'NEXO'
    }
  },
  {
    path: "/nexo/league-of-legends",
    name: "LeagueOfLegends",
    component: LeagueOfLegends,
    meta: {
      title: 'League of Legends'
    }
  },
  {
    path: "/nexo/counter-strike",
    name: "CounterStrike",
    component: CounterStrike,
    meta: {
      title: 'Counter Strike Global Offensive'
    }
  },
  {
    path: "/nexo/valorant",
    name: "Valorant",
    component: Valorant,
    meta: {
      title: 'Valorant'
    }
  },
  {
    path: "/nexo/apex-legends",
    name: "ApexLegends",
    component: ApexLegends,
    meta: {
      title: 'Apex Legends'
    }
  },
  {
    path: "/nexo/dota2",
    name: "Dota",
    component: Dota,
    meta: {
      title: 'Dota 2'
    }
  },
  {
    path: "/nexo/overwatch2",
    name: "Overwatch",
    component: Overwatch ,
    meta: {
      title: 'Overwatch 2'
    }
  },
  {
    path: "/nexo/rainbow-six-siege",
    name: "RainbowSix",
    component: RainbowSix,
    meta: {
      title: 'RainbowSix'
    }
  },
  {
    path: "/nexo/fortnite",
    name: "Fortnite",
    component: Fortnite,
    meta: {
      title: 'Fortnite'
    }
  },
  {
    path: "/nexo/formulario-inicio-sesion",
    name: "FormInicioSesion",
    component: FormInicioSesion,
    meta: {
      title: 'FormInicioSesion'
    }
  },
  {
    path: "/nexo/formulario-registro",
    name: "FormRegistro",
    component: FormRegistro,
    meta: {
      title: 'FormRegistro'
    }
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
  // Desplaza al inicio de la página al cambiar de vista
  scrollBehavior() {
    document.getElementById('app').scrollIntoView({ behavior: 'smooth' });
}
});

// Cambiar tittle de la página
router.beforeEach((to, from, next) => {
  if (to.meta.title) {
    document.title = to.meta.title;
  }
  next();
});

export default router;
