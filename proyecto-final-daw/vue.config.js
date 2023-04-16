const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
})
module.exports = {
  publicPath: '/nexo/',
  devServer: {
    historyApiFallback: true,
  },
}