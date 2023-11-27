package organizacao.inferencia;


/*
 *  Inferencia no java.
 * podendo declarar o var e inicializalo com
 * qualquer valor, ponto decimal, inteiro, string, boolean,
 * o importante e declarar e inicializar na mesma linha, 
 * e depois de declarada nao tentar atribuir outro tipo
 * exemplo; se declarei var c = "string", nao posso
 * reatribuir outro tipo exemplo; c = 3.14159
*/
public class Inferencia {
  public static void main(String[] args) {
    
    var a = 39;
    var b = 18.051984;
    var name = "Flavio";

    System.out.println(name+"/"+a+"/"+b);

  }
}
