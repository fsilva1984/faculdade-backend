package organizacao.tempeatura;

/*
 * Converter a temperatura celsius em fahrenheit
*/
public class Temperatura {
public static void main(String[] args) {
  
  // formula (F - 32) * 5/9 = C


  double fahrenheit = 104;

  double result = (fahrenheit - 32) * 5.0 / 9.0; 

  System.out.println(result+","+"Graus Celsius");
}
}