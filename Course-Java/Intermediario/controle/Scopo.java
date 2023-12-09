package controle;

public class Scopo {
	
	public static void main(String[] args) {
		
		// declarando a variavel fora do for
		int i = 0;
		for(; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("Saiu do for");
		System.out.println(i);
		
		System.out.println("");
		for(int n = 10; n > 0; n--) {
			System.out.println(n);
		}
		System.out.println("");
		
		//
		int n = 30;
		System.out.println(n);
	}
}
