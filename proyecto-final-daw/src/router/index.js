import { createRouter, createWebHashHistory } from "vue-router";
import Inicio from "../views/seleccion_juego.vue";

const routes = [
  {
    path: "/",
    name: "Inicio",
    component: Inicio
  }
];

const router = createRouter({
  history: createWebHashHistory(),
  routes
});

export default router;
