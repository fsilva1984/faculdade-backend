$(document).ready(function () {

  /*  no input foi adicionado um evento de tecla,
   qundo preciona e solta o evento e disparado,
   a funcao que entra em acao pega o valor do campo
   de input e o escreve no campo de texto selecionado.
  */
  $('input').keyup(function (e) {

    // trabalhando a'rea do input

    //outra opcao e.target.value
    const valText = $('input').val()

    if (valText.length == 0) {
      $('.container-txt h3').text('View You text here')
    } else {

      $('.container-txt h3').text(valText);
    }
  });

  // trabalhando os botoes de cores
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

  // cor de cada botao
  $('.area-bt button').each(function (a, b) {
    $(b).css('background-color', colors[a])
  }) 


  $('.area-bt button').each(function (a, b) {
    $(this).click(function () {

      switch (a) {
        case 0:
          $('.container-txt h3').css('color', colors[a])
          break;
        case 1:
          $('.container-txt h3').css('color', colors[a])
          break;
        case 2:
          $('.container-txt h3').css('color', colors[a])
          break;
        case 3:
          $('.container-txt h3').css('color', colors[a])
          break;
        case 4:
          $('.container-txt h3').css('color', colors[a])
          break;
        case 5:
          $('.container-txt h3').css('color', colors[a])
          break;
        case 6:
          $('.container-txt h3').css('color', colors[a])
          break;
        case 7:
          $('.container-txt h3').css('color', colors[a])
          break;
        case 8:
          $('.container-txt h3').css('color', colors[a])
          break;
        case 9:
          $('.container-txt h3').css('color', colors[a])
          break;
        case 10:
          $('.container-txt h3').css('color', colors[a])
          break;
        case 11:
          $('.container-txt h3').css('color', colors[a])
          break;

      }

    })
  })


  // trabalhando os botoes das fonts

  const fonts = [
    " 'Rowdies',sans-serif ",
    " 'Amatic SC',sans-serif ",
    " 'Bebas Neue',sans-serif ",
    " 'Bree Serif',serif ",
    " 'Acme',sans-serif ",
    " 'Indie Flower',cursive ",
    " 'Playpen Sans',cursive ",
    " 'Lobster',sans-serif ",
    " 'Glass Antiqua',cursive ",
    " 'DM Serif Display',serif ",
    " 'Caveat',cursive ",
    " 'Josefin Sans',sans-serif ",
  ]

  $('.area-bt-2 button').each(function (a, b) {

    $(this).click(function () {


      switch (a) {
        case 0:
          $('.container-txt h3').css('font-family', fonts[a]);
          break;
        case 1:
          $('.container-txt h3').css('font-family', fonts[a]);
          break;
        case 2:
          $('.container-txt h3').css('font-family', fonts[a]);
          break;
        case 3:
          $('.container-txt h3').css('font-family', fonts[a]);
          break;
        case 4:
          $('.container-txt h3').css('font-family', fonts[a]);
          break;
        case 5:
          $('.container-txt h3').css('font-family', fonts[a]);
          break;
        case 6:
          $('.container-txt h3').css('font-family', fonts[a]);
          break;
        case 7:
          $('.container-txt h3').css('font-family', fonts[a]);
          break;
        case 8:
          $('.container-txt h3').css('font-family', fonts[a]);
          break;
        case 9:
          $('.container-txt h3').css('font-family', fonts[a]);
          break;
        case 10:
          $('.container-txt h3').css('font-family', fonts[a]);
          break;
        case 11:
          $('.container-txt h3').css('font-family', fonts[a]);
          break;

      }

    })
  })

  // trabalhando boteos de aumentar e diminuir as fonts
  $('.two-btn button').each(function (a, b) {
    $(this).click(function () {

      const px = parseFloat($('.container-txt h3').css('font-size'))

      if (a == 0) {
        
        if (px == 104) {
          return
        }
        $('.container-txt h3').css('font-size', px + 3.28)

        console.log(px);
      } else if (a == 1) {
        
        if (px == 8.88) {
          return
        }
        $('.container-txt h3').css('font-size', px - 3.28)
        console.log(px);
      }
    })
  })

});

/*

    objetos de valores
  $('p').css({ "color": "red", "font-size": "74px" })

  pegando o indice e o valor dos itens do array
 const arrBt = $('.area-bt .bt1')
  $.each(arrBt, function (a, b) {
    console.log(a);
  })




    const btFont = document.querySelectorAll('.area-bt-2 button')
  const txt = document.querySelector('.container-txt h3')
  btFont.forEach((i, index) => {
    i.addEventListener('click', () => {

      console.log(index, txt.classList.add('font-0'));
    })
  })


*/