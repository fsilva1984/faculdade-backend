package scanner;

import java.util.Scanner;

public class Method_Scanner {

	public static void main(String[] args) {
		
		//Method de captura de entrada
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite Seu nome: ");
		String getName = entrada.nextLine();//devolve uma string
		
		System.out.println(getName);
		
		System.out.printf("Digite valor decimal: ");
		float numFloat = entrada.nextFloat();// devolve um float
		
		System.out.printf("Digite valor inteiro: ");
		int numInt = entrada.nextInt();//devolve um interio
		
		System.out.printf("Digite valor longo: ");
		double numLong = entrada.nextDouble();//devolve um valor long
		
		System.out.printf("Decimal: %.3f \n Valor Inteiro: %d \n Valor Grand: %f",
				numFloat, numInt, numLong);
		
		entrada.close();
		
		
		
		
		
	}
}
