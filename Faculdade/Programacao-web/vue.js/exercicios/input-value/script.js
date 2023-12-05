


let num1 = Math.floor(Math.random() * (99 - 10) + 10)
let num2 = Math.floor(Math.random() * (99 - 10) + 10)
let index = Math.floor(Math.random() * (99 - 10) + 10) % 2 == 0
let i = 0
if (index != true) {
  i = 1
}
let arithmetc = ['-', '+']
const inputApp = {
  data() {
    return {
      n1: num1,
      n2: num2,
      idx: arithmetc[i]
    }
  }
}

Vue.createApp(inputApp).mount('#app')