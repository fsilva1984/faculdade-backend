package valor_referencia;

	
public class Trauma {
	
	/* se retirar o modificador static 
	 * do atributo int o 'a nao podera ser
	 * visto pela classe System */
	static int a = 3;
	
	int b = 5;
	
	public static void main(String[] args) {
		
		System.out.println(a);
		/*outra maneira de acessar a variaveis fora da 
		 *instancia seria */
		Trauma d = new Trauma();
		System.out.println(d.b);
	}
}
