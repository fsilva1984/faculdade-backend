package arraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArrayLists {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
			
		List<String> nome = new ArrayList<>();
		int n = 3;
		int i = 0;
		for(;i < n;i++) {
			System.out.printf("nome: ");
			String name = entrada.nextLine();
			nome.add(name);
		}
//		nome.add("Pedro");
//		nome.add("Miguel");
//		nome.add("Jaila");
//		nome.add("Maria");
		System.out.println("");
		
		for(String j: nome) {
			System.out.println(j);
		}
		
		entrada.close();
	}
}
