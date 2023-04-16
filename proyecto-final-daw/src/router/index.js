import { createRouter, createWebHashHistory } from "vue-router";
import SeleccionJuego from "../views/seleccion-juego.vue";
import LeagueOfLegends from "../views/league-of-legends.vue";
import CounterStrike from "../views/counter-strike.vue";
import Valorant from "../views/valorant.vue";
import ApexLegends from "../views/apex-legends.vue";
import Dota from "../views/dota.vue";
import Overwatch from "../views/overwatch.vue";
import RainbowSix from "../views/rainbow-six.vue";
import Fortnite from "../views/fortnite.vue";

const routes = [
  {
    path: "/",
    name: "SeleccionJuego",
    component: SeleccionJuego,
    meta: {
      title: 'NEXO'
    }
  },
  {
    path: "/league-of-legends",
    name: "LeagueOfLegends",
    component: LeagueOfLegends,
    meta: {
      title: 'League of Legends'
    }
  },
  {
    path: "/counter-strike",
    name: "CounterStrike",
    component: CounterStrike,
    meta: {
      title: 'Counter Strike Global Offensive'
    }
  },
  {
    path: "/valorant",
    name: "Valorant",
    component: Valorant,
    meta: {
      title: 'Valorant'
    }
  },
  {
    path: "/apex-legends",
    name: "ApexLegends",
    component: ApexLegends,
    meta: {
      title: 'Apex Legends'
    }
  },
  {
    path: "/dota",
    name: "Dota",
    component: Dota,
    meta: {
      title: 'Dota 2'
    }
  },
  {
    path: "/overwatch",
    name: "Overwatch",
    component: Overwatch ,
    meta: {
      title: 'Overwatch 2'
    }
  },
  {
    path: "/rainbow-six",
    name: "RainbowSix",
    component: RainbowSix,
    meta: {
      title: 'RainbowSix'
    }
  },
  {
    path: "/fortnite",
    name: "Fortnite",
    component: Fortnite,
    meta: {
      title: 'Fortnite'
    }
  }
];

const router = createRouter({
  history: createWebHashHistory(),
  routes
});

// Cambiar tittle de la página
router.beforeEach((to, from, next) => {
  if (to.meta.title) {
    document.title = to.meta.title;
  }
  next();
});

export default router;
