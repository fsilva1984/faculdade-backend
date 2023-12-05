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

  // trabalhando a funcao dos botoes de cores
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


  $('.area-bt .bt1').each(function (a, b) {
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

        default:
          console.log('failure');
          break;
      }

    })
  })
  741

});


/*

  pegando o indice e o valor dos itens do array
 const arrBt = $('.area-bt .bt1')
  $.each(arrBt, function (a, b) {
    console.log(a);
  })




*/