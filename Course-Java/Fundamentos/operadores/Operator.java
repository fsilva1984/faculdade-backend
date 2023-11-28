package operadores;

/*
 * 	Operadores
 * 
 * 	Operador Unario quando o oparador tem apenas 1 operando
 * exemplo: var i = 1, i++, o i tem apenas um operando e sera
 * incrementado pelo operador.
 * 
 * 	Operador Binarioquando o operador tem dois operandos,
 * exemplo: 5 + 10, o operador tem dois operandos para realizar
 * o calculo.
 * 
 * 	 Operador Ternario
 * exemplo: y = (x == 20) ? 50 : 70;
 * o operando y ira receber o valor de x se ele for igual a 20, entao o operado ?
 * cerifica se y vale 50 ou 70.
 * 
 * 
 * 	Operadores Aritimeticos
 * 	+ adicao
 *  - subtracao
 *  / divisao
 *  * multiplicacao
 *  % resto da divisao
 *  
 *  
 *  Operadores Logicos
 *  
 *  end = &&
 *  or = ||
 *  xor = ^ exclusivo or
 *  not = !
 *  not not = !!
 *   
 *  Operadoress Relacionais
 *  
 *  igual: ==
 *  diferente: !=
 *  incremento: ++
 *  decremento: --
 *  maior que: >
 *  menor que: <
 *  maior igual: >=
 *  menor igual: <=
 *  
 * */

public class Operator {

	public static void main(String[] args) {
		
		/*
		 * Esta operacao podemos chamala de unario
		 * pois por ordem de presedencia a multiplicacao
		 * sera realizada primeiro,
		 * quanto a adicao e a subitracao a ordem e quem vem primeiro,
		 * 
		 * entao aqui sera realizada uma operacao por vez
		 * 
		 * */
		var result = 2 + 5 - 2 * 8;
		System.out.println(result);
		
		/* O operador pode vir 
		 * antes do operando: --1 decrementacao
		 * depois do operando: 1++ incrementacao
		 * e entre os operandos: 2+3 adicao
		 * */
		int a = 1;
		System.out.println(a++);// postfix
		int b = 2;
		System.out.println(--b);//prefix
		System.out.println(a+b);//infix
		
		int x = 8650;
		int y = 316;
		
		System.out.println(x / y);// divisao de inteiros = inteiros
		System.out.println(x / (double) y);//aqui teremos resultado com casas decimais.
		
		System.out.println(x % y);// resto da divisao
		
		int c = 13;
		int d = 7;
		var rest = (int) Math.pow(c, d);
		System.out.println(rest);// o resultado de Math.poe sera um float mas usaremos o CAST
		
		
		
	}
}







