
let h1 = new Vue({
  el: '#h1',
  data: {
    title: 'Veu.js Aula 001',
  }
})


let msg = new Vue({
  el: '#msg',
  data: {
    m: '',
  }
})


const bt = document.querySelector('#btn')
  .addEventListener('click', (e) => {
    e.stopPropagation()
    msg.m = "Hello World !!"

    setTimeout(() => { msg.m = "" }, 800)

  })



let txt = new Vue({
  el: '#txt',
  data: {
    texto: 'Search'
  }
})



let list = new Vue({
  el: '#list',
  data: {
    user: [
      { name: 'Antonio', lName: 'Silva', age: 35 },
      { name: 'Miguel', lName: 'Andre', age: 25 },
      { name: 'Leticia', lName: 'Spynner', age: 28 },
      { name: 'Andriel', lName: 'Martins', age: 55 },
      { name: 'Manuel', lName: 'Data', age: 34 },
      { name: 'Joice', lName: 'Gyfonn', age: 32 },
      { name: 'Lourenso', lName: 'Assicis', age: 45 },
    ],
  }
})



let placar = new Vue({
  el: '#placar',
  data: {
    n: 0,
    frase: 'Parabéns você atingio a pontuação desejada'
  }
})


let sum = new Vue({
  el: '#sum',
  data: {
    n1: 13,
    n2: 0,
    
  }
})


let button = new Vue({
  el: '#testBtn',
  data: {
    n: 0
  }
})
