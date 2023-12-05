
$(function () {
  // area dos botoes
  $('button').addClass('btn');

  const colors = [
    '#0099ff',
    '#01ce01',
    '#ff0015',
    '#ff00aa',
    '#b700ff',
    '#6200ff',
    '#ffffff',
    '#00eeff',
    '#eeff00',
    '#ff7b00',
    '#ff3c00',
    '#3700ff'
  ]
  for (let i = 0; i < $('.bt-table-1').length; i++) {
    $('.bt-table-1')[i].style.backgroundColor = colors[i];
  }

  // Troca de cor da font
  for (let i = 0; i < $("table .bt-table-1").length; i++) {
    
    $('.bt-table-1')[i].addEventListener('click', () => { 
      console.log("Ok");
      $(".area-text").style.color = colors[i]
    })
    
  }

  // Botao maior
  for (let i = 0; i < $('.arco').length; i++) {
    $('.arco')[i].style.backgroundColor = colors[i]    
  }


  // area do text view
  const input = document.querySelector("input")
  input.addEventListener('keyup', e => {

    let txt = $('input').val()
    $('.area-text').html(txt);

    if (txt.length == 0) {
      $('.area-text').html('View Here You Text');
    }

  })



})


