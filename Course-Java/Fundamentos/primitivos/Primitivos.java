package organizacao.primitivos;

public class Primitivos {
  /*
   * Java tem 8 tipos primitivos.
   * 1 - char = 1 caracter
   * 2 - boolean = true ou false
   * 3 - byte = 1 byte
   * 4 - short = 2 byte
   * 5 - int = 4 byte
   * 6 - long = 8 byte
   * 7 - float = 4 byte
   * 8 - bouble = 8 byte
   * 
   * Ref: bit e byte.
   * 
   * 1 byte pode armazenar de -128 ate +127 bit
   * 
   * importante saber que o java nao
   * enxerga o valor do dado e sim o tipo
   */
  public static void main(String[] args) {

    // Tipos inteiros
    byte anosDeImpresa = 56;
    short numeroDeVoos = 574;
    int id = 560978;
    /*
     *  O 'L' no final faz o java entender que tratace de um literal long 
    */
    long pontosAcumulados = 3_134_845_223L;

    // Tipos decimais

    /*
     *  O 'F' no final faz o java entender que tratace de um literal float 
    */
    float salarioAnual = 65_445.45F;
    double vendasRealizadas = 2_991_327_449.72;

    //Tipo boolean
    boolean staDeFerias = false;

    //Tipo caractere
    char status = 'A';// Ativo/Inativo

  }
}