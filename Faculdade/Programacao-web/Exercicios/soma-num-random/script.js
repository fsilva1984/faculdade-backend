
const display = document.querySelector("#panel")
const n1 = document.querySelector("#n1")
const n2 = document.querySelector("#n2")
const arithmetic = document.querySelector("#arithmetic")
const user = document.querySelector("#user")
const easy = document.querySelector("#easy")
const moderate = document.querySelector("#moderate")
const hard = document.querySelector("#hard")
const start = document.querySelector(".start")
const result = document.querySelector("#result")



// Operação a ser resolvida pelo usuario
function facilitation(min, max) {
  n1.innerHTML = parseInt(Math.random() * (max - min) + min)
  n2.innerHTML = parseInt(Math.random() * (max - min) + min)
}
function intermediary(min, max) {
  n1.innerHTML = parseInt(Math.random() * (65 - 10) +10)
  n2.innerHTML = parseInt(Math.random() * (max - min) + min)
}
function difficult(min, max) {
  n1.innerHTML = parseInt(Math.random() * (65 - 10) + 10)
  n2.innerHTML = parseInt(Math.random() * (max - min) + min)
}




// verifica se foi feita uma escolha de nivel do jogo
function choise() {
  if (arithmetic.textContent == '+') {
    facilitation(10, 65)
    time(10)
  } else if (arithmetic.textContent == '-') {
    intermediary(2, 10)
    time(10)
  } else if (arithmetic.textContent == 'x') {
    difficult(2, 9)
    time(15)
  } else if (arithmetic.textContent == '÷') {
    difficult(2, 5)
    time(15)
  } else {
    return
  }

}





// time para resposta
function time(x) {

  let seconds = 1

  const id = setInterval(() => {
    if (seconds <= x) {
      display.innerHTML = seconds++
    } else {
      avaliation()
      clearInterval(id)
    }
  }, 900);

}





// Mensagem parabenizar o usuario 
function msgUp() {
  const respPositive = ['Otimo!!', 'Bom Parabéns!', 'Na Mosca!!']
  let min = 0
  let max = 3
  const model = parseInt(Math.random() * (max - min) + min)
  return respPositive[model]
}
// Mensagem chama a atencao do usuario
function msgDown() {
  const respNegative = ['Uhm Não!', 'Não esta indo bem!', 'Se consentra!']
  let min = 0
  let max = 3
  const model = parseInt(Math.random() * (max - min) + min)
  return respNegative[model]
}









// avalia a resposta do usuario
function avaliation() {
  let resp = 0
  if (arithmetic.textContent == '+') {
    resp = parseInt(n1.textContent) + parseInt(n2.textContent)
  } else if (arithmetic.textContent == '-') {
    resp = parseInt(n1.textContent) - parseInt(n2.textContent)
  } else if (arithmetic.textContent == 'x') {
    resp = parseInt(n1.textContent) * parseInt(n2.textContent)
  } else if (arithmetic.textContent == '÷') {
    resp = parseInt(n1.textContent) / parseInt(n2.textContent)
  }

  if (parseInt(user.value) === resp) {
    result.textContent = `Resposta:${resp} ${msgUp()}`
  } else {
    result.textContent = `Resposta:${resp} ${msgDown()}`
  }
}




// niveis do jogo
easy.addEventListener('click', () => {
  arithmetic.textContent = '+'
})
moderate.addEventListener('click', () => {
  let min = 0
  let max = 7
  const model = parseInt(Math.random() * (max - min) + min)
  console.log(model);
  switch (model) {
    case 0:
    case 1:
    case 2:
    case 3:
      arithmetic.innerHTML = '+'
      break;

    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
      arithmetic.innerHTML = '-'
      break;
  }
})
hard.addEventListener('click', () => {
  let min = 0
  let max = 7
  const model = parseInt(Math.random() * (max - min) + min)
  console.log(model);
  switch (model) {
    case 0:
    case 1:
    case 2:
    case 3:
      arithmetic.innerHTML = 'x'
      break;

    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
      arithmetic.innerHTML = '÷'
      break;
  }
})




// iniciar o jogo
start.addEventListener('click', () => {

  user.value = ""
  user.focus()
  result.textContent = "Resultado..."
  choise()
})

















/*



function start(ciclo) {
  let i = 1

  const id = setInterval(() => {
    if (i <= parseInt(ciclo)) {
      rand(10, 65)
      time()
      console.log(i)
      i++
    } else {
      clearInterval(id)
    }
  }, 3500)

}


*/



