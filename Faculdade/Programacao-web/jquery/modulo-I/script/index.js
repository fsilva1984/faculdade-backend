
// podemos escrever a ação do jquery de formas variadas.

// - 1
$( document ).ready(function reading() {
  console.log("Pagina carregada 1");
})
// - 2
$(function reading() {
  console.log("Pagina carregada 2");
});

// - 3
function reading(){
  console.log("Pagina Carregada 3")
}
$( document ).ready(reading)




$(function() {
  
  // adicionando um atributo source e um path para o elemento link 
  $('a').attr('href', 'https://www.youtube.com')

  // adicionando um atributo source e um path para a imagem
  $('img').attr('src', 'https://www.google.com.br/google.jpg')
  
  // atribuindo uma largura a um elemento
  $('img').attr('width', '50')

  // mudar o texto de um elemento
  $('h1').html('Your Text Color')


  // adicionando uma class css ao elemento button dentro de table
  $('table').find('button').addClass('btn')

  // mudando/pegando o conteudo do input 
  $('input').val('Your Text...')

  // inserindo algo depois de um elemento selecionado
  $(".youtube").after("<footer>...</footer>");

  // A mesma regra vale para o before
  $("").before("");

  // adicionando um elemento dentro de outro elemento selecionado
  $("#container-3").append("<h2>View Here You text</h2>");

  // com o prepende pode se adicionar um novo item acima do item que ja havia
  //dentro do elemento selecionado
  $('').prepend('');

  // remove um elemento selecionado
  $('').remove();

  // selecionando um elemento em especifico entre muitos do mesmo tipo
  $('button:eq(2)').addClass('bt')
  // outra maneira de fazer o mesmo e:
  $('button').eq(5).addClass('bt')


  const button = document.querySelectorAll('button')
  button[0].style.backgroundColor = "red"
  button[10].classList.add('bt')
  
  
  var btEnd = button.length - 1
  $('button').eq(btEnd).addClass('bt1')
})
