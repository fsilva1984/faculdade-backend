package controle;

import java.util.Scanner;
public class WhileCount {
	
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.printf("Number: ");
	Integer n = entrada.nextInt();
	
	int count = 1;
	while(count <= n) {
		System.out.println(count);
		count++;
	}
		
	System.out.println("");
	
	for(int i = 0; i < n; n--) {
		System.out.println(n);
	}

	entrada.close();
}
}
