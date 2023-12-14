package valor_referencia;

public class ValorReferenciaTest {
	/*
	 * Tipos primitivos tem uma copia do valor atrazes da atribuicao.
	 * Ja os objetos quando sao atribuidos um valor de outro objeto
	 * e criada uma referencia que aponta para o mesmo valor 
	 * que o primeiro objeto  
	 * */
	
	public static void main(String[] args) {
		int a = 23;
		int b = a;// foi criada uma copia do valo de a. 
		
		a++;
		b--;
		System.out.println(a);
		System.out.println(b);
		
		
		String d1 = ValorReferencia.Data(18, 05, 1985);
		
		/* foi criado uma referencia  apontando
		 * para o valor do objeto d1 */
		String d2 = d1;
		
		System.out.println(d1);
		System.out.println(d2);
	}
}

	
	
	 