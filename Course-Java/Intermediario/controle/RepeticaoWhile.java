package controle;

import java.util.Scanner;

public class RepeticaoWhile {

	
	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		System.out.printf("Informe um numero para criara a tabuada%n");
		System.out.printf(": ");
		String whats = enter.nextLine();
		Integer num = Integer.valueOf(whats);
		int n = 1;
		
		
		
		while(n <= 10) {
			System.out.printf("%sX%d = %d \n",whats, n, num * n);
			n++;
		}
		
		enter.close();
	}
}
