package arraysList;

import java.util.ArrayList;
//import java.util.List;
public class ArrayListMethods {
	
	public static void main(String[] args) {
		
			ArrayList<Integer> num = new ArrayList<>();
			num.add(10);
			num.add(40);
			num.add(50);
			num.add(60);
			num.add(80);
			num.add(90);
			
			System.out.println(num);
			//metodo traz o indice do valor passado pro parametro
			System.out.println("60 esta no indice "+num.indexOf(60));
			//metodo traz o valor passado por parametro 
			System.out.println(num.get(0)+" no indice 0");
			// metodo adiciona respeitando a ordem de incersao
			System.out.println(num.add(100)+" foi adicionado");
			//remove o valor pertencente ao indice que recebe por parametro
			System.out.println(num.remove(2)+" foi removido");
			
			System.out.println(num);
	}
}
