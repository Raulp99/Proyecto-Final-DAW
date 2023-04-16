<template>
  <div id="contenedor-league-of-legends">
    <header class="contenedor-header-league-of-legends mb-4">
      <div class="filtro-header"></div>
      <div class="texto-header">
        <h1>League Of Legends</h1>
      </div>
    </header>
  </div>
</template>

<script>
export default {
  name: "LeagueOfLegends",
  // Aquí van las propiedades, métodos, etc.
};
</script>

<style>
.contenedor-header-league-of-legends {
  position: relative;
  height: 70vh;
  background-image: url(@/assets/fondo-legue-of-legends.jpg);
  background-position: center;
  background-size: cover;
}
</style>
