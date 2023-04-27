<template>
    <div class="container">
      <h1 class="text-center mt-5">Iniciar sesión</h1>
      <form @submit.prevent="submitForm" class="mt-5">
        <div class="mb-3">
          <label for="username" class="form-label">Nombre de usuario:</label>
          <input type="text" v-model="username" class="form-control" id="username" required>
        </div>
        <div class="mb-3">
          <label for="password" class="form-label">Contraseña:</label>
          <input type="password" v-model="password" class="form-control" id="password" required>
        </div>
        <button type="submit" class="btn btn-primary">Iniciar sesión</button>
      </form>
    </div>
  </template>
  
  <script>
  export default {
    name:"formularioInicioSesion",
    data() {
      return {
        username: '',
        password: ''
      }
    },
    methods: {
      submitForm() {
        // Aquí iría la lógica para enviar el formulario al servidor y autenticar al usuario
      }
    }
  }
  </script>
  