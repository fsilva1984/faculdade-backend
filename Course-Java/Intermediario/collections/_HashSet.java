package collections;

import java.util.HashSet;

public class _HashSet {
	
	/* HashSet trabalha de forma nao ordenada e desindexada
	 * ou seja, nao existe posibilidade de acessar um elemento por
	 * indice, seus elementos so serao ordenados atravez de metodos. */
	
	public static void main(String[] args) {
		/* Apesar do HashSet receber tipos variados
		 * o melhor forma de se trabalhar com o Set
		 * e de forma homogenia,
		 * o HashSet nao trabalha com tipos primitivos
		 * e sim com classes de primitivos ( wrappers )*/
		
		
		/* HashSet nao recebe valor duplicado */
		
		HashSet<String> colecao1 = new HashSet<String>();
		HashSet<String> colecao2 = new HashSet<String>();
		
		// metodo add, para adicionar valores ao HashSet
		colecao1.add("Buss");
		colecao1.add("Skate");
		colecao1.add("Bicycle");
		colecao1.add("Rollerblades");
		
		System.out.println(colecao1);
		
		// metodo para ver o tamanho do HashSet
		System.out.println(colecao1.size());
		
		//metodo para remover um valor do HashSet
		System.out.println(colecao1.remove("Rollerblades"));
		
		// saber se existe um determinado objeto dentro do HashSet
		System.out.println(colecao1.contains("Buss"));
		
		
		System.out.println(colecao1);
		
		colecao2.add("Veloz");
		colecao2.add("Mais Veloz");
		colecao2.add("Muito Veloz");
		
		// Juntando duas ou mais colecoes
		colecao1.addAll(colecao2);
		/* Semelhante ao addAll, tem o reatinAll
		 * mas pegara apenas os valores em comum. */
	
		System.out.println(colecao1);
		
	}

	
	
}
