package map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class Mapa {
	
	public static void main(String[] args) {
		Map<Integer, String> user = new HashMap<>();
		
		
		// Metodo que adiciona ou substitui um elemento
		user.put(1, "Carlos");
		user.put(2, "Gustavo");
		user.put(33, "Miguel");
		user.put(24, "Adriana");
		
		//  METODOS
		
		// se esta vazio
		System.out.println(user.isEmpty());
		
		// tamanho
		System.out.println(user.size());
		
		// saber quais sao as chaves
		System.out.println(user.keySet());
		
		// apenas os valores
		System.out.println(user.values());
		
		// chave valore
		System.out.println(user.entrySet());
		
		// saber se existe determinada chave
		System.out.println(user.containsKey(24));
		
		// saber se existe determinado valor
		System.out.println(user.containsValue("Marcos"));
		
		// obter um elemento atravez da chave
		System.out.println(user.get(33));
		
		
		// iterando chaves 
		for (Integer i: user.keySet()) {
			System.out.println(i);
		}
		
		// iterando valores
		for(String j: user.values()){
			System.out.println(j);
		}
		
		// iterando chave e valore
		for(Entry<Integer, String> entrada: user.entrySet()) {
			System.out.printf("%d => %s, ",entrada.getKey(), entrada.getValue());
		}
	}
}
