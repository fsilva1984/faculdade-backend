$(document).ready(function () {

  /*  no input foi adicionado um evento de tecla,
   qundo preciona e solta o evento e disparado,
   a funcao que entra em acao pega o valor do campo
   de input e o escreve no campo de texto selecionado.
  */ 
  $('input').keyup(function (e) {
    //outra opcao e.target.value
    const valText = $('input').val()

    if (valText.length == 0) {
      $('.container-txt h3').text('View You text here')
    } else {

      $('.container-txt h3').text(valText);
    }



  });

})