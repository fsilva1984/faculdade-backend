package isNull;

public class IsNullTest {
	public static void main(String[] args) {
/*	Variaveis de instancias, ou seja
 * variaveis que sao criadas nas classes recebem um valor padrao
 * como o int se nada for atribuido na sua criacao recebe 0 por default
 * o short o long e o byte recebem o mesmo
 * o float e o double recebem 0.0 e String recebe null */ 
		
		/* int a;
		// aqui ah um erro de compilacao
		// The local variable a may not have been initialized
		// variavel local nao foi inicializada
		
		//fora da instancia as variaveis devem ser inicializadas
		System.out.println(a); */
		
		IsNull defineValues = new IsNull();
		defineValues.formatValue(0, 0, null);
		
		
	/*	quando passo valores para esse metodo
	 * o seu construtor passa para o metodo formatValue
	 * porque a unica coisa que o metodo printValue faz 
	 * e chamar o construtor de formatValue */ 
		System.out.println(defineValues.printValues(8, 5.7, "Melo"));
		
	
		
		
		
		
		
		
	}
	
}
