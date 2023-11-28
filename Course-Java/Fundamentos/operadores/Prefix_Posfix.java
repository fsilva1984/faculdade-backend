package operadores;

public class Prefix_Posfix {

	
	public static void main(String[] args) {
		
		//Operadores Prefix
		var a = 1;
		var b = 2;
		/* Esta operacao sera verdadeira
		 * pois pela ordem de presedencia na forma prefix
		 * o operando sera modificado primeiro
		 * apos fazer a comparacao o operando b sera decrementado*/
		System.out.println(++a == b--);
		System.out.println(a);
		System.out.println(b);
		
		// Outra comparacao
		System.out.println(a-- == ++b);
		System.out.println(a);
		System.out.println(b);
	}		
}
