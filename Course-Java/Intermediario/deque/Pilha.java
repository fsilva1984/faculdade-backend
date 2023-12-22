package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		Deque<String> book = new ArrayDeque<>();
		
		// Metodos para adicionar elementos a pilha
		book.add("Biblia");
		book.push("Teologia");
		book.add("Saulo de Tarço");
		
		// se na pilha contem um determinado elemento
		System.out.println(book.contains("Teologia"));
		// se a pilha esta vazia
		System.out.println(book.isEmpty());
		// Tamanho da pilha
		System.out.println(book.size());
		
		// Limpa a pilha
		book.clear();
		
		System.out.printf("%s Limpo..", book);
		
	}
}
