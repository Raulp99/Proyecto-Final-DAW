import { createRouter, createWebHashHistory } from "vue-router";
import LeagueOfLegends from "../views/league-of-legends.vue";

const routes = [
  {
    path: '${process.env.BASE_URL}league-of-legends',
    name: 'LeagueOfLegends',
    component: LeagueOfLegends
  }
];

const router = createRouter({
  history: createWebHashHistory(process.env.BASE_URL),
  routes
});

export default router;
