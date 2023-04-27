<template>
    <div class="container">
      <h1 class="text-center mt-5">Registrarse</h1>
      <form @submit.prevent="submitForm" class="mt-5">
        <div class="mb-3">
          <label for="username" class="form-label">Nombre de usuario:</label>
          <input type="text" v-model="username" class="form-control" id="username" required>
        </div>
        <div class="mb-3">
          <label for="email" class="form-label">Correo electrónico:</label>
          <input type="email" v-model="email" class="form-control" id="email" required>
        </div>
        <div class="mb-3">
          <label for="password" class="form-label">Contraseña:</label>
          <input type="password" v-model="password" class="form-control" id="password" required>
        </div>
        <button type="submit" class="btn btn-primary">Registrarse</button>
      </form>
    </div>
  </template>
  
  <script>
  export default {
    name:"FormRegistro",
    data() {
      return {
        username: '',
        email: '',
        password: ''
      }
    },
    methods: {
      submitForm() {
        // Aquí iría la lógica para enviar el formulario al servidor y registrar al usuario
      }
    }
  }
  </script>
  