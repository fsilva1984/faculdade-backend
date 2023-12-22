package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		
		Queue<String> fila = new LinkedList<>();
		
		
		//metodo para adicionar elementos a fila
		fila.add("Joao");
		fila.add("Pedro");
		fila.add("Markes");
		fila.add("Genival");
		fila.add("Floresbela");
		
		
		/* melhor metodo para obter um elemento da fila
		 * poll */
		System.out.println(fila.poll());
		
		System.out.println(" ");
		
		for(String i: fila) {
			System.out.println(i);
		}
		
		// metodo limpa a fila
		fila.clear();
	}
}
