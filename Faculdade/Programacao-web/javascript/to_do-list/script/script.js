
const input = document.querySelector("#in-put")
const bt = document.querySelector("#bt")
const ul = document.querySelector("ul")

bt.addEventListener("click", () => {
  
  if (input.value == "") {
    return
  } else { 
    
    ul.innerHTML += `<li>
    <i class="fas fa-check-circle check"></i>
    <span class="tarefa">${input.value}</span>
    <i class="fa-solid fa-trash-can trash"></i>
    </li>`;
    
  }
  input.value = "";

  const trash = document.querySelectorAll(".trash")
  
  trash.forEach(i => {
    i.addEventListener('click', e => {
      e.target.parentElement.remove()
    })
  })

  const list = document.querySelectorAll("li")

  list.forEach(i => { 
    i.addEventListener('click', e => {


      e.target.parentElement.querySelector('.check').style.color = "#349223";
      e.target.classList.add('confirmed')
    })
  })





})



/*


trash.forEach((el) =>
  el.addEventListener('click', e => {
    console.log(e.target);
  })
);

const btns = document.querySelectorAll('.btn');

btns.forEach((btn) =>
  btn.addEventListener('click', (event) => {
    console.log(event.currentTarget.textContent);
  })
);

<button class="btn">Botão 1</button>
<button class="btn">Botão 2</button>
<button class="btn">Botão 3</button>

*/