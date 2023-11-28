package desafio_aritimetica;

public class Desafio_aritimetica {

	public static void main(String[] args) {
		
		/*
		 * ([6*(3+2)]^2/3*2 - ((1-5)*(2-7)/2)^2 ) ^3 / 10^3
		 *
		 * ##[  ##6*(3+2)##  ]^2## / 3*2
		 *
		 * ##( ##(1-5)## * ##(2-7)## ##/ 2##)^2##
		 *
		 *
		 *
		 * */
		
		var eqB01 = 1 - 5;
		var eqB02 = 2 - 7;
		var eqB03 = eqB01 * eqB02 / 2;
		var finalB = Math.pow(eqB03, 2);
		System.out.println(finalB);
		
		
		
		
		var eqA01 = 6*(3+2);
		var eqA02 = Math.pow(eqA01, 2);
		var finalA = eqA02 / 6;
		System.out.println(finalA);
		
		
		var rest = finalA - finalB;
		var restPow = Math.pow(rest, 3);
		var num = Math.pow(10, 3);
		
		
		System.out.println(restPow / num);
		/*
		 * 
		 * 
		 * var res = eqA - eqB;
		var pow1 = Math.pow(res, 3);
		var pow2 = Math.pow(10, 3);
		System.out.println(pow1 / pow2);
		
		 * 
		 * */
	}
}
