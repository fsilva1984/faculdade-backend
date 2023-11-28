package desafio_scanner;

import java.util.Scanner;

/*
 * 	Neste desafio de usar o Scanner
 * 
 * */

public class Desafio_Scanner {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("informe os tres ultimos salarios %n%n");
		
		System.out.printf("Valor 1: ");
		String sal1 = entrada.nextLine();
		
		System.out.printf("Valor 2: ");
		String sal2 = entrada.nextLine();
		
		System.out.printf("Valor 3: ");
		String sal3 = entrada.nextLine();
		
		Double s1 = Double.parseDouble(sal1.replace(",", "."));
		Double s2 = Double.parseDouble(sal2.replace(",", "."));
		Double s3 = Double.parseDouble(sal3.replace(",", "."));
		
		Double calc = (s1 + s2 + s3) / 3;
		
		String result = String.format("Media salarial: %.3f", calc);
		System.out.println(result);
		
	}
}
